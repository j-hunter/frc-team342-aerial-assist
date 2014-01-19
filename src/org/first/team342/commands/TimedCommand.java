/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.team342.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author FIRST Team 342
 */
public abstract class TimedCommand extends Command {

    public static final String DEFAULT_TIMED_COMMAND_NAME = "Default Timed Command";
    
    /**
     * The amount of time in milliseconds that the command should run.
     */
    private long duration;
    /**
     * The time in milliseconds of when the command started.
     */
    private long startTime;

    /**
     * Create a new timed command with the specified duration.
     * @param duration the amount of time in milliseconds that the command 
     * should run.
     */
    public TimedCommand(long duration) {
        super(DEFAULT_TIMED_COMMAND_NAME);
        this.duration = duration;
    }

    protected void initialize() {
        this.startTime = System.currentTimeMillis();
        System.out.println("Start Time: " + this.startTime);
    }

    protected boolean isFinished() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - this.startTime;
        return (elapsedTime >= this.duration);
    }
}