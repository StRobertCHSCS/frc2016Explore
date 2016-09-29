package org.usfirst.frc4001.frc2016Explore.subsystems;

import org.usfirst.frc4001.frc2016Explore.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Roller extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final Solenoid roller_up = RobotMap.roller_rollup;
    private final Solenoid roller_down = RobotMap.roller_rolldown;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void up_roller(){
    	// open the roller
    	roller_up.set(true);
    	roller_down.set(false);

    }
    
    public void down_roller(){
    	// close the roller
    	roller_up.set(false);
    	roller_down.set(true);
 
    }
}

