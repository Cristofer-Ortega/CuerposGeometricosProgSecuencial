import java.util.Scanner;
public class App {
    static final double Pi = 3.141592654;
    public static void main(String[] args) throws Exception {
       Scanner casque = new Scanner(System.in);
       double Area, Volumen;
       double RadioMayor, Haltura, HaturaD;
       
       System.out.println("Ingrese el valor del radio mayor del casquete esférico:");
       RadioMayor = casque.nextDouble();

       System.out.println("Ingrese el valor de altura del casquete esférico:");
       Haltura = casque.nextDouble();

       Area = 2 * Pi * RadioMayor * Haltura;
       HalturaD = Haltura * Haltura;
       Volumen = Pi * HaturaD * (3*RadioMayor-Haltura)/3;


    
    }
}
