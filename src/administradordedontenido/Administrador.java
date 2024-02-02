package administradordedontenido;

public class Administrador {
    private Archivo[] almacen;

    public Administrador() {
        
        almacen = new Archivo[10];
    }
    
    public void registrarArchivo(){
        almacen[0] = new Archivo("imagen", "importante.jpg", 35, "/root", "null", 1);
        almacen[1] = new Archivo("video", "cars.mp4", 680, "/home", "null", 2);
        almacen[2] = new Archivo("cpp", "main.cpp", 35, "/home/documents", "C++", 3);
    }
    
    public void leerArchivos(){
        System.out.println("Nombre de la primera persona: " + almacen[0].getTipoContenido());
        System.out.println("Edad de la segunda persona: " + almacen[1].getNombre());
        System.out.println("Nombre de la primera persona: " + almacen[2].getLenguaje());
    }

}
