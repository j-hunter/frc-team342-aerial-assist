/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.team342.commands.drive;

import org.first.team342.commands.TimedCommand;
import org.first.team342.subsystems.DriveSystem;

/**
 *
 * @author abrightwell
 */
public abstract class TimedDriveCommand extends TimedCommand {
    
    private DriveSystem drive = null;
    
    public TimedDriveCommand(long duration) {
        super(duration);
        this.drive = DriveSystem.getInstance();
        this.requires(this.drive);
    }
}