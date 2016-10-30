package org.usfirst.frc4001.frc2016Explore.subsystems;

import org.usfirst.frc4001.frc2016Explore.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4001.frc2016Explore.commands.ArcadeDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final CANTalon leftMotor = RobotMap.left_motor;
	private final CANTalon rightMotor = RobotMap.right_motor;
	private final RobotDrive drive = new RobotDrive(leftMotor, rightMotor);
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDrive());
    }
    
    
    public void arcadeDrive(double forward, double turn){
    	drive.arcadeDrive(forward, turn);

    }
    
    public void hardStop(){
    	leftMotor.set(0);
    	rightMotor.set(0);
    }
    
    
    
    
    
}

