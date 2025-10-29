import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Como te llamas");
        String nombre = input.nextLine();

        System.out.println("Hola " + nombre);

    }
    public static void fapellido (){

        Scanner input = new Scanner(System.in);

        System.out.println("Como te apellidas");
        String apellido = input.nextLine();

        System.out.println("Hola " + apellido);

    }
}