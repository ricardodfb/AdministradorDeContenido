package administradordedontenido;

import java.util.*;
public class Administrador {
    private Archivo[] almacen;
    boolean hayArchivos = false;
    int contArchivos = 1;
    Scanner sc = new Scanner(System.in);
    

    public Administrador() {
        
        almacen = new Archivo[10];
        for (int i = 0; i < almacen.length; i++) {
            almacen[i] = new Archivo("", "", 0, "", "", 0);
        }
    }
    
    public void registrarArchivoX(){
        hayArchivos = true;
        almacen[0] = new Archivo("imagen", "vacaciones.jpg", 3, "/home/pictures", "n/a", 1);
        almacen[1] = new Archivo("video", "cars.mp4", 680, "/home", "n/a", 2);
        almacen[2] = new Archivo("programa", "main.cpp", 35, "/home/documents", "C++", 3);
        almacen[3] = new Archivo("programa", "holaMundo.py", 13, "/documents", "python", 4);
        almacen[4] = new Archivo("dibujo", "plantaBaja.dwg", 15, "/home/documents", "n/a", 5);
        almacen[5] = new Archivo("video", "theFlash.mp4", 980, "/videos", "n/a", 6);
        almacen[6] = new Archivo("imagen", "importante.jpg", 35, "/root", "n/a", 7);
        contArchivos = 7;
    }
    
    public void registrarArchivo(){
        hayArchivos = true;
        System.out.println("Ingresa 1 si el archivo es de programacion.");
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
                // Verificar si el archivo tiene información antes de imprimir
                if (!almacen[i].getTipoContenido().isEmpty() &&
                    !almacen[i].getNombre().isEmpty() &&
                    almacen[i].getSize() > 0 &&
                    !almacen[i].getPath().isEmpty()) {
                    System.out.printf("%-5s %-12s %-30s %-10s %-30s %-10s%n",
                            almacen[i].getLlave(), almacen[i].getTipoContenido(), almacen[i].getNombre(),
                            almacen[i].getSize(), almacen[i].getPath(), almacen[i].getLenguaje());
                }
            }
        } else {
            System.out.println("No hay archivos registrados aún...");
        }
    }

    
    //PENDIENTEEEE.....................
    public int buscar(int llave){
        if (hayArchivos) {
            System.out.printf("%-5s %-12s %-30s %-10s %-30s %-10s%n", "ID", "TIPO", "NOMBRE", "TAMANO", "PATH", "LENGUAJE");
            for (int i = 0; i < contArchivos; i++) {
                if(almacen[i].getLlave() == llave){
                    System.out.printf("%-5s %-12s %-30s %-10s %-30s %-10s%n",
                        almacen[i].getLlave(), almacen[i].getTipoContenido(), almacen[i].getNombre(),
                        almacen[i].getSize(), almacen[i].getPath(), almacen[i].getLenguaje());
                }
            }
        } else {
            System.out.println("No hay archivos registrados aún...");
        }
        
        return llave;
    }
    
    public void eliminarArchivo(int indice) {
        if (hayArchivos && indice >= 0 && indice < contArchivos) {
            for (int i = indice; i < contArchivos - 1; i++) {
                almacen[i] = almacen[i + 1];
            }

            // Asignar null al último elemento para evitar duplicación
            almacen[contArchivos - 1] = null;
            
            contArchivos--;

            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se puede eliminar el archivo. Índice no válido.");
        }
    }
    
    public void modificarArchivo(int llave) {
        if (hayArchivos) {
            boolean encontrado = false;
            for (int i = 0; i < contArchivos; i++) {
                if (almacen[i].getLlave() == llave) {
                    encontrado = true;
                    System.out.println("Archivo encontrado. ¿Qué datos deseas modificar?");
                    System.out.println("1. Tipo de Contenido");
                    System.out.println("2. Nombre");
                    System.out.println("3. Tamaño");
                    System.out.println("4. Path");
                    System.out.println("5. Lenguaje (solo para archivos de programación)");
                    System.out.print("Selecciona una opción: ");
                    Scanner sc = new Scanner(System.in);
                    int opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.print("Nuevo Tipo de Contenido: ");
                            String nuevoTipo = sc.nextLine();
                            almacen[i].setTipoContenido(nuevoTipo);
                            break;
                        case 2:
                            System.out.print("Nuevo Nombre: ");
                            String nuevoNombre = sc.nextLine();
                            almacen[i].setNombre(nuevoNombre);
                            break;
                        case 3:
                            System.out.print("Nuevo Tamaño: ");
                            int nuevoTamano = sc.nextInt();
                            almacen[i].setSize(nuevoTamano);
                            sc.nextLine();
                            break;
                        case 4:
                            System.out.print("Nuevo Path: ");
                            String nuevoPath = sc.nextLine();
                            almacen[i].setPath(nuevoPath);
                            break;
                        case 5:
                            if (!almacen[i].getLenguaje().equals("n/a")) {
                                System.out.print("Nuevo Lenguaje: ");
                                String nuevoLenguaje = sc.nextLine();
                                almacen[i].setLenguaje(nuevoLenguaje);
                            } else {
                                System.out.println("Este archivo no es de programación. No se puede modificar el lenguaje.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }

                    System.out.println("Archivo modificado correctamente.");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Archivo no encontrado con la llave proporcionada.");
            }
        } else {
            System.out.println("No hay archivos registrados aún...");
        }
    }
    
    public void ordenarArchivos(){
        Archivo aux;
        boolean ordenado;
        do {
            ordenado = true;
            for(int i = 0; i < contArchivos - 1; i++) {
                for(int j = i + 1; j < contArchivos; j++) {
                    if(almacen[i].getNombre().compareTo(almacen[j].getNombre()) > 0) {
                        aux = almacen[i];
                        almacen[i] = almacen[j];
                        almacen[j] = aux;
                        ordenado = false;
                    }
                }
            }
        } while (!ordenado);
    }

}
