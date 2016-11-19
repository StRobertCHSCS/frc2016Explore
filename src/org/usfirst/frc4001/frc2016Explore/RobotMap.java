// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4001.frc2016Explore;

import com.team4001.lib.util.*;

// Import libraries for components
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;


import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
    // declare raw component variables
    public static DigitalInput intakelimitSwitch;
    public static CANTalon intakecontroller;
    public static Solenoid roller_rollup;
    public static Solenoid roller_rolldown;
    public static CANTalon rear_left_motor;
    public static CANTalon rear_right_motor;
    public static CANTalon front_left_motor;
    public static CANTalon front_right_motor;
    public static CANTalon highshoot_motor;
    public static PixyPort pixy;
    


    public static void init() {
        // Instantiate raw mappings of components
    	
    	// INTAKE COMPONENTS
        intakelimitSwitch = new DigitalInput(SystemsMap.DIO_INTAKE_LIMITSWITCH);
        LiveWindow.addActuator("Intake", "limitSwitch", intakelimitSwitch);
        
        intakecontroller = new CANTalon(SystemsMap.CAN_INTAKE_MOTOR);
        LiveWindow.addActuator("Intake", "controller", intakecontroller);
        
        //Roller
        roller_rolldown = new Solenoid(SystemsMap.SOLENOID_ROLLER_DOWN);
        roller_rollup = new Solenoid(SystemsMap.SOLENOID_ROLLER_UP);
        LiveWindow.addActuator("Roller", "roller_up", roller_rollup);
        LiveWindow.addActuator("Roller", "roller_down", roller_rolldown);
        
        // Drive Train
        rear_left_motor = new CANTalon(SystemsMap.CAN_DRIVETRAIN_REAR_LEFT);
        rear_right_motor = new CANTalon(SystemsMap.CAN_DRIVETRAIN_REAR_RIGHT);
        front_left_motor = new CANTalon(SystemsMap.CAN_DRIVETRAIN_FRONT_LEFT);
        front_right_motor = new CANTalon(SystemsMap.CAN_DRIVETRAIN_FRONT_RIGHT);
        
        rear_left_motor.setInverted(true);
        front_left_motor.setInverted(true);
        rear_right_motor.setInverted(true);
        front_right_motor.setInverted(true);
        
        // High Shooter
        highshoot_motor = new CANTalon(SystemsMap.CAN_HIGHSHOOTER);
        
        //init pixy object
        pixy = new PixyPort();
        
        
    }
}
