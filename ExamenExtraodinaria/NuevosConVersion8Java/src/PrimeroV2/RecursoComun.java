package PrimeroV2;

public class RecursoComun {
    public RecursoComun(){

    }

    public synchronized void saludo(int numero){

            System.out.println("a "+ numero);
    }
}
