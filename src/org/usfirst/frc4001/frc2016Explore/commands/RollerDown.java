package org.usfirst.frc4001.frc2016Explore.commands;

import org.usfirst.frc4001.frc2016Explore.Robot;
import org.usfirst.frc4001.frc2016Explore.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RollerDown extends Command {

    public RollerDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.roller);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("RollerDown Init");
    	//Robot.intake.down_roller();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("RollerDown execute");
    	Robot.roller.down_roller();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//System.out.println("RollerDown isFinished?");
    	//System.out.println(Robot.oi.axis_button.get());
        //return !Robot.oi.axis_button.get();
    	return !Robot.oi.game_controller.getRightTriggerClick().get();
    }

    // Called once after isFinished returns true
    protected void end() {
    	//System.out.println("RollerDown end");
    	Robot.roller.up_roller();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//System.out.println("RollerDown interrupted");
    	Robot.roller.up_roller();
    
    }
}
