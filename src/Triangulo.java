import java.util.Scanner;

public class Triangulo extends Figura{

double a,b,c ;


    @Override
    double CalcularArea() {
        double s =CalcularPerimetro()/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    double CalcularPerimetro() {
     a= calcularDistancia(0,1);
     b= calcularDistancia(0,2);
     c= calcularDistancia(1,2);
     double perimetro=a+b+c;
     return perimetro;

    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<3; i++ ){
        System.out.println("Ingrese la coordenada x "+i+": ");
        double x = sc.nextDouble();
            System.out.println("Ingrese la coordenada y "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la coordenada z "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));
    }
}
}
