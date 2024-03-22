package El_Creador;
import Otros.Ser_Vivo;
import Seres_De_La_Tierra.Humano;
import Seres_De_La_Tierra.Perro;
import Seres_Del_Cielo.Ser_celestial;;
public class Crear_Ser_Vivo implements Creador {

    @Override
    public Ser_Vivo crear_ser_vivo (String tipo){
        if("humano".equalsIgnoreCase(tipo)){
            return new Humano();
        }else if("celestial".equalsIgnoreCase(tipo)){
            return new Ser_celestial();
        }else if("perro".equalsIgnoreCase(tipo)){
            return new Perro();
        }else {
            return null;
        }
    }
}
