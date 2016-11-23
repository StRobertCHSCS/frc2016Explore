package org.usfirst.frc4001.frc2016Explore.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4001.frc2016Explore.Robot;
import org.usfirst.frc4001.frc2016Explore.RobotMap;
import com.team4001.lib.util.*;

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
    	System.out.println("TARGET INIT");
    	if (isFinished()){
    		end();
    	}
    	SmartDashboard.putString(DashboardLabels.str_TARGET_LOCKED, "Seeking ...");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("TARGET EXEC");
    	SmartDashboard.putBoolean("PIXY_TURNLEFT", RobotMap.pixy.turnLeft());
    	SmartDashboard.putBoolean("PIXY_TURNRIGHT", RobotMap.pixy.turnRight());
    	RobotMap.pixy.printState();
    	
    	if (RobotMap.pixy.turnLeft()){
    		System.out.println("turn left");
    		SmartDashboard.putString(DashboardLabels.str_TARGET_LOCKED, "Found - turn left");
    		if (RobotMap.pixy.fastX()){
    			Robot.driver.pivotLeft(0.25);
    		}else{
    			Robot.driver.pivotLeft(0.25);
    		}
    	}else if (RobotMap.pixy.turnRight()){
    		System.out.println("turn right");
    		SmartDashboard.putString(DashboardLabels.str_TARGET_LOCKED, "Found - turn right");
    		if (RobotMap.pixy.fastX()){
    			Robot.driver.pivotRight(0.25);
    		}else{
    			Robot.driver.pivotRight(0.25);
    		}
    	}else
    	{
    		SmartDashboard.putString(DashboardLabels.str_TARGET_LOCKED, "Locked");
    		Robot.driver.hardStop();
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return RobotMap.pixy.noTarget() || RobotMap.pixy.targetLock();
    	return RobotMap.pixy.targetLock();
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("END");
    	if (RobotMap.pixy.targetLock()){
    		SmartDashboard.putBoolean("PIXY_TURNLEFT", RobotMap.pixy.turnLeft());
        	SmartDashboard.putBoolean("PIXY_TURNRIGHT", RobotMap.pixy.turnRight());
    		// post to dashboard
    		SmartDashboard.putString(DashboardLabels.str_TARGET_LOCKED, "Locked");
    	}else{
    		SmartDashboard.putString(DashboardLabels.str_TARGET_LOCKED, " ");
    	}
    	//Robot.driver.hardStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
