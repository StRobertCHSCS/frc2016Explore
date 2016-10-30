package org.usfirst.frc4001.frc2016Explore.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4001.frc2016Explore.Robot;
import org.usfirst.frc4001.frc2016Explore.subsystems.DriveTrain;;

/**
 *
 */
public class ArcadeDrive extends Command {

    public ArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driver);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//double moveforward = Robot.oi.game_controller.getRawAxis(1);
    	double moveforward = Robot.oi.game_controller.getLeftY();
    	//double turn = Robot.oi.game_controller.getRawAxis(4);
    	double turn = Robot.oi.game_controller.getRightX();
    	Robot.driver.arcadeDrive(moveforward, turn);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driver.hardStop();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
