/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc319.BobBAE2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc319.BobBAE2013.Robot;

/**
 *
 * @author BobDev
 */
public class GoToDisengageHeight extends Command {
    
    public GoToDisengageHeight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.elevator.enable();
        Robot.elevator.setSetpoint(Robot.elevator.HookDisengageHeight);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.elevator.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
