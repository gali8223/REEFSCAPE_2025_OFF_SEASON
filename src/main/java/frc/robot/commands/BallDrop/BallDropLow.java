// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.BallDrop.BallDrop;
import frc.robot.subsystems.BallDrop.BallDropConstants;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class BallDropLow extends Command {
  BallDrop ballDrop;
  public BallDropLow(BallDrop ballDrop) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.ballDrop = ballDrop;
    addRequirements(ballDrop);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    ballDrop.SetAngle(BallDropConstants.ANGLE_TO_REACH_LOW);
    ballDrop.SetVoltageWheel(BallDropConstants.POWER_TO_REACH);
  }



  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    ballDrop.SetAngle(BallDropConstants.ANGLE_TO_RESET);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return Math.abs(BallDropConstants.ANGLE_TO_REACH_LOW - ballDrop.GetAngle()) < BallDropConstants.ANGLE_TOLERANCE;
  }
}
