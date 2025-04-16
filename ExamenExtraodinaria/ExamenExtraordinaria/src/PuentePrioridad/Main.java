package PuentePrioridad;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numHilos=5;
        Puente puente = new Puente(2);

        Hilo [] hilos = new Hilo[numHilos];

        for (int i=0;i<numHilos;i++)
        {
            if (Math.random()<0.8)
                hilos[i] = new Hilo("H"+i,puente);
            else
                hilos[i] = new Hilo("A"+i,puente);
            hilos[i].start();
        }

        for (int i=0;i<numHilos;i++)
            hilos[i].join();
        System.out.println("Termina el main");
    }
}