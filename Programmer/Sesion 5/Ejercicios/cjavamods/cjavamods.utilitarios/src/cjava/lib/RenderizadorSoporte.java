package cjava.lib;

import cjava.util.RenderizadorSimple;

public class RenderizadorSoporte {
    public void mostrar(Object o){
        new RenderizadorSimple().aCadena(o);
    }
}
