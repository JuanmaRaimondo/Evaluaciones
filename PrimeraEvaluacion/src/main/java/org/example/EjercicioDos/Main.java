package org.example.EjercicioDos;

public class Main {
    Mago principiante = new Mago(1,"Juan", 100, "Fuego");
    Espadachin fuerte = new Espadachin(2,"Pedro", 100, 10);
    Torre alta = new Torre(3, "Alta", 100, 5);

fuerte.entrenar();
alta.entrenar();
principiante.entrenar();
}
