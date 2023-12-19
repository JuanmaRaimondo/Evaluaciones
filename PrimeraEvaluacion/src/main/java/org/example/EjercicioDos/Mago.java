package org.example.EjercicioDos;

public class Mago extends Persona{
    protected String magia;
    Mago (int id, String nombre, int salud, String magia){
        super(id, nombre, salud);
        this.magia = magia;
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

    public String getMagia() {
        return magia;
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

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public void entrenar() {
        super.entrenar();
        System.out.println("...");
    }
}
