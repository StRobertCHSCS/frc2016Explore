package org.usfirst.frc4001.frc2016Explore.subsystems;

import org.usfirst.frc4001.frc2016Explore.RobotMap;
import org.usfirst.frc4001.frc2016Explore.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
	import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Intake extends Subsystem {

    private final DigitalInput limitSwitch = RobotMap.intakelimitSwitch;
    private final CANTalon controller = RobotMap.intakecontroller;
    private final Solenoid roller_up = RobotMap.intakerollup;
    private final Solenoid roller_down = RobotMap.intakerolldown;


    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void receive(){
    	// roll in the ball
    	controller.set(0.5);
    }
    
    public void stop(){
    	// halt movement of intake
    	controller.set(0);
    }
    
    public void eject(){
    	// eject the ball at half speed
    	controller.set(-0.5);
    }
    
    public void fire(){
    	// eject the ball at full speed
    	controller.set(-1);
    }
    
    public boolean ballset(){
    	// ball is set in position
    	return !(limitSwitch.get());
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

