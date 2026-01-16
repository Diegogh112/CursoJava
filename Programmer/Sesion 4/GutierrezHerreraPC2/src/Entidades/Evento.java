package Entidades;

import java.time.LocalTime;
import java.util.List;

public class Evento {
    private String titulo;
    private double duracion;
    private String nombre;
    private LocalTime horaIngreso;

    private LocalTime horaSalida;

    private boolean esTemporadaAlta;

    private double costoEntrada;

    private Expositor expositor;
    private List<Asistente> asistentes;
    public Evento(){}

    public Evento(String titulo, double duracion, String nombre, LocalTime horaIngreso, LocalTime horaSalida, boolean esTemporadaAlta, Expositor expositor, List<Asistente> asistentes) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.nombre = nombre;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.esTemporadaAlta = esTemporadaAlta;
        this.costoEntrada = 0;
        switch (costoEntrada){
            case
        }
        this.expositor = expositor;
        this.asistentes = asistentes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isEsTemporadaAlta() {
        return esTemporadaAlta;
    }

    public void setEsTemporadaAlta(boolean esTemporadaAlta) {
        this.esTemporadaAlta = esTemporadaAlta;
    }

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

    public Expositor getExpositor() {
        return expositor;
    }

    public void setExpositor(Expositor expositor) {
        this.expositor = expositor;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
}


/*Debe usar POO(Patrones) y Programación funcional para todos los casos.
Una empresa organiza eventos tecnológicos con cierto nivel de frecuencia. Cuando se realiza un evento siempre
tiene un título, la duración del mismo, el nombre del expositor, la hora de ingreso, la hora de salida y si esta en temporada alta o no. El costo de las entradas depende de la ubicación según la tabla adjunta.
