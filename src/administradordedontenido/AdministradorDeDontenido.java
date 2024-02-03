package administradordedontenido;

/**
 *
 * @author ricar
 */
public class AdministradorDeDontenido {

    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        
        administrador.registrarArchivo();
        administrador.leerArchivosEnOrden();
    }
    
}
