/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.team342.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author abrightwell
 */
public class Drive extends Subsystem {

    private static final Drive INSTANCE = new Drive();
    
    private Drive() {
    }
    
    protected void initDefaultCommand() {
    }
    
    public static Drive getInstance() {
        return INSTANCE;
    }
    //a change
}
