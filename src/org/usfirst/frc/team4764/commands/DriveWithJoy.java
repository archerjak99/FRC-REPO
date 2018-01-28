package org.usfirst.frc.team4764.commands;

import org.usfirst.frc.team4764.robot.OI;
import org.usfirst.frc.team4764.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoy extends Command
{
//	double rightStickYValue = Robot.OperatorInput.getRightStickY();
//	double leftStickXValue = Robot.OperatorInput.getLeftStickX();

//	double leftStickYValue = Robot.OperatorInput.getLeftStickY();

	public DriveWithJoy() 
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);

	}

	// Called just before this Command runs the first time
	protected void initialize()
	{

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{

//		leftStickXValue = Robot.OperatorInput.getLeftStickX();
//		rightStickYValue = Robot.OperatorInput.getRightStickY();

//		Robot.driveTrain.driveByTank(-Robot.m_oi.getLeftStickY(), Robot.m_oi.getRightStickY());
//		Robot.driveTrain.driveByTank(-leftStickYValue, rightStickYValue);
		Robot.driveTrain.driveByArcade(Robot.OperatorInput.getRightStickY(), -Robot.OperatorInput.getLeftStickX());	
//		Robot.driveTrain.driveByArcade(rightStickYValue, -leftStickXValue);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() 
	{
		return false;
	}

	// Called once after isFinished returns true
	protected void end()
	{
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
	}


}