package org.usfirst.frc4001.frc2016Explore.subsystems;

import org.usfirst.frc4001.frc2016Explore.Robot;
import org.usfirst.frc4001.frc2016Explore.RobotMap;
import org.usfirst.frc4001.frc2016Explore.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
	import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class Intake extends Subsystem {

    private final DigitalInput limitSwitch = RobotMap.intakelimitSwitch;
    private final CANTalon controller = RobotMap.intakecontroller;
    


    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void receive(){
    	// roll in the ball
    	controller.set(0.3);
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
    	boolean isballset = !limitSwitch.get();
    	//SmartDashboard.putBoolean("Ball in Position", isballset);
    	return isballset;
    }
    


    	
    
}

