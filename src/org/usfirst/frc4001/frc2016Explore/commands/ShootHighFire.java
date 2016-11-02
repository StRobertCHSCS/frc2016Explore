package org.usfirst.frc4001.frc2016Explore.commands;

import org.usfirst.frc4001.frc2016Explore.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootHighFire extends Command {

    public ShootHighFire() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//requires(Robot.shooter);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
      	if (!Robot.intake.ballset()){
    		end();
    	}	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.highfire();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return Robot.intake.ballset();
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
