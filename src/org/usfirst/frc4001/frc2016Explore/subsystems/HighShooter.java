package org.usfirst.frc4001.frc2016Explore.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.team4001.lib.util.SystemsMap;
import org.usfirst.frc4001.frc2016Explore.RobotMap;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;

/**
 *
 */
public class HighShooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final CANTalon shooter = RobotMap.highshoot_motor;

	
	
	public HighShooter(){
		super();
		shooter.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		shooter.reverseSensor(false);
		 /* set the peak and nominal outputs, 12V means full */
        shooter.configNominalOutputVoltage(+0.0f, -0.0f);
        shooter.configPeakOutputVoltage(+12.0f, 0.0f);
		
        shooter.setProfile(0);
        shooter.setF(0.1097);
        shooter.setP(0.22);
        shooter.setI(0); 
        shooter.setD(0);
        
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void prep(){
    	//shooter.changeControlMode(TalonControlMode.Speed);
    	
    	double targetSpeed = SystemsMap.HIGHSHOOTER_SPEED; /* 1500 RPM in either direction */
    	shooter.changeControlMode(TalonControlMode.Speed);
    	shooter.set(targetSpeed);
    }
    
    public void stop(){
    	shooter.set(0);
    }
  
}

