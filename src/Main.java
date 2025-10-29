import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static Scanner input = new Scanner (System.in);
    public static String apellido;
    public static void main(String[] args) {


        System.out.println("Como te llamas");
        String nombre = input.nextLine();

        System.out.println("Hola " + nombre);

        fapellidos();

        System.out.println("Hola " + nombre + " " + apellido);

        numero();
    }

    public static void fapellidos(){
        System.out.println("Cual es tu apellido");
        apellido = input.nextLine();
    }
    public static void fapellido (){

        Scanner input = new Scanner(System.in);

        System.out.println("Como te apellidas");
        String apellido = input.nextLine();

        System.out.println("Hola " + apellido);
    }

    public static void numero(){
        System.out.println("Cual es tu numero");
        int numero = input.nextInt();

        System.out.println("El numero que has introducido es" + numero);
    }
}