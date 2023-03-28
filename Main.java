import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       // ArrayList<Cliente> clientes = new ArrayList<>();

       // LocalDate fecha1 = LocalDate.of(2022, 04, 15);
        
       // LocalDate fecha2 = LocalDate.of(2021, 05, 30);
        
       // Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
       // Cuenta cuenta2 = new Cuenta(2, true, 350.0f);

       // Prestamo prestamo1 = new Prestamo(1, 2000f);

       // Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
       // Cuenta cuenta4 = new Cuenta(2, true, 550.0f);

       // Prestamo prestamo2 = new Prestamo(1, 5000f);
        
       // Prestamo[] prestamos2 = {prestamo2};
       // Cuenta[] cuentas2 = {cuenta3, cuenta4};

        
       // ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
       //  "Richard@Fort.com", fecha2, cuentas2, 1000.0f, prestamos2);

       // Prestamo[] prestamos1 = {prestamo1};
       // Cuenta[] cuentas1 = {cuenta1, cuenta2};

       // ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
       // "Richard@Fort.com", fecha1, cuentas1, 2000.0f, prestamos1);

        //System.out.println("El balance total de cuentas del cliente es: " + clienteA1.calculoBalance());
        //System.out.println("El prestamo al que el cliente puede aplicar es de: " + clienteA1.calculoPrestamo());

        //clientes.add(clienteA1);
        //clientes.add(clienteB1);

        //System.out.println(clientes);

        /*
Definir los parametros que van a emplearse para la creación de un cliente. 
Establecer un bloque con if statements para determinar si ese cliente, será creado con
caracteristicas de clienteA, B o estudiante.
Si ingreso superaba 2000 y la antiguedad superaba o igualaba los 12 meses
Cliente A
sino ClienteB
Si ingresos no es mayor a cero
Estudiante

Definir un nuevo long dentro de main, llamado idBuscado, 
generar el codigo que permita rercorrer el arreglo de clientes,
 y si encuentra alguno, con dicho id, lo borre.
ArrayList<Cliente> clientes = new ArrayList<>();
clientes.add(cliente);
clientes.remove(0);
 */     
        // --------------------CLIENTES--------------------------
        LocalDate fecha1 = LocalDate.of(2020, 11, 19);
        Cuenta cuenta1 = new Cuenta(1, true, 2500f);
        Prestamo prestamo1 = new Prestamo(1, 0f);
        long idCliente = 1l;
        String nombreCliente = "Enzo";
        String apellidoCliente = "Ferrari";
        String telefonoCliente = "781739812";
        String emailCliente = "eadadhj@gmail.com";
        float ingresoMensualCliente= 24000f;
        
        //---------------------IFSTATEMENTS----------------------
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaCliente = fecha1;
        float ingresoMin = 2000f;
        float ingresoCliente = ingresoMensualCliente;
        long antiguedad = ChronoUnit.MONTHS.between(fechaActual, fechaCliente);

        if(antiguedad >= 12 && ingresoCliente >= ingresoMin){
            
            ClienteA clienteA1 = new ClienteA(idCliente, nombreCliente, 
            apellidoCliente, telefonoCliente, emailCliente, fecha1, 
            cuenta1, ingresoMensualCliente, prestamo1);

        }else if(ingresoCliente > 0){  

            ClienteB clienteB1 = new ClienteB(idCliente, nombreCliente, 
            apellidoCliente, telefonoCliente, emailCliente, fecha1, 
            cuenta1, ingresoMensualCliente, prestamo1);

        }else{

            Estudiante estudiante1 = Estudiante(idCliente, nombreCliente, 
            apellidoCliente, telefonoCliente, emailCliente, 
            fecha1, cuenta1);
        }

        //--------------------ARRAYLIST CLIENTES-----------------
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add();
  

        //----------------------IDBUSCADO------------------------
        long idBuscado = 0l;
        for(int i=0; clientes.size() >=i ; i++){
            if (idBuscado == clientes.get(i).getIdCliente()){
            clientes.remove(i);
            }
        }
    }

    
}
