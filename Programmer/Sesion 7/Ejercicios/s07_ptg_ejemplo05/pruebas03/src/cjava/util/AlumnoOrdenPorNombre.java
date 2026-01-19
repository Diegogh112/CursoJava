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
public class AlumnoOrdenPorNombre implements Comparator<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        int result = o1.getNombre().compareTo(o2.getNombre());
        if (result != 0) { return result; }
        else { 
            return 0;
        } 
    }
    
}
