/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.team342.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.first.team342.OI;
import org.first.team342.RobotMap;
import org.first.team342.commands.drive.DriveWithJoystickCommand;

/**
 *
 * @author FIRST Team 342
 */
public class DriveSystem extends Subsystem {

    private static final DriveSystem INSTANCE = new DriveSystem();

    public static final double DEFAULT_X_VALUE = 0.0;

    public static final double DEFAULT_Y_VALUE = 0.0;

    public static final double DEFAULT_ROTATION_VALUE = 0.0;

    public static final double DEFAULT_GYRO_ANGLE_VALUE = 0.0;

    protected SpeedController frontLeftMotor = null;

    protected SpeedController frontRightMotor = null;

    protected SpeedController rearLeftMotor = null;

    protected SpeedController rearRightMotor = null;

    protected RobotDrive robotDrive = null;

    private DriveSystem() {
        frontLeftMotor = new Jaguar(RobotMap.FRONT_LEFT_MOTOR_PWM_CHANNEL);
        frontRightMotor = new Jaguar(RobotMap.FRONT_RIGHT_MOTOR_PWM_CHANNEL);
        rearLeftMotor = new Jaguar(RobotMap.REAR_LEFT_MOTOR_PWM_CHANNEL);
        rearRightMotor = new Jaguar(RobotMap.REAR_RIGHT_MOTOR_PWM_CHANNEL);
    }

    public static DriveSystem getInstance() {
        return INSTANCE;
    }

    public void drive(double x, double y, double rotation) {
        this.robotDrive.mecanumDrive_Cartesian(x, y, rotation, DEFAULT_GYRO_ANGLE_VALUE);
    }

    public void stop() {
        this.robotDrive.mecanumDrive_Cartesian(DEFAULT_X_VALUE, DEFAULT_Y_VALUE, 
                DEFAULT_ROTATION_VALUE, DEFAULT_GYRO_ANGLE_VALUE);
    }

    protected void initDefaultCommand() {
        OI oi = OI.getInstance();
        Joystick joystick = oi.getDriveJoystick();
        DriveWithJoystickCommand command = new DriveWithJoystickCommand(joystick);
        this.setDefaultCommand(command);
    }
}
