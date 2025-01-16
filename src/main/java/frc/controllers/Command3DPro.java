// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.controllers;

import edu.wpi.first.wpilibj.Joystick;

/** Add your docs here. */
public class Command3DPro {
  private Joystick joystick;

  public Command3DPro(int port) {
    joystick = new Joystick(1);
  }

  public double getThrottleAxis() {
    return joystick.getRawAxis(4);
  }

  public double getPitchxis() {
    return joystick.getRawAxis(1);
  }

  public double getYawAxis() {
    return joystick.getRawAxis(2);
  }

  public double getRollAxis() {
    return joystick.getRawAxis(0);
  }
}
