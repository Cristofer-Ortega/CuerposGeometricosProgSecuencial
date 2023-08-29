import java.util.Scanner;
public class App {
    static final double Pi = 3.141592654;
    public static void main(String[] args)  {
        Scanner casqui = new Scanner(System.in);
        double Area, Volumen;
        double RadioMayor, Haltura, HalturaD;

        System.out.println("Ingrese el valor del radio mayor del casquete esférico");
        RadioMayor = casqui.nextDouble();

        System.out.println("Ingrese el valor de altura del casquete esférico");
        Haltura = casqui.nextDouble();

        Area = 2 * Pi * RadioMayor * Haltura;
        HalturaD = Haltura * Haltura;
        Volumen = Pi * HalturaD * ((3 * RadioMayor - Haltura)/3);

        System.out.println("El valor del area del casquete esférico es de: " + Area);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del volumen del casquete esférico es de: "+Volumen);
    }

}
