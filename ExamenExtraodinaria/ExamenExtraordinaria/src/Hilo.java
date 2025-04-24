package Primero;

public class Hilo extends Thread{
    RecrusoComun rc;
    int numero;

    public Hilo(int numero, RecrusoComun rc){
        this.numero=numero;
        this.rc=rc;
    }
    public void run() {
        rc.hola(numero);
    }

}
