package administradordedontenido;

import java.util.*;
public class Administrador {
    private Archivo[] almacen;
    boolean hayArchivos = false;
    int contArchivos = 0;
    Scanner sc = new Scanner(System.in);

    public Administrador() {
        
        almacen = new Archivo[10];
    }
    
    public void registrarArchivoX(){
        hayArchivos = true;
        almacen[0] = new Archivo("imagen", "importante.jpg", 35, "/root", "n/a", 1);
        almacen[1] = new Archivo("video", "cars.mp4", 680, "/home", "n/a", 2);
        almacen[2] = new Archivo("cpp", "main.cpp", 35, "/home/documents", "C++", 3);
    }
    
    public void registrarArchivo(){
        hayArchivos = true;
        System.out.println("Ingresa 1 si el archivo es de programación.");
        System.out.println("Ingresa cualquier otro numero si no aplica.");
        int progra = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("\n");
        String lenguaje = "";
        if(progra == 1){
            System.out.print("Ingresa el lenguaje del archivo: ");
            lenguaje = sc.nextLine();
        }else{
            lenguaje = "n/a";
        }
        System.out.print("Ingresa el tipo de archivo: ");
        String tipo = sc.nextLine();
        System.out.print("Ingresa el nombre del archivo: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa el tamano del archivo: ");
        int tamano = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el path: ");
        String path = sc.nextLine();
        almacen[contArchivos] = new Archivo(tipo, nombre, tamano, path, lenguaje, contArchivos);
        contArchivos++;
    }
    
    public void mostrarRegistros() {
        if (hayArchivos) {
            System.out.printf("%-5s %-12s %-30s %-10s %-30s %-10s%n", "ID", "TIPO", "NOMBRE", "TAMANO", "PATH", "LENGUAJE");
            for (int i = 0; i < contArchivos; i++) {
                System.out.printf("%-5s %-12s %-30s %-10s %-30s %-10s%n",
                        almacen[i].getLlave(), almacen[i].getTipoContenido(), almacen[i].getNombre(),
                        almacen[i].getSize(), almacen[i].getPath(), almacen[i].getLenguaje());
            }
        } else {
            System.out.println("No hay archivos registrados aún...");
        }
    }

}
