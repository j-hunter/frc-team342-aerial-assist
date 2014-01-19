/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.team342.commands.drive;

import edu.wpi.first.wpilibj.Joystick;
import org.first.team342.subsystems.DriveSystem;

/**
 *
 * @author abrightwell
 */
public class DriveWithJoystickCommand extends DriveCommand {
    
    private DriveSystem drivetrain = DriveSystem.getInstance();
    
    private Joystick joystick;
    
    public DriveWithJoystickCommand(Joystick joystick) {
        this.joystick = joystick;
        this.requires(drivetrain);
    }

    protected void initialize() {
    }
    
    protected void execute() {
        double x = this.joystick.getX();
        double y = this.joystick.getY();
        double rotation = this.joystick.getZ();

        this.drivetrain.drive(x, y, rotation);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        this.drivetrain.stop();
    }

    protected void interrupted() {
        this.drivetrain.stop();
    }
}