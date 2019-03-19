
package negocio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mosqueteros
 */
public class Clinica {
    private String razoSocial;
    private ArrayList<Paciente> pacientes;
    
    public Clinica(String rz,int tam){
        razoSocial=rz;
        pacientes=new ArrayList<>(tam);
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public String getRazoSocial() {
        return razoSocial;
    }

    public void setRazoSocial(String razoSocial) {
        this.razoSocial = razoSocial;
    }
    
    public boolean addPaciente(Paciente paciente){
        return pacientes.add(paciente);
    }
    
    /*public ArrayList pacientesOrdenados(){
        ArrayList<Paciente> aux=new ArrayList(pacientes);
        int tam=aux.size();
        Paciente temp=null;
        for(int i=0;i<tam-1;i++)
            for(int j=i+1;j<tam;j++)
                if(aux.get(i).getEdad()>aux.get(j).getEdad()){
                        temp=aux.get(i);
                        aux.set(i, aux.get(j));
                        aux.set(j, temp);
                }
        return aux;            
    }*/
    public String toString(){
        String aux="Clinica nombre: "+razoSocial+", Datos de los Pacientes: ";
        String aux2=aux;
        for(Paciente iter:pacientes)
            aux+="\n"+iter.toString();
        if(aux.equals(aux2))
            aux+="\nLa clinica aun no tiene pacientes";
        return aux;
    }
    
    public ArrayList pacientesOrdenadosXEdad(){
        ArrayList<Paciente> aux=new ArrayList(pacientes);
        Collections.sort(aux);
        return aux;            
    }
       
    public String mostrarPacientesOrdenados(ArrayList lista){
        String aux="Clinica nombre: "+razoSocial+", Datos de los Pacientes: ";
        String aux2=aux;
        ArrayList<Paciente> pacOrd=lista;
        for(Paciente iter:pacOrd)
            aux+="\n"+iter.toString();
        if(aux.equals(aux2))
            aux+="\nLa clinica aun no tiene pacientes";
        return aux;
    }
    
    
    
}
