import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teti = new Scanner(System.in);

        double Area, Volumen, Diagonal;
        double arista, aristaD, aristaT;

        System.out.println("Ingrese el valor de la arista:");
        arista = teti.nextDouble();
        
        aristaD = arista * arista;
        aristaT = arista * arista * arista;
        Area = 6 * aristaD;
        Volumen = aristaT;
        Diagonal = arista * 1.732050807;
        
        System.out.println("El valor del volumen es de: " +Volumen);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del area es de: " + Area);
         System.out.println("::::::::::::::::::::::::::::::::::::");
          System.out.println("El valor de la diagonal es de: " +Diagonal);
    }
}
