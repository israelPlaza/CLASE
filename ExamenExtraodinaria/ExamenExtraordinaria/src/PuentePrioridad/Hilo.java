package PuentePrioridad;

public class Hilo extends Thread{
    private Puente puente;
    private String nombre;

    public Hilo (String nombre,Puente puente)
    {
        this.puente = puente;
        this.nombre = nombre;
    }

    public void run()
    {
        try
        {
            puente.entrar(nombre);
            sleep((long)(Math.random()*3000));
            puente.salir(nombre);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
