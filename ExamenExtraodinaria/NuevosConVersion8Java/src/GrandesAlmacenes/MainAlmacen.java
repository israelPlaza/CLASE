package GrandesAlmacenes;

public class MainAlmacen {
    public static void main(String[] args) throws InterruptedException {
        int numeroHilos=25;
        int pruductos=20;
        int intentos=0;
        Almacen almacen =new Almacen(pruductos,intentos);
        Persona[] persona = new Persona[numeroHilos];

        for (int i = 0; i < numeroHilos; i++) {
            persona[i]=new Persona(almacen,i,intentos);
            persona[i].start();
        }

        for (Persona per:persona){
            per.join();
        }

        System.out.println("Acaba el programa");
    }
}
