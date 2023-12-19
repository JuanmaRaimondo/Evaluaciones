package org.example.EjercicioDos;

public class Torre extends Persona{
    protected int nivel;
    Torre(int id, String nombre, int salud, int nivel){
        super(id, nombre, salud);
        this.nivel = nivel;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getSalud() {
        return super.getSalud();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public void setSalud(int salud) {
        super.setSalud(salud);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void entrenar() {
        super.entrenar();
        System.out.println("Sube su nivel" + nivel + 1);
    }
}
