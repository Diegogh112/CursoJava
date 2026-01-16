/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.util;

import cjava.beans.Alumno;
import java.util.Comparator;

/**
 *
 * @author emaravi
 */
public class AlumnoOrdenPorPromedio implements Comparator<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getPromedio()< o2.getPromedio()) { return 1; }
        else if (o1.getPromedio()> o2.getPromedio()) { return -1; }
        else { return 0; } 
    }
    
}
