import java.util.Scanner;

public class App {
    static final double Pi = 3.141592654;
    public static void main(String[] args)  {
        Scanner esfi = new Scanner(System.in);

        double Area, Volumen, radioD, radioT,radio;
        
        System.out.println("Ingrese el valor del radio:");
        radio = esfi.nextDouble();
        
        radioD = radio * radio;
        radioT = radio * radio * radio;
        Area = 4 * Pi * radioD;
        Volumen = 1.333333333 * Pi * radioT;

        System.out.println("El valor del area de la esfera es de:" +Area);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del volumen de la esfera es de: "+Volumen);
        

    
    
    
    
    
    
    }
}
