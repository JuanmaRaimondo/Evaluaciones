package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora sencilla");
        double numero1;
        double numero2;
        char operacion;

        try {


            System.out.println("Ingrese el primer numero");
            numero1 = input.nextDouble();

            System.out.println("Ingrese el segundo numero");
            numero2 = input.nextDouble();

            System.out.println("Ingrese la operacion '+' '-' '/' '*'");
            operacion = input.next().charAt(0);
        }catch ( InputMismatchException e ){
            throw new RuntimeException("Dato ingresado no valido");
        }
        Calculadora calcular = new Calculadora();
        double resultado = calcular.calcular(numero1, numero2, operacion);

        System.out.println("El resultado es " + resultado);

}
}

