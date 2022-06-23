// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import static lib.Romi.driveTime;
import static lib.Romi.turnTime;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    // Write your code here:
    double rightSpeed = 1.0;
    double rightSeconds90 = 1.0;
    double leftSpeed = -1.0;
    double leftSeconds90 = 1.0;

    
    driveTime(1, 2); //drive up
    turnTime(1, 1); //90 right
    driveTime(1, 1); //drive right
    turnTime(1, 1); //90 right
    driveTime(1, 1); //drive down
    turnTime(1, 1); //90 right
    driveTime(1, 1); //drive left
    turnTime(-1, 1); //90 left
    driveTime(1, 1); //drive down
    sleepSeconds(2.0);
    driveTime(1, .5); //drive down
  }
}
