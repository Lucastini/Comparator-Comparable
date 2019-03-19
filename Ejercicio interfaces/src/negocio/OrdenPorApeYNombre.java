
package negocio;

import java.util.Comparator;

/**
 *
 * @author Mosqueteros
 */
public class OrdenPorApeYNombre implements Comparator<Paciente>{
    
    @Override
    public int compare(Paciente p1, Paciente p2){
        int res=p1.getApellido().compareToIgnoreCase(p2.getApellido());
        if(res==0)
            res=p1.getNombre().compareToIgnoreCase(p2.getNombre());
        return res;
    }
    
}
