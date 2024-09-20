
package EjercicioVehiculo;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class ControlVehiculo {
    ArrayList registro = new ArrayList();
    Scanner in = new Scanner(System.in);
    
    void agregarVehiculo(){
        System.out.println("Digite la placa: ");
        String plac = in.next();
        System.out.println("Digite el modelo: ");
        int mod = in.nextInt();
        System.out.println("Digite el color: ");
        String color = in.next();
        
        Vehiculo car = new Vehiculo();
        car.setPlaca(plac);
        car.setModelo(mod);
        car.setColor(color);
        
        registro.add(car);
        
        System.out.println("Datos de los vehiculos registrados exitosamente!!");
                
    }
    
    void mostrarVehiculosRegistrados(){
        System.out.println("Listando Vehiculos...");
        for (int i = 0; i < registro.size(); i++) {
            Vehiculo mostVehiculo = (Vehiculo) registro.get(i);
            
            System.out.println(mostVehiculo.getPlaca() + " " + mostVehiculo.getModelo() + " " 
                    + mostVehiculo.getModelo());
            
        }
    }
    
    void buscarVehiculoxPlaca(){
        System.out.println("Buscando vehiculo....");
        System.out.println("Digite la placa: ");
        String placBuscar = in.next();
        
        boolean bandera = false;
        for (int i = 0; i < registro.size(); i++) {
            Vehiculo VehicEncontrado = (Vehiculo) registro.get(i);
            if(VehicEncontrado.getPlaca().equals(placBuscar)){
                System.out.println("Modelo: " + VehicEncontrado.getModelo());
                System.out.println("Color: " + VehicEncontrado.getColor());
                bandera = true;
            }
            if(bandera == false)
             System.out.println("Vehiculo no registrado...");
        }
         
    }
    
    void menu(){
        int opcion;
        do{
        System.out.println("---MENU DE OPCIONES---");
        System.out.println("1. Registrar Vehiculo");
        System.out.println("2. Mostrar los Vehiculos Registrados");
        System.out.println("3. Buscar Vehiculo por placa");
        System.out.println("4. Salir");
        System.out.println("\n --DIGITE UNA OPCION--");
        opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                this.agregarVehiculo();
                break;
            case 2:
                this.mostrarVehiculosRegistrados();
                break;
            case 3:
                this.buscarVehiculoxPlaca();
                break;
    }
   }while(opcion > 0 && opcion < 5);
}
}