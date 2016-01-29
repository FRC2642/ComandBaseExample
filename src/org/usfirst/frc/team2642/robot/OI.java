package org.usfirst.frc.team2642.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team2642.robot.commands.ExampleCommand;

/**
 * OI handles input from the user via joysticks and other controllers
 * 
 * @author Christian Colglazier
 *
 */
public class OI {
	public Joystick joystick1;
	public Joystick joystick2;
	
	public OI() {
		//Initialized joysticks to ports
		joystick1 = new Joystick(0);
		joystick2 = new Joystick(1);
	}
	
	public Joystick getJoystick1() {
		return joystick1;
	}
	
	public Joystick getJoystick2() {
		return joystick2;
	}
}

