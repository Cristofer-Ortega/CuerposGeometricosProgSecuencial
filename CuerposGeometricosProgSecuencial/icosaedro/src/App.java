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
        Area = 5 * aristaD * 1.732050808;
        Volumen = 0.41666666666666666666666666666667 * 5.236067977 * aristaT;

        System.out.println("El valor del volumen es de: " +Volumen);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del area es de: " + Area);
    }
}
