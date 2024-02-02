package administradordedontenido;

/**
 *
 * @author ricar
 */
public class AdministradorDeDontenido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        
        administrador.registrarArchivo();
        administrador.leerArchivos();
    }
    
}
