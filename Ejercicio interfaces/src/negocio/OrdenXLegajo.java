
package negocio;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Mosqueteros
 */
public class OrdenXLegajo implements Comparator<Paciente>{

    @Override
    public int compare(Paciente t1, Paciente t2){
        return t2.getHistoriaClin()-t1.getHistoriaClin();
    }
    
    
    
}
