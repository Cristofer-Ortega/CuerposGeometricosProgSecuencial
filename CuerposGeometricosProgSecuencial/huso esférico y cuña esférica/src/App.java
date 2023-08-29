import java.util.Scanner;
public class App {
    static final double Pi = 3.141592654;
    public static void main(String[] args) throws Exception {
        Scanner huscus = new Scanner(System.in);
        
        double Area, Volumen, radio;
        double numGrados, radioD, radioT;

        System.out.println("Ingrese el valor del numero de grados");
        numGrados = huscus.nextDouble();

        System.out.println("Ingrese el valor del radio");
        radio = huscus.nextDouble();

        radioD = radio * radio;
        radioT = radio * radio * radio;
        Area = (4 * Pi * radioD * numGrados)/360;
        Volumen = 1.333333333 * ((Pi * radioT * numGrados)/360);

        System.out.println("El valor del area de huso esférico es de: " + Area);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del volumen de la cuña esférica: " + Volumen);
    }    

}
