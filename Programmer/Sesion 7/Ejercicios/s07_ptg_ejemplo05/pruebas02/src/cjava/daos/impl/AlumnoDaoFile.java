package cjava.daos.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import cjava.beans.Alumno;
import cjava.dao.AbstractEntity;

/**
 *
 * @author emaravi
 */
public class AlumnoDaoFile extends AbstractEntity<Alumno>{

    List<Alumno> lAlumno;
    
    public AlumnoDaoFile(){
        lAlumno = new ArrayList<>();
        //cargarArchivo();
    }
    
    @Override
    public void create(Alumno t) {
        if(find(t.getId())==null){
            lAlumno.add(t);
            grabarArchivo();
        }
        
    }

    @Override
    public void update(Alumno t) {
        for(int i=0; i<lAlumno.size(); i++){
            if(lAlumno.get(i).getId()==t.getId()){
                lAlumno.set(i,t);
                grabarArchivo();
                break;
            }
        }
        
    }

    @Override
    public void delete(int id) {
        for(int i=0; i<lAlumno.size(); i++){
            if(lAlumno.get(i).getId()==id){
                lAlumno.remove(i);
                grabarArchivo();
                break;
            }
        }
        
    }

    @Override
    public Alumno find(int id) {
        cargarArchivo();
        for(Alumno alumno:lAlumno){
            if(alumno.getId()==id)
                return alumno;
        }
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        cargarArchivo();
        return lAlumno;
    }
    
    public void grabarArchivo(){
        try (BufferedWriter bufOutput = new BufferedWriter(new FileWriter("alumnos1.txt"))) {
            String line = "";
            for(Alumno alu:lAlumno){
                line = alu.getId()+","+alu.getNombre()+","+alu.getApellido()+
                        ","+alu.getPromedio()+","+alu.getEstado();
                bufOutput.write(line);
                bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Excepcion de entrada salida: " + e);
        }
    }
    public void cargarArchivo(){
        try (BufferedReader bufInput = new BufferedReader(new FileReader("alumnos.txt"))) {
            String line = "";
            Alumno alumno;
            lAlumno = new ArrayList<>();
            while ((line = bufInput.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(line,",");
                alumno = new Alumno();
                alumno.setId(Integer.parseInt(tokens.nextToken().trim()));
                alumno.setNombre(tokens.nextToken().trim());
                alumno.setApellido(tokens.nextToken().trim());
                alumno.setPromedio(Double.parseDouble(tokens.nextToken().trim()));
                alumno.setEstado(tokens.nextToken().trim());
                lAlumno.add(alumno);
            }
        }  catch (FileNotFoundException f) {
            System.out.println("Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Excepcion de entrada salida: " + e);
        }
    }
    
}
