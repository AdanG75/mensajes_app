import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        do {
            System.out.println("----------------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1.-Crear Mensaje");
            System.out.println("2.- Listar mensajes");
            System.out.println("3.- Editar Mensajes");
            System.out.println("4.- Eliminar Mensaje");
            System.out.println("5.- Salir");
            System.out.println("\nFavor de ingresar una opción: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    MessagesService.crearMensaje();
                    break;
                case 2:
                    MessagesService.listarMensaje();
                    break;
                case 3:
                    MessagesService.editarMensaje();
                    break;
                case 4:
                    MessagesService.borrarMensaje();
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("\nOpcion no econtrada. Favor de intentarlo de nuevo :)");
            }
        }while(opcion != 5);

        sc.close();

//        Conexion conexion = new Conexion();
//
//        try(Connection cnx = conexion.get_connection()){
//
//        }catch(SQLException e){
//            System.out.println(e);
//        }
    }
}
