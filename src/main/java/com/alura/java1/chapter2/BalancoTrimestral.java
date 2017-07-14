package com.alura.java1.chapter2;

/**
 * Created by MarcosNami on 6/23/2017.
 */
public class BalancoTrimestral {

    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        int mediaMensal = gastosTrimestre / 3;

        System.out.println("Gasto do trimestre: R$" + gastosTrimestre);
        System.out.println("Valor da média mensal: R$" + mediaMensal);

        int valorInicial = 180;
        while (valorInicial < 190) {
            System.out.println("Valor: " + valorInicial);
            valorInicial++;
        }

        int total = 0;
        for (int i = 1; i <= 1000; i++) {
            total += i;
        }
        System.out.println("Total: " + total);

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println("Multiplo de 3: " + i);
            }
        }

        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }

        int x = 13;
        System.out.println("Iniciando...\n");
        while (x != 1) {
            System.out.print(x + " > ");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x =(( 3 * x) + 1);
            }
        }
        System.out.print(x);

    }
}
