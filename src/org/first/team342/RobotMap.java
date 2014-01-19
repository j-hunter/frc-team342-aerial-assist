package org.first.team342;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int DRIVE_JOYSTICK_USB_PORT = 1;
    
    public static final int FRONT_LEFT_MOTOR_PWM_CHANNEL = 1;
    public static final int FRONT_RIGHT_MOTOR_PWM_CHANNEL = 2;
    public static final int REAR_LEFT_MOTOR_PWM_CHANNEL = 3;
    public static final int REAR_RIGHT_MOTOR_PWM_CHANNEL = 4;
}
