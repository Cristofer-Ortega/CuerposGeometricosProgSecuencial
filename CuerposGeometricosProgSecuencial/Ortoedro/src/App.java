import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        Scanner orti = new Scanner(System.in);

        double MedidaA, MedidaB, MedidaC;
        double Area, Volumen, Diagonal;

        System.out.println("Ingrese el valor de la media A");
        MedidaA = orti.nextDouble();

         System.out.println("Ingrese el valor de la media B");
        MedidaB = orti.nextDouble();

         System.out.println("Ingrese el valor de la media C");
        MedidaC = orti.nextDouble();

        double zeta = (MedidaA * MedidaB);
        double eta = (MedidaA * MedidaC);
        double tau = (MedidaB * MedidaC);

        Area = 2 *((zeta) * (eta) * (tau));
        Volumen = (MedidaA * MedidaB * MedidaC);

        double Kappa = (MedidaA * MedidaA);
        double theta = (MedidaB * MedidaB);
        double sigma = (MedidaC * MedidaC);
        double omega =  ((Kappa) + (theta) + (sigma));
        Diagonal = Math.sqrt((omega));

        System.out.println("El valor del Area es de: " +Area);
        System.out.println(":::::::::::::::::::::::::::::::::.");
         System.out.println("El valor del volumen es de: " +Volumen);
        System.out.println(":::::::::::::::::::::::::::::::::.");
         System.out.println("El valor de la diagonal es de: " +Diagonal);
        

    

    


        


    








    }

        
}
