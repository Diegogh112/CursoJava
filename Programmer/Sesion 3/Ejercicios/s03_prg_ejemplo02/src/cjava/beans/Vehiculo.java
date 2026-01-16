/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.beans;

import java.util.List;

/**
 *
 * @author emaravi
 */
public class Vehiculo {
    private Motor motor;
    private String placa;
    private List<Neumatico> ruedas;
    
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Neumatico> getRuedas() {
        return ruedas;
    }

    public void setRuedas(List<Neumatico> ruedas) {
        this.ruedas = ruedas;
    }
        
}
