import El_Creador.Creador;
import El_Creador.Crear_Ser_Vivo;
import Seres_De_La_Tierra.Humano;
import Seres_De_La_Tierra.Perro;
import Seres_Del_Cielo.Ser_celestial;
public class Main {
    public static void main(String[] args) {
        Creador factoryCreador = new Crear_Ser_Vivo();

        Humano nino = (Humano) factoryCreador.crear_ser_vivo("humano");
        nino.nacer();
        nino.volar();
        nino.trabajar();

        Ser_celestial angel = (Ser_celestial) factoryCreador.crear_ser_vivo("celestial");
        angel.volar();
        angel.curacion();

        Perro bulldog = (Perro) factoryCreador.crear_ser_vivo("perro");
        bulldog.excabar();
        bulldog.reproducirse();
    }
}
