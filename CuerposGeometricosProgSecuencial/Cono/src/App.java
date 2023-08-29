import java.util.Scanner;
public class App {
    static final double Pi = 3.141592654;
    public static void main(String[] args) {
        Scanner coni = new Scanner(System.in);
        double areaLateral, areaTotal, Volumen;
        double radio, generatriz, Haltura, radioD;

        System.out.println("Ingrese el valor de radio del cono: ");
        radio = coni.nextDouble();

        System.out.println("Ingrese el valor de altura del cono: ");
        Haltura = coni.nextDouble();

        System.out.println("Ingrese el valor de la generatriz del cono:");
        generatriz = coni.nextDouble();

        areaLateral = Pi * radio * generatriz;
        radioD = radio * radio;
        areaTotal = areaLateral + Pi * radioD; 
        Volumen = (0.3333333333 * Pi * radioD )* Haltura;

        System.out.println("El valor del area lateral del cono es de: "+areaLateral);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del area total del cono es de: "+areaTotal);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del volumen del cono es de: "+Volumen);





    }
}
