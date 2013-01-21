/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Compressor;

/**
 *
 * @author admin
 */
public class pneumatics {
    public void EngagePneumatics(){
        Compressor com =new Compressor(1,2);
        com.start();
    }
    
}
