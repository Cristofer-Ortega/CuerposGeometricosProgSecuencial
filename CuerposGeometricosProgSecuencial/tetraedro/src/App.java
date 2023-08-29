import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teti = new Scanner(System.in);

        double Area, Volumen, Haltura;
        double arista, aristaD, aristaT;

        System.out.println("Ingrese el valor de la arista:");
        arista = teti.nextDouble();

        aristaD = arista * arista;
        aristaT = arista * arista * arista;
        Volumen = 0.117851130197757 * aristaT;
        Area = aristaD * 1.732050807568;
        Haltura = arista * 0.8164965809;

        System.out.println("El valor del volumen es de: " +Volumen);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del area es de: " + Area);
         System.out.println("::::::::::::::::::::::::::::::::::::");
          System.out.println("El valor de la altura es de: " +Haltura);

    }
}
