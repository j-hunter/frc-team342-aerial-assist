/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.team342.commands.drive;

import edu.wpi.first.wpilibj.command.Command;
import org.first.team342.subsystems.DriveSystem;

/**
 *
 * @author abrightwell
 */
public abstract class DriveCommand extends Command {
    
    public static final String DEFAULT_DRIVE_COMMAND_NAME = "Default Drive Command";
    
    protected DriveSystem drive = null;
    
    public DriveCommand() {
        this(DEFAULT_DRIVE_COMMAND_NAME);
    }
    
    public DriveCommand(String name) {
        super(name);
        this.drive = DriveSystem.getInstance();
        this.requires(this.drive);
    }
}