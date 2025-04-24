package PrimeroV3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RecursoComun rc = new RecursoComun();
        Hilo[] hilos = new Hilo[5];

        for (int i = 0; i < 5; i++) {
            hilos[i]=new Hilo(rc,i);
            hilos[i].start();
        }
        for (Hilo hilo:hilos){
            hilo.join();
        }
        System.out.println("acaba el main");
    }
}
