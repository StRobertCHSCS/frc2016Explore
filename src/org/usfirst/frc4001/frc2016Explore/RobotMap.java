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
    public static Solenoid intakerollopen;
    public static Solenoid intakerollclose;
    

    public static void init() {
        // Instantiate raw mappings of components
    	
    	// INTAKE COMPONENTS
        intakelimitSwitch = new DigitalInput(9);
        LiveWindow.addActuator("Intake", "limitSwitch", intakelimitSwitch);
        
        intakecontroller = new CANTalon(19);
        LiveWindow.addActuator("Intake", "controller", intakecontroller);
        
        intakerollopen = new Solenoid(0);
        intakerollclose = new Solenoid(1);
    }
}