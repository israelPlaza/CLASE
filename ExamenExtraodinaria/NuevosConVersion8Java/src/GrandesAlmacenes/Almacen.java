package GrandesAlmacenes;

public class Almacen {
    private boolean puertaAbierta = true;
    private int productos = 20;
    private int intentos = 0;

    public Almacen(int productos, int intentos) {
        this.productos = productos;
        this.intentos = intentos;

    }

    public synchronized void entrar(int nombre) throws InterruptedException {

        System.out.println("La persona " + nombre + " con el intento número " + intentos);
       intentos++;
        while (intentos <= 5) {
            System.out.println("Entra persona " + nombre);
            puertaAbierta=true;
            wait();
        }

    }

    public synchronized void salir(int nombre) {
        productos--;
        notifyAll();
        System.out.println("Sale persona " + nombre);
        System.out.println("Quedan "+productos);
        puertaAbierta=false;
    }

}
