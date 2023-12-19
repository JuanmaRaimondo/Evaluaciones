package org.example.EjercicioDos;

public class Espadachin extends Persona{
    protected int ataque;
    Espadachin(int id, String nombre, int salud, int ataque){
        super(id, nombre, salud);
        this.ataque = ataque;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public int getSalud() {
        return super.getSalud();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setSalud(int salud) {
        super.setSalud(salud);
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void entrenar() {
        super.entrenar();
        System.out.println(" su nombre es" + nombre);
        System.out.println("Su ataque sube" + ataque);
    }
}
