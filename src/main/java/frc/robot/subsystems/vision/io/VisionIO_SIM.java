// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.vision.io;

import edu.wpi.first.math.geometry.Pose2d;
import frc.robot.subsystems.vision.VisionIO;

/** Add your docs here. */
public class VisionIO_SIM implements VisionIO {

    @Override
    public Pose2d[] getMeasurements() {
        return new Pose2d[4];
    }}
