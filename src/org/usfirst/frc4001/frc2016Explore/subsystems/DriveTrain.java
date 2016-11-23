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
	private final CANTalon frontLeftMotor = RobotMap.front_left_motor;
	private final CANTalon rearLeftMotor = RobotMap.rear_left_motor;
	private final CANTalon frontRightMotor = RobotMap.front_right_motor;
	private final CANTalon rearRightMotor = RobotMap.rear_right_motor;
	
	private final RobotDrive drive = new RobotDrive(frontLeftMotor, rearLeftMotor,frontRightMotor , rearRightMotor);
	
	public DriveTrain(){
		drive.setSafetyEnabled(false);
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDrive());
    }
    
    
    public void arcadeDrive(double forward, double turn){

    	drive.arcadeDrive(forward, turn,false);

    }
    
    public void runLeftDrive(double power)
    {
    	this.frontLeftMotor.set(power);
    	this.rearLeftMotor.set(power);
    }
    
    public void runRightDrive(double power)
    {
    	this.frontRightMotor.set(power);
    	this.rearRightMotor.set(power);
    }
    
    public void pivotLeft(double speed){
    	System.out.println("pivoting left");
    	System.out.println(speed);
    	//drive.arcadeDrive(0,-speed, true);
    	runLeftDrive(speed);
    	runRightDrive(speed);
    }
    
    public void pivotRight(double speed){
    	System.out.println("pivoting right");
    	System.out.println(speed);
    	//drive.arcadeDrive(0,speed, true);
    	runLeftDrive(-1*speed);
    	runRightDrive(-1*speed);
    }
    
    public void hardStop(){
    	drive.arcadeDrive(0, 0);
    }
    
    
    
    
    
}

