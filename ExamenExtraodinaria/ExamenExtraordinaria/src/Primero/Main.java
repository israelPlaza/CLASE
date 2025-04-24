package Primero;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Primero.RecrusoComun rc =new RecrusoComun();
        Hilo[] hilos = new Hilo[5];

        for (int i = 0; i < 5; i++) {
            hilos[i] = new Hilo(i, rc);
            hilos[i].start();
        }
       for (Hilo h: hilos){
           h.join();
       }
        System.out.println("Acaba el main");
    }
}
