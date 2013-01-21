/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author admin
 */
public class Objects {
    public static Victor lef1 = new Victor(1);
    
    public static Victor rig1 = new Victor(3);
    
    public static Victor lef2 = new Victor(2);
    
    public static Victor rig2 = new Victor(4);
    
    public static Joystick lef=new Joystick(2);
    
    public static Joystick right=new Joystick(1);
    
    public static  Solenoid piston=new Solenoid(3);
}
