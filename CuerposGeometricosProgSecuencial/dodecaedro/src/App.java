import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teti = new Scanner(System.in);

        double Area, Volumen;
        double arista, aristaD, aristaT;

        System.out.println("Ingrese el valor de la arista:");
        arista = teti.nextDouble();
        
        aristaD = arista * arista;
        aristaT = arista * arista * arista;
        Area = 3 * aristaD * 6.881909602;
        Volumen = 0.25 * 5.536467813 * aristaT;

        System.out.println("El valor del volumen es de: " +Volumen);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del area es de: " + Area);
    }
}
