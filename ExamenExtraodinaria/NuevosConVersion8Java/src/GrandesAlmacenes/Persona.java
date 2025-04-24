package GrandesAlmacenes;

public class Persona extends Thread {
    private int nombre;
    private Almacen almacen;
    private int intentos;

    public Persona(Almacen almacen,int nombre, int intentos){
        this.almacen=almacen;
        this.nombre=nombre;
        this.intentos=intentos;
    }

    public void run(){
        try {
            almacen.entrar(nombre);
            sleep((long) (Math.random()*3000));
            almacen.salir(nombre);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
