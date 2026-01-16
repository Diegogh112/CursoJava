/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.util;

/**
 *
 * @author emaravi
 */
public class Util {
   public static final int MEMORY=0;
   public static final int FILE=1;
   public static final int DB=2;
    
   public static int i =1;
   
   public static final double IGV=0.18;
    
    public static int generarId(){
        return i++;
    }
    
}
