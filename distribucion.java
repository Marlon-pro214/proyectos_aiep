import java.util.Scanner;

public class distribucion {

    public static void main(String[] args) { //se agrega metodo principal
        System.out.println("***Distribuidora***");
        //definimos nuestra variable consola
        // para poder leer la informacion de entrada
        //para ello creamos nuestro objeto tipo Scanner
        var consola=new Scanner(System.in);

        //solicitamos la siguiente informacion al usuario datos de entrada

        System.out.print("Por favor indique el tipo de combustible: ");
        var tipoCombustible=consola.nextLine();
        //nombre de la marca
        System.out.print("Por favor ingrese la marca: ");
        var nombreMarca=consola.nextLine();
        //nombre del modelo
        System.out.print("Por favor ingrese el nombre del modelo: ");
        var modelo=consola.nextLine();
        //cilidraje del vehiculo
        System.out.print("Por favor ingrese el cilindrage en cc: ");
        var cilindrada=consola.nextDouble();

        // cantidad de pasajeros
        System.out.print("Por favor indique la cantidad de pasajeros: ");
        var capacidad=consola.nextInt();
        // tipo de combustible
        

        //datos de salida
        System.out.println("\n---valores de salida----");
        System.out.println("\tLa marca que ha ingresado es: "+nombreMarca);
        System.out.println("\tEl modelo que ha ingresado es: "+modelo);
        System.out.println("\tLa cilidrada que ha ingresado es :"+cilindrada+" cc");
        System.out.println("\tTiene una capacidad de: " +capacidad+ " pasajeros");
        System.out.println("\tEl tipo de combustible es: "+tipoCombustible);

    }
}