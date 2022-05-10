package com.paulo.dio.excecoes;

import com.paulo.dio.excecoes.model.Gato;

public class Main {

    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println();
        int a = 55;
        int b = 65;
        System.out.println("Olá a todos da DIO! "+ (a + b));
        System.out.println(gato);
    }
}
