import java.util.Scanner;
public class App {
   public static void main(String[] args)  {
       Scanner piri = new Scanner(System.in);
        
        double apotema, base, Haltura, baseMedia;
        double Volumen, Areabase, areaLateral, areaTotal;
        double HalturaD, baseMediaD, apotemaD;


        System.out.println("Ingrese el valor de base de la pirámide");
        base = piri.nextDouble();

        System.out.println("Ingrese el valor de altura de la pirámide");
        Haltura = piri.nextDouble();

        HalturaD = Haltura * Haltura;
         baseMedia = base/2;
          baseMediaD = baseMedia * baseMedia;
         apotema = HalturaD + baseMediaD;
         apotemaD = apotema * apotema;
         areaLateral = 4 * ((base*apotemaD) /2)/1000;
         Areabase = base * base;
         areaTotal = Areabase + areaLateral;
         Volumen = (Areabase * Haltura)/3;

         System.out.println("El valor del area lateral de la pirámide es de: "+areaLateral);
         System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
         System.out.println("El valor del area total de la pirámide es de: "+areaTotal);
         System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
         System.out.println("El valor del volumen de la pirámide es de: "+Volumen);

         





    }
}