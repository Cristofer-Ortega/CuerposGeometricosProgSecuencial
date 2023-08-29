import java.util.Scanner;

public class App {
    static final double Pi = 3.141592654;
    public static void main(String[] args) throws Exception {
        Scanner zon = new Scanner(System.in);

        double RadioMayor, Haltura, Area, Volumen;
        double radioUno, radioDos, HalturaD;
        double radioUn, radioDo;

        System.out.println("Ingrese el valor del radio mayor de la zona esférica:");
        RadioMayor = zon.nextDouble();

        System.out.println("Ingrese el valor del radio 1: ");
        radioUno = zon.nextDouble();

        System.out.println("Ingrese el valor del radio 2:");
        radioDos = zon.nextDouble();

        System.out.println("Ingrese el valor de la altura:");
        Haltura = zon.nextDouble();

        Area = 2 * Pi * RadioMayor * Haltura;
        radioUn = radioUno * radioUno;
        radioDo = radioDos * radioDos;
        HalturaD = Haltura * Haltura;
        Volumen = ((Pi * Haltura)/6) *( (3 * radioUn ) + (3 * radioDo) + HalturaD);

        System.out.println("El valor del area de la zona esférica es de: "+Area);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del volumen de la zona esférica: "+Volumen);



    }
}
