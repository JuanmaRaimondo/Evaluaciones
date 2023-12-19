package org.example;

public class Calculadora {
    public double calcular(double numerouno, double numerodos, char operacion){
        double resultado = 0.0;
        switch (operacion){
            case '+':
                resultado = numerouno + numerodos;
                break;
            case '-':
                resultado = numerouno - numerodos;
                break;
            case '*':
                resultado = numerouno * numerodos;
                break;
            case '/':
                resultado = numerouno / numerodos;
                break;
        }
        return resultado;
    }
}
