package PrimeroV3;

public class Hilo extends Thread{
   RecursoComun rc=new RecursoComun();
   int numero;

   public Hilo(RecursoComun rc,int numero){
       this.rc=rc;
       this.numero=numero;
   }
    public void run() {
        rc.hola(numero);
    }
}
