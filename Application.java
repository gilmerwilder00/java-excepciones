import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // divisionSegura(scanner);
        saludoAlUsuario();

        // ...
        
        
        scanner.close();
    }

    public static void divisionSegura(Scanner scanner){

        double numero1;
        double numero2;

        try {
            System.out.println();
            System.out.print("Ingrese un número:");
            numero1 = scanner.nextDouble();
            numero2 = obtenerNumerador(scanner); // puede lanzar excepcion
            double division = numero1/numero2;
            System.out.println("La división es: " +  division);
            System.out.println();

        } catch (Exception e) {
            System.out.println();
            System.out.println("Error: " + e.getMessage()); // se imprime un mensaje
            System.out.println();
        }

    }

    public static double obtenerNumerador(Scanner scanner) throws Exception {
        double numero = 0;
        System.out.print("Ingresa un segundo número:");
        numero = scanner.nextDouble();

        if(numero == 0){
            // se lanza una excepción para evitar uns división por 0 
            throw new Exception("Se ingresó el número 0.");
        }

        return numero;
    }


    public static void saludoAlUsuario(){
        Scanner scanner = new Scanner(System.in);
        try {
            String nombre = solicitarNombre(scanner); // puede lanzar exception
            System.out.println("Hola! " + nombre);
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }finally{
            scanner.close();
            System.out.println("Se cerro el scanner.");
            System.out.println();
        }
    }


    public static String solicitarNombre(Scanner scanner) throws Exception{
        String nombre = null;

        System.out.println();
        System.out.print("Ingresa tu nombre:");
        nombre = scanner.nextLine();

        if(nombre.length() < 2){
            throw new Exception(" El nombre debe tener como mínimo 2 caracteres.");
        }

        return nombre;
    }


}
