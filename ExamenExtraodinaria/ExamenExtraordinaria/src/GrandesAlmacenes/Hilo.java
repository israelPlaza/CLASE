package GrandesAlmacenes;

public class Hilo extends Thread{
    private Almacenes almacen;
    private int nombre;

    public Hilo(int numCli, Almacenes almacen) {
        this.nombre = numCli;
        this.almacen = almacen;
    }

    public void run() {
        try {
            almacen.entrar(nombre);
            sleep((long) (Math.random() * 2000)); // Simula tiempo dentro
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
