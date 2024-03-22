package Seres_De_La_Tierra;
import Otros.Ser_Vivo;
public class Perro extends Ser_Vivo implements Ser_de_la_tierra {
    @Override
    public void nacer(){
        System.err.println("Naciendo por en manada...");
    }

    @Override
    public void crecer(){
        System.err.println("Creciendo en manada...");
    }

    @Override
    public void reproducirse(){
        System.err.println("teniendo las crias...");
    }

    @Override
    public void morir(){
        System.err.println("Descansando en paz...");
    }

    @Override
    public void desliarce(){
        System.err.println("Deslisandome por jugar con otros perros...");
    }

    @Override
    public void saltar(){
        System.err.println("Saltando por la galleta...");
    }

    @Override
    public void excabar(){
        System.err.println("Haciendo un hueco para esconder mi hueso...");
    }
}
