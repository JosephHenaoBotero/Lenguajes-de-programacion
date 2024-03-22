package Seres_Del_Cielo;
import Otros.Ser_Vivo;
public class Ser_celestial extends Ser_Vivo implements Ser_del_cielo {
    public void cambiar_de_dimension(){
        System.out.println("Cambiando de dimension...");
    }

    public void curacion(){
        System.out.println("Usando curacion...");
    }

    public void reanimarse(){
        System.out.println("reanimandose...");
    }

    @Override
    public void volar(){
        System.out.println("Volando a la velocidad de la luz...");
    }

    @Override
    public void nacer(){
        System.err.println("Naciendo...");
    }

    @Override
    public void crecer(){
        System.err.println("Crecimiento celestial...");
    }

    @Override
    public void reproducirse(){
        System.out.println("Procreando nuevas especies...");

    }

    @Override
    public void morir(){
        System.err.println("Descansando en paz...");
    }


}
