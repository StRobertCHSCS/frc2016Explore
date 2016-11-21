package org.usfirst.frc4001.frc2016Explore.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4001.frc2016Explore.Robot;
import org.usfirst.frc4001.frc2016Explore.RobotMap;

/**
 *
 */
public class LockTarget extends Command {

    public LockTarget() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driver);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (isFinished()){
    		end();
    	}
    	SmartDashboard.putString("  Target Lock  ", "Seeking");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	
    	if (RobotMap.pixy.turnLeft()){
    		if (RobotMap.pixy.fastX()){
    			Robot.driver.pivotLeft(0.3);
    		}else{
    			Robot.driver.pivotLeft(0.1);
    		}
    	}else if (RobotMap.pixy.turnRight()){
    		if (RobotMap.pixy.fastX()){
    			Robot.driver.pivotRight(0.3);
    		}else{
    			Robot.driver.pivotRight(0.1);
    		}
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return RobotMap.pixy.noTarget() || RobotMap.pixy.targetLock();
    }

    // Called once after isFinished returns true
    protected void end() {
    	if (RobotMap.pixy.targetLock()){
    		// post to dashboard
    		System.out.println("Target Lock");
    	}
    	Robot.driver.hardStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
