import java.util.Scanner;
public class App {
    static final double Dos = 2;
    static final double Pi = 3.141592654;
    public static void main(String[] args) {
        Scanner ciliScanner = new  Scanner(System.in);
        double areaLateral, areaTotal, Volumen;
        double radio, Haltura;

        System.out.println("Ingrese el valor de radio del cilindro:");
        radio = ciliScanner.nextDouble();

        System.out.println("Ingrese el valor de altura del cilindro");
        Haltura = ciliScanner.nextDouble();

        areaLateral = Dos * Pi * radio * Haltura;
        areaTotal = Dos * Pi * radio * (Haltura + radio);
        Volumen = Pi * (radio * radio) + Haltura;

        System.out.println("El valor del area lateral del cilindro es de:  " +areaLateral);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del area total del cilindro es de:   " +areaTotal);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del volumen del cilindro es de:  " +Volumen);


    


    }
   
}

