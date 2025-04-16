package GrandesAlmacenes;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numHilos = 10;
        Almacenes almacen = new Almacenes();
        Hilo[] hilos = new Hilo[numHilos];

        for (int i = 0; i < numHilos; i++) {
            hilos[i] = new Hilo(i, almacen);
            hilos[i].start();
        }

        for (int i = 0; i < numHilos; i++) {
            hilos[i].join();
        }

        System.out.println("Termina todo..");
    }
}
