package org.example.EjercicioDos;

public class Persona {
                  public   int id;
                  public  String nombre;
                  public int salud ;

             Persona(int id, String nombre, int salud){
                 this.id = id;
                 this.nombre = nombre;
                 this.salud = salud;
             }

             public void entrenar(){
                 System.out.println("Entrenando ...");
             }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
