package org.usfirst.frc4001.frc2016Explore.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4001.frc2016Explore.Robot;

/**
 *
 */
public class ShootHighPrep extends Command {

    public ShootHighPrep() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Shooting High");
    	
    	//If the ball is not in position, end the command
    	if (!Robot.intake.ballset()){
    		end();
    	}
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.prep();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
