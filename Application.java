import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisionSegura(scanner);
        
        scanner.close();
    }

    public static void divisionSegura(Scanner scanner){

        double numero1;
        double numero2;

        try {
            System.out.println();
            System.out.print("Ingrese un número:");
            numero1 = scanner.nextDouble();
            numero2 = obtenerNumerador(scanner);
            double division = numero1/numero2;
            System.out.println("La división es: " +  division);
            System.out.println();

        } catch (Exception e) {
            System.out.println();
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }

    }

    public static double obtenerNumerador(Scanner scanner) throws Exception {
        double numero = 0;
        System.out.print("Ingresa un segundo número:");
        numero = scanner.nextDouble();

        if(numero == 0){
            throw new Exception("Se ingresó el número 0.");
        }

        return numero;
    }


}
