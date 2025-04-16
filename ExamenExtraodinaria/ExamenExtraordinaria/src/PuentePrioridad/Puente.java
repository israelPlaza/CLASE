package PuentePrioridad;

public class Puente {
    private int politica;
    private int nOcupacion;
    private int capacidadMax;
    private int nAmbulanciasEspera;

    public Puente(int n)
    {
        this.politica = 1;
        this.capacidadMax = n;
        this.nOcupacion = 0;
        this.nAmbulanciasEspera = 0;
    }

    public synchronized void entrar(String nombre) throws InterruptedException
    {
        boolean soyAmbulancia = nombre.charAt(0)=='A';

        if (soyAmbulancia)
            this.nAmbulanciasEspera++;

        System.out.println("El hilo "+nombre+" quiere entrar");
        while (nOcupacion==capacidadMax ||
                nAmbulanciasEspera>0 && !soyAmbulancia)
            wait();

        if (soyAmbulancia)
            this.nAmbulanciasEspera--;
        System.out.println("El hilo "+nombre+" entra");
        nOcupacion++;
    }

    public synchronized void salir(String nombre)
    {
        nOcupacion--;
        notifyAll();
        System.out.println("El hilo "+nombre+" sale");
    }
}
