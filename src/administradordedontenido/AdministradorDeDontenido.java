package administradordedontenido;

/**
 *
 * @author ricar
 */
import java.util.*;
public class AdministradorDeDontenido {

    public static void main(String[] args) {
        Administrador admin = new Administrador();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ADMINISTRADOR DE CONTENIDO DIDACTICO");
        int op = 0;
        do{
            System.out.println("........................");
            System.out.println("1. Registro de archivos.");
            System.out.println("2. Mostrar registros.");
            System.out.println("3. Buscar archivo por ID.");
            System.out.println("4. Eliminar archivo.");
            System.out.println("5. Modificar archivo.");
            System.out.println("0. Salir.");
            System.out.print("Selecciona una opcion: ");
            op = sc.nextInt();
            switch (op){
                case 0:
                    System.out.println("\nGracias!!");
                    break;
                case 1:
                    System.out.println("\nREGISTRO DE ARCHIVOS");
                    admin.registrarArchivo();
                    break;
                case 2:
                    System.out.println("\nLECTURA DE ARCHIVOS");
                    admin.mostrarRegistros();
                    break;
                case 3:
                    System.out.print("\nIngresa el ID del archivo que deseas visualizar:");
                    int llave = sc.nextInt();
                    sc.nextLine();
                    admin.buscar(llave);
                    break;
                case 4:
                    System.out.print("\nIngresa el ID del archivo que deseas eliminar: ");
                    int indiceEliminar = sc.nextInt();
                    admin.eliminarArchivo(indiceEliminar);
                    break;
                    
                case 5:
                    System.out.printf("\nIngresa el ID del archivo que deseas modificar: ");
                    int indiceModificar = sc.nextInt();
                    admin.modificarArchivo(indiceModificar);
                    break;
                default:
                    System.out.println("\nOpcion no valida, vuela a intentarlo...\n");
            }
        }while(op!=0);
    }
    
}