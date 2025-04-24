package PadelNormal;

public class Pista {
    private int capacidad;
    private int ocupacion;
    private boolean pistaOcupada;
    private int numeroJugando;

    public Pista(int n){
        this.capacidad=n;
        this.ocupacion=0;
        this.pistaOcupada=false;
        this.numeroJugando=0;
    }
    public synchronized void jugar() throws InterruptedException {
        System.out.println("Entra jugador "+" "+ocupacion );
        while (ocupacion==capacidad || pistaOcupada==true){
            wait();
        }
        ocupacion++;
        if (ocupacion==capacidad){
            pistaOcupada=true;
        }
    }

}
