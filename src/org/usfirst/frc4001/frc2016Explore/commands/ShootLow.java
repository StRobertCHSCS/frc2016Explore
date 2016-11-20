package org.usfirst.frc4001.frc2016Explore.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4001.frc2016Explore.Robot;
import com.team4001.lib.util.*;


/**
 *
 */
public class ShootLow extends Command {

    public ShootLow() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Shooting Low");
    	
    	//If the ball is not in position, end the command
    	if (!Robot.intake.ballset()){
    		end();
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.lowfire();
    	SmartDashboard.putBoolean(DashboardLabels.bool_LOWFIRE, true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	SmartDashboard.putBoolean(DashboardLabels.bool_LOWFIRE,false);
    	Robot.intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
