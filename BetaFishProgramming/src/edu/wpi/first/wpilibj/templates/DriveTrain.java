/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

/**
 *
<<<<<<< HEAD
 * @author adminf
=======
 * @author Sahit Chintalapudi and Ryan Thant 
>>>>>>> I updated the drive train
 */
public class DriveTrain {
    //declarations... yet to see about Victors bl and br
    Victor lef1 = new Victor(1);
    Victor rig1 = new Victor(3);
    Victor lef2 = new Victor(2);
    Victor rig2 = new Victor(4);
    Joystick lef=new Joystick(2);
    Joystick right=new Joystick(1);
    
    /**
     * 
     * @param setSpeeds() sets speed
     */
    public void setSpeeds(){
        double leftmove=-lef.getY();
        double rightmove =right.getY();
        lef1.set(leftmove);
        rig1.set(rightmove);
        lef2.set(leftmove);
        rig2.set(rightmove);
        //sensitivity measures, yet to be commented in(if commented in add before the .sets)
        /*
        if(leftmove>-0.1&&leftmove<0.1){
            leftmove=0;
        } 
        if(rightmove>-0.1&&rightmove<0.1){
            rightmove=0;
    }
     */
        
}
}
