import java.util.Scanner;

public class aplicacionDistribuidora {
    public static void main(String[] args) { //agragamos el metodo principal
        System.out.println("***aplicacion distribuidora***");

        var entradaDatos=new Scanner(System.in);

        //se pide nombre del usuario para el registro de compra
        System.out.print("Por favor indique su nombre: ");
        var nombreUsuario=entradaDatos.nextLine();
        //se pide la edad del usuario
        System.out.print("Por favor indique su edad: ");
        var edad=Integer.parseInt(entradaDatos.nextLine());
        //se pide corre electronico para el registro de compra
        System.out.print("Por indique su correo electronico: ");
        var correoElectronico=entradaDatos.nextLine();
        //se dide al usuario el valor total de su compra
        System.out.print("Por favor ingrese el total del valor de sus compra: ");
        var totalCompra=Double.parseDouble(entradaDatos.nextLine());
        //se pide al usuario la distancia entre el lugar despacho y la distribuidara
        System.out.print("ingrese distancia en Km de su domicilio y la distribuidora: ");
        var distancia=Double.parseDouble(entradaDatos.nextLine());

        //se establese variable de tarifa
        var tarifa=0.0;
        //verificamos cada caso con los datos proporcionados

        if (totalCompra>=50000 && distancia<=20){
            tarifa=0.0; //si el cliente compra mas de 50mil y su distancia
                        // es menor a 20 km la tarifa es cero
        }
        else if(totalCompra>=50000){
            tarifa=30.0; // si solo su compra es mayor o igual a 50 mil pesos
                            // tarifa es de 30 pesos
        }
        else if(totalCompra>=25000 && totalCompra<=49999){
            tarifa=150.0; //si su compra esta entre 25mil y 49mil
                            //tarifa es 150 pesos
        }
        else if(totalCompra<25000){
            tarifa=300.0; //si su compra es menor que 25 mil
                            // su tarifa es 300 pesos por Km
        }
        //imprimiendo al usuario en pantalla por cada caso
        if(tarifa!=0){
            var costoDespacho=tarifa*distancia;
            var montoTotalconDespacho=totalCompra+costoDespacho;
            System.out.println("---Registro de usuario y calculo de compra-----");
            System.out.println("\tNombre de Usuario: "+nombreUsuario);
            System.out.println("\tEdad del Usuario: "+edad+" años");
            System.out.println("\tCorreo electronico: "+correoElectronico);
            System.out.println("\tMonto de compra: "+totalCompra+"$");
            System.out.println("\tTarifa de despacho: "+tarifa+"$");
            System.out.println("\tCosto de despacho: "+costoDespacho+"$");
            System.out.println("\tMonto compra con despacho: "+montoTotalconDespacho+"$");
            //en imprimiendo datos en caso de no tener tarifa de despacho
        }else {
            System.out.println("----Registro de usuario y calculo de compra -----");
            System.out.println("\tNombre de Usuario: "+nombreUsuario);
            System.out.println("\tEdad del Usuario: "+edad+" años");
            System.out.println("\tCorreo electronico: "+correoElectronico);
            System.out.println("\tMonto de compra: "+totalCompra+"$");
        }

    }
}
