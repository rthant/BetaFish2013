/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.templates.Objects;
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
    
    
    /**
     * 
     * @param setSpeeds() sets speed
     */
    public void setSpeeds(){
        double leftmove=-Objects.lef.getY();
        double rightmove =Objects.right.getY();
        Objects.lef1.set(leftmove);
        Objects.rig1.set(rightmove);
        Objects.lef2.set(leftmove);
        Objects.rig2.set(rightmove);
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
