package PrimeroV3;

public class RecursoComun {

    public RecursoComun(){

    }

    public synchronized void hola(int numero){
        System.out.println("el hilo es "+numero);
    }
}
