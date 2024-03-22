package Seres_De_La_Tierra;
import Otros.Ser_Vivo;
import Seres_Del_Cielo.Ser_del_cielo;
public class Humano extends Ser_Vivo implements Ser_del_cielo, Ser_de_la_tierra  {

    public void trabajar(){
        System.out.println("Trabajando en el avion...");
    }

    public void correr(){
        System.out.println("Corriendo los 100m planos...");
    }

    public void jugar_futbol(){
        System.out.println("Jugando la final del mundial...");
    }

    @Override
    public void nacer(){
        System.err.println("Naciendo por cesárea...");
    }

    @Override
    public void crecer(){
        System.err.println("Creciendo como persona...");
    }

    @Override
    public void reproducirse(){
        System.err.println("Teniendo realciones con mi pareja...");
    }

    @Override
    public void morir(){
        System.err.println("Descansando en paz...");
    }

    @Override
    public void volar(){
        System.err.println("Volando el avion de mi trabajo...");
    }

    @Override
    public void desliarce(){
        System.err.println("Deslisandome por la colina despues de jugar futbol...");
    }

    @Override
    public void saltar(){
        System.out.println("Saltando la cuerda...");
    }

    @Override
    public void excabar(){
        System.out.println("Haciendo un hueco para mis mascotas...");
    }
}

