package GrandesAlmacenes;

public class Almacenes {
    private boolean ocupado = false;

    public synchronized void entrar(int nombre) throws InterruptedException {
        while (ocupado) {  // Si la tienda está ocupado, espera
            System.out.println("Cliente " + nombre + " quiere entrar, pero debe esperar...");
            wait();
        }
        ocupado = true;
        System.out.println("Cliente " + nombre + " entra a la tienda.");
    }

    public synchronized void salir(int nombre) {
        ocupado = false;
        System.out.println("Cliente " + nombre + " sale de la tienda.");
        notifyAll(); // Despierta a los otros hilos
    }
}
