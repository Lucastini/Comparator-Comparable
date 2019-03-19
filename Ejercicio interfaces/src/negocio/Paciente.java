
package negocio;

/**
 *
 * @author Mosqueteros
 */
public class Paciente implements Comparable<Paciente>{
    private int historiaClin;
    private String nombre;
    private String apellido;
    private int edad;
    private static int num=1;
    
    public Paciente(String nom, String ape, int edad){
        historiaClin=num;
        num++;
        nombre=nom;
        apellido=ape;
        this.edad=edad;
    }

    public int getHistoriaClin() {
        return historiaClin;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Historia clinica Nº: "+historiaClin+", Apellido: "+apellido+", Nombre: "+nombre+", Edad: "+edad;
    }

    @Override
    public int compareTo(Paciente t){
        return edad-t.edad;
    }

    
    
    
}
