// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc319.BobBAE2013;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc319.BobBAE2013.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton shooterAButton;
    public JoystickButton shooterBButton;
    public JoystickButton shooterXButton;
    public JoystickButton shooterYButton;
    public JoystickButton shooterLeftBumper;
    public JoystickButton shooterRightBumper;
    public JoystickButton shooterBackButton;
    public JoystickButton shooterStartButton;
    public JoystickButton shooterLeftStickPress;
    public JoystickButton shooterRightStickPress;
    
    public JoystickButton driverAButton;
    public JoystickButton driverBButton;
    public JoystickButton driverXButton;
    public JoystickButton driverYButton;
    public JoystickButton driverLeftBumper;
    public JoystickButton driverRightBumper;
    public JoystickButton driverBackButton;
    public JoystickButton driverStartButton;
    public JoystickButton driverLeftStickPress;
    public JoystickButton driverRightStickPress;
    public Joystick driverController;
    public Joystick shooterController;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterController = new Joystick(2);
        
        driverController = new Joystick(1);
        
//-------------------------------DRIVER CONTROL--------------------------------
        //driverStartButton = new JoystickButton(driverController, 8);
        //driverStartButton.whenPressed(new InitializeClimb());
        
        driverAButton = new JoystickButton(driverController, 1);
        driverAButton.whenPressed(new LockRetract());
        
        driverBButton = new JoystickButton(driverController, 2);
        driverBButton.whenPressed(new LockExtend());
        
        //driverXButton = new JoystickButton(driverController, 3);
        //driverXButton.whenPressed(new PrepareToHookSecondLevel());
        
        //driverYButton = new JoystickButton(driverController, 4);
        //driverYButton.whenPressed(new GoToSecondLevelHookHeight());
        
        //driverLeftBumper = new JoystickButton(driverController, 5);
        //driverLeftBumper.whenPressed(new EngageSecondLevel());
        
       // driverBackButton = new JoystickButton(driverController, 7);//-Reset line up
        //driverBackButton.whenPressed(new GoToFirstLevelLineUpHeight());
    
//-----------------------------SHOOTER CONTROL-------------------------------------
        shooterAButton = new JoystickButton(shooterController, 1);//-Fire
        shooterAButton.whenPressed(new Fire());
        
        shooterBackButton = new JoystickButton(shooterController, 7);//-Emergency Fire
        shooterBackButton.whileHeld(new TriggerRetract());
        
        shooterLeftBumper = new JoystickButton(shooterController, 5);//-Wheels On
        shooterLeftBumper.whenPressed(new WheelsOn());
        
        shooterRightBumper = new JoystickButton(shooterController, 6);//-Wheels Off
        shooterRightBumper.whenPressed(new WheelsOff());   
        
        //shooterStartButton = new JoystickButton(shooterController, 8);//-Dump
        //shooterStartButton.whenPressed(new TrapdoorRetract());
        
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("TriggerExtend", new TriggerExtend());
        SmartDashboard.putData("TriggerRetract", new TriggerRetract());
        SmartDashboard.putData("FeederExtend", new FeederExtend());
        SmartDashboard.putData("FeederRetract", new FeederRetract());
        SmartDashboard.putData("WheelsOn", new WheelsOn());
        SmartDashboard.putData("WheelsOff", new WheelsOff());
        SmartDashboard.putData("ArmRetract", new ArmRetract());
        SmartDashboard.putData("ArmExtend", new ArmExtend());
        SmartDashboard.putData("WheelExtend", new WheelExtend());
        SmartDashboard.putData("WheelRetract", new WheelRetract());
        SmartDashboard.putData("LockExtend", new LockExtend());
        SmartDashboard.putData("LockRetract", new LockRetract());
        SmartDashboard.putData("TrapdoorExtend", new TrapdoorExtend());
        SmartDashboard.putData("TrapdoorRetract", new TrapdoorRetract());
        SmartDashboard.putData("GoToFirstLevelLineUpHeight", new GoToFirstLevelLineUpHeight());
        SmartDashboard.putData("GoToFirstLevelLockHeight", new GoToFirstLevelLockHeight());
        SmartDashboard.putData("GoToSecondLevelLineUpHeight", new GoToSecondLevelLineUpHeight());
        SmartDashboard.putData("GoToSecondLevelHookHeight", new GoToSecondLevelHookHeight());
        SmartDashboard.putData("GoToLockHeight", new GoToLockHeight());
        SmartDashboard.putData("GoMiddleHeight", new GoMiddleHeight());
        SmartDashboard.putData("FindHome", new FindHome());
        SmartDashboard.putData("ResetEncoder", new ResetEncoder());
        SmartDashboard.putData("DisplayEngagement", new DisplayEngagement());
        SmartDashboard.putData("InitializeClimb", new InitializeClimb());
        SmartDashboard.putData("EngageFirstLevel", new EngageFirstLevel());
        SmartDashboard.putData("PrepareToHookSecondLevel", new PrepareToHookSecondLevel());
        SmartDashboard.putData("EngageSecondLevel", new EngageSecondLevel());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriverController() {
        return driverController;
    }
    public Joystick getShooterController() {
        return shooterController;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
