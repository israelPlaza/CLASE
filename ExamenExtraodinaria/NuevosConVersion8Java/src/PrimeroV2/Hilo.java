package PrimeroV2;

public class Hilo extends Thread{
RecursoComun rc;
int numero;
    public Hilo(RecursoComun rc, int numero){
        this.rc=rc;
        this.numero=numero;
    }

    public void run() {

        rc.saludo(numero);
    }
}
