// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.vision.io;

import java.util.List;
import java.util.Optional;

import org.photonvision.EstimatedRobotPose;
import org.photonvision.PhotonCamera;
import org.photonvision.PhotonPoseEstimator;
import org.photonvision.targeting.PhotonPipelineResult;

import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Pose2d;
import frc.robot.subsystems.vision.VisionIO;
import frc.robot.subsystems.vision.VisionConstants.GeneralConstants;

/** Add your docs here. */
public class VisionIO_REAL implements VisionIO {
    PhotonCamera[] cameras;
    PhotonPoseEstimator[] poseEstimators;
    public VisionIO_REAL() {
        cameras = new PhotonCamera[GeneralConstants.CameraIDs.length];
        poseEstimators = new PhotonPoseEstimator[cameras.length];
        for (int i=0; i < cameras.length - 1; i++) {
            cameras[i] = new PhotonCamera(GeneralConstants.CameraIDs[i]);
            poseEstimators[i] = new PhotonPoseEstimator(AprilTagFieldLayout.loadField(AprilTagFields.kDefaultField), GeneralConstants.strategy, GeneralConstants.CameraTransforms[i]);
        }
    }

    private Pose2d getCameraMeasurement(PhotonCamera camera, PhotonPoseEstimator poseEstimator) {
        List<PhotonPipelineResult> pipelineResults = camera.getAllUnreadResults();
        if (pipelineResults.size() > 0) {
            Optional <EstimatedRobotPose> estimatedPose = poseEstimator.update(pipelineResults.get(0));
            if (estimatedPose.isPresent()) {
                return estimatedPose.get().estimatedPose.toPose2d();
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public Pose2d[] getMeasurements() {
        Pose2d[] visionMeasurement = new Pose2d[cameras.length];
        for (int i=0; i < cameras.length - 1; i++) {
            visionMeasurement[i] = getCameraMeasurement(cameras[i], poseEstimators[i]);
        }
        return visionMeasurement;
    }

}
