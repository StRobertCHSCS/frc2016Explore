package com.team4001.lib.util;
import edu.wpi.first.wpilibj.DigitalInput;


public class PixyPort {
	private DigitalInput di_turnLeft;
	private DigitalInput di_turnRight;
	private DigitalInput di_headUp;
	private DigitalInput di_headDown;
	private DigitalInput di_fastX;
	private DigitalInput di_fastY;
	
	public PixyPort(){
		di_turnLeft = new DigitalInput(SystemsMap.TARGETING_TURN_LEFT);
		di_turnRight = new DigitalInput(SystemsMap.TARGETING_TURN_RIGHT);
		di_headUp = new DigitalInput(SystemsMap.TARGETING_HEAD_UP);
		di_headDown = new DigitalInput(SystemsMap.TARGETING_HEAD_DOWN);
		di_fastX = new DigitalInput(SystemsMap.TARGETING_FAST_X);
		di_fastY = new DigitalInput(SystemsMap.TARGETING_FAST_Y);
	}
	
	public boolean turnLeft(){
		return di_turnLeft.get();
	}
	
	public boolean turnRight(){
		return di_turnRight.get();
	}
	
	public boolean headUp(){
		return di_headUp.get();
	}
	
	public boolean headDown(){
		return di_headDown.get();
	}
	
	public boolean fastX(){
		return di_fastX.get();
	}
	
	public boolean fastY(){
		return di_fastY.get();
	}
	
	public boolean noTarget(){
		return !(turnRight() || turnLeft());
	}
	
	public boolean targetLock(){
		return turnRight() && turnLeft();
	}

}
