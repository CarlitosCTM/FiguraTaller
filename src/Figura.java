import java.util.ArrayList;
import java.util.List;



public abstract class Figura {


    List<Punto> listaPuntos = new ArrayList<>();

    double calcularDistancia(int i, int j){
        Punto punto1 =listaPuntos.get(i);
        Punto punto2 =listaPuntos.get(j);
        double dist= Math.sqrt(Math.pow(punto1.getX()- punto2.getX(),2)+Math.pow(punto1.getY()- punto2.getY(),2));
        return dist;
    }

    abstract double CalcularArea();
    abstract double CalcularPerimetro();
    abstract void IngresarPuntos();


}
