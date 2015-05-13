

package org.usfirst.frc319.BobBAE2013.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
/**
 *
 */
public class Fire extends CommandGroup {
    
    public  Fire() {
        
        
        addSequential(new TriggerExtend());//Reset Trigger
        addSequential(new FeederExtend());//Push Frisbee into Shooter
        addSequential(new TriggerRetract()); //Fire frisbee
        addSequential(new FeederRetract());//Reset Feeder
    }
}
