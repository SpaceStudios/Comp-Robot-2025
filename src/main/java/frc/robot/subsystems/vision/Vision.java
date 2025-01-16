// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.vision;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.vision.io.VisionIO_SIM;

public class Vision extends SubsystemBase {
  /** Creates a new Vision. */
  VisionIO io;
  public Vision() {
    switch (Constants.currentMode) {
      case SIM:
        io = new VisionIO_SIM();
        break;
      case REAL:

        break;
      case REPLAY:

        break;
    }
  }

  public Pose2d[] getVisionMeasurements() {
    return new Pose2d[4];
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
