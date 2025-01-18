// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.vision;

import static edu.wpi.first.units.Units.Radians;

import org.photonvision.PhotonPoseEstimator.PoseStrategy;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;

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
        public static final Transform3d[] CameraTransforms = new Transform3d[] {
            new Transform3d(new Translation3d(0.1, -1, 0.5), new Rotation3d(0,Units.degreesToRadians(-15),Units.degreesToRadians(-15))),
            new Transform3d(new Translation3d(0.1, 1, 0.5), new Rotation3d(0,Units.degreesToRadians(-15),Units.degreesToRadians(15))),
            new Transform3d(new Translation3d(-0.5, 0, 0.5), new Rotation3d(0,Units.degreesToRadians(-15),0)),
        };
        public static final PoseStrategy strategy = PoseStrategy.CLOSEST_TO_REFERENCE_POSE;
    }
}
