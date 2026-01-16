/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.daos.impl;

import cjava.daos.AbstractAlumno;

/**
 *
 * @author emaravi
 */
public class AlumnoDaoImpl01 extends AbstractAlumno {

    @Override
    public int m1(){
        return 5;
    }
    
    @Override
    public void m2() {
        int x = this.m1();
    }
    
    
}
