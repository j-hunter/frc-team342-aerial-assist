package org.first.team342.commands.drive;

import org.first.team342.subsystems.DriveSystem;

/**
 *
 * @author FIRST Team 342
 */
public class DriveForwardCommand extends DriveCommand {
    
    private double speed;
    
    public DriveForwardCommand(double speed) {
        this.speed = speed;
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        this.drive.drive(DriveSystem.DEFAULT_X_VALUE, this.speed, DriveSystem.DEFAULT_ROTATION_VALUE);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}