// Our Elevator PID Subsytem - 2013
package org.usfirst.frc319.BobBAE2013.subsystems;
import org.usfirst.frc319.BobBAE2013.RobotMap;
import org.usfirst.frc319.BobBAE2013.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; 
import edu.wpi.first.wpilibj.Encoder.PIDSourceParameter;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 *
 */
public class Elevator extends PIDSubsystem {
    
    SpeedController speedController = RobotMap.elevatorSpeedController;
    Encoder encoder = RobotMap.elevatorEncoder;
    DigitalInput homeLimitSwitch = RobotMap.elevatorHomeLimitSwitch;
    DigitalInput leftLimitSwitch = RobotMap.elevatorLeftLimitSwitch;
    DigitalInput rightLimitSwitch = RobotMap.elevatorRightLimitSwitch;
    
    // Initialize your subsystem here
    public double FirstLevelLineupHeight = 4721.0;
    public double FirstLevelHookHeight = 3406.0;
    public double LockHeight = 296.0;
    public double MiddleHeight = 3386.0;
    public double HookDisengageHeight = 786.0;  
    public double SecondLevelLineupHeight = 6233.0;
    public double SecondLevelHookHeight = 6100.0;
    
    //PID Constants
    public double findHomeP = -0.005;
    public double findHomeI = 0.0;
    public double findHomeD = -0.002;
    
    public double climbP = -0.005;
    public double climbI = -0.001;
    public double climbD = -0.005;
    public Elevator() {
        
        super("Elevator", -0.0050, -0.001, -0.0050);
        setAbsoluteTolerance(20.0);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("Elevator", "PIDSubsystem Controller", getPIDController());
    }
    public void initDefaultCommand() {
   
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
      
        return encoder.pidGet();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
      
        speedController.pidWrite(output);
    }

    public boolean GetLimitSwitchLeft() {
        return leftLimitSwitch.get();
    }

    public boolean GetLimitSwitchRight() {
        return rightLimitSwitch.get();
    
    }
    public boolean GetHomeLimitSwitch(){
        return homeLimitSwitch.get();
    }
    public void ResetEncoder(){
        encoder.reset();
    }
}
