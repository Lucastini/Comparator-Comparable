
package negocio;

import java.util.Comparator;

/**
 *
 * @author Mosqueteros
 */
public class OrdenPorNombre implements Comparator<Paciente>{
    
    @Override
    public int compare(Paciente p1,Paciente p2){
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    }
    
}
