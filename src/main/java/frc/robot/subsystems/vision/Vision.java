// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.vision;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.vision.io.VisionIO_REAL;
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
        io = new VisionIO_REAL();
        break;
      case REPLAY:
        io = new VisionIO_SIM();
        break;
    }
  }

  public Pose2d[] getVisionMeasurements() {
    return io.getMeasurements();
  }

  public void update(Pose2d pose) {
    io.update(pose);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
