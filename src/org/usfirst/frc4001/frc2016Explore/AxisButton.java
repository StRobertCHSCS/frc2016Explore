package org.usfirst.frc4001.frc2016Explore;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.Joystick;

public class AxisButton extends Button {
	
	public Joystick joystick;
	public int joystick_axis;
	
	public AxisButton(Joystick controller, int axis){
		joystick = controller;
		joystick_axis = axis;
				
	}
	
	public boolean get(){
		return joystick.getRawAxis(joystick_axis) > 0;
	}
	
	
}
