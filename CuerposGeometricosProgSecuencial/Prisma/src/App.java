import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
       Scanner intro = new Scanner(System.in);
       //declaracion de variables
       double areaLateral, Perimetro, Haltura;
       double Lados, medidaLados;
       double Areabase, apotemabase, Volumen, areaTotal;
       
       //Pedir los datos al usuario

       System.out.println("Ingrese el valor de la altura del prisma");
       Haltura = intro.nextDouble();

       System.out.println("Ingrese el valor de los lados del prisma");
       Lados = intro.nextDouble();

       System.out.println("Ingrese el valor de la medida de los lados del prisma");
       medidaLados = intro.nextDouble();

       System.out.println("Ingrese el valor de la Apotema base");
       apotemabase = intro.nextDouble();

       Perimetro = Lados * medidaLados;
       areaLateral = Perimetro * Haltura;
       Areabase = (Perimetro*apotemabase)/2;
       areaTotal = areaLateral + (2 * Areabase);
       Volumen = Areabase * Haltura;
 

       //Salida de datos 

       System.out.println("El valor del area lateral del prisma es de:  " +areaLateral);
       System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
       System.out.println("El valor del are total del prisma es de:  " +areaTotal);
       System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
       System.out.println("El valor del volumen del prisma es de:   " +Volumen);





    }
}
