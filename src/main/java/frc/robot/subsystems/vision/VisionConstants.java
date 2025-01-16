// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.vision;

import org.photonvision.PhotonPoseEstimator.PoseStrategy;

import edu.wpi.first.math.geometry.Transform3d;

/** Add your docs here. */
public class VisionConstants {
    public class SimConstants {
        
    }
    public class GeneralConstants {
        public static final String[] CameraIDs = new String[] {
            "Camera1",
            "Camera2",
            "Camera3"
        };
        public static final Transform3d[] CameraTransforms = new Transform3d[] {new Transform3d()};
        public static final PoseStrategy strategy = PoseStrategy.LOWEST_AMBIGUITY;
    }
}
