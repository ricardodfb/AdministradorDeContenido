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
        
        System.out.println("ADMINISTRADOR DE CONTENIDO DIDÁCTICO");
        int op = 0;
        do{
            System.out.println("........................");
            System.out.println("1. Registro de archivos.");
            System.out.println("2. Mostrar registros.");
            System.out.println("0. Salir.");
            System.out.print("Selecciona una opción: ");
            op = sc.nextInt();
            switch (op){
                case 0:
                    System.out.println("\nGracias!!");
                    break;
                case 1:
                    System.out.println("REGISTRO DE ARCHIVOS");
                    admin.registrarArchivo();
                    break;
                case 2:
                    System.out.println("LECTURA DE ARCHIVOS");
                    admin.mostrarRegistros();
                    break;
                default:
                    System.out.println("\nOpcion no valida, vuela a intentarlo...\n");
            }
        }while(op!=0);
    }
    
}
