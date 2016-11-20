package com.team4001.lib.util;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/*
 * Contains
*/
public class Extreme3DPro extends Joystick{
	
	private static final int STICK_AXIS_TRIGGER = 1;
	private static final int STICK_BUTTON_THUMB = 2;
	private static final int STICK_BUTTON_LEFT_LOWER = 3;
	private static final int STICK_BUTTON_RIGHT_LOWER = 4;
	
	

	public Extreme3DPro(int joystickport) {
		super(joystickport);
	}
	
	// GET INSTANCE METHODS	
	public JoystickButton getStickTriggerButton(){
		return new JoystickButton(this, STICK_AXIS_TRIGGER);
	}
	
	public JoystickButton getStickButton_Thumb(){
		return new JoystickButton(this, STICK_BUTTON_THUMB);
	}
	
	public JoystickButton getStickButton_leftLower(){
		return new JoystickButton(this, STICK_BUTTON_LEFT_LOWER);
	}
	
	public JoystickButton getStickButton_rightLower(){
		return new JoystickButton(this, STICK_BUTTON_RIGHT_LOWER);
	}
	
	// GET STATE METHODS
	public boolean getButtonState_Stick_Thumb(){
		return getRawButton(STICK_BUTTON_THUMB);
	}
	
	public boolean getButtonState_Stick_LeftLower(){
		return getRawButton(STICK_BUTTON_LEFT_LOWER);
	}
	
	public boolean getButtonState_Stick_RightLower(){
		return getRawButton(STICK_BUTTON_RIGHT_LOWER);
	}

}
