package com.cjava.demo.pruebas;

import reactor.core.publisher.Flux;

public class Prueba01 {
    public static void main(String[] args) {

        Flux<String> flux = Flux.just("hola", "mundo", "desde", "reactive", "programming")
                .filter(s -> s.length() > 4)
                .map(String::toUpperCase);

        flux.subscribe(System.out::println);

    }
}
