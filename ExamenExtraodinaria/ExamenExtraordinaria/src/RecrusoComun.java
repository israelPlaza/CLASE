package Primero;

public class RecrusoComun {

    public RecrusoComun(){

    }

    public synchronized void hola(int numero){
        System.out.println("Entra hilo "+numero);
    }
}
