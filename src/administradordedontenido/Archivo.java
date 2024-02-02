package administradordedontenido;

/**
 *
 * @author ricar
 */
public class Archivo {
    private String tipoContenido;
    private String nombre;
    private int size;
    private String path;
    private String lenguaje;
    private int llave;

    public Archivo(String tipoContenido, String nombre, int size, String path, String lenguaje, int llave) {
        this.tipoContenido = tipoContenido;
        this.nombre = nombre;
        this.size = size;
        this.path = path;
        this.lenguaje = lenguaje;
        this.llave = llave;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }
}
