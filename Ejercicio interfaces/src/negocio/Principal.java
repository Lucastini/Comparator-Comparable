
package negocio;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        
        Paciente p1,p2,p3,p4,p5;
        p1=new Paciente("Gladis","Ferrer",40);
        p2=new Paciente("Edgar","ferrer",42);
        p3=new Paciente("Aldo","Sanchez",45);
        p4=new Paciente("Lucas","Tini",37);
        p5=new Paciente("Mariel","Cufre",39);
        
        Clinica c1=new Clinica("Carafa", 10);
        System.out.println("Agregando paciente 1: "+c1.addPaciente(p1));
        System.out.println("Agregando paciente 2: "+c1.addPaciente(p2));
        System.out.println("Agregando paciente 3: "+c1.addPaciente(p3));
        System.out.println("Agregando paciente 4: "+c1.addPaciente(p4));
        System.out.println("Agregando paciente 5: "+c1.addPaciente(p5));
        
        System.out.println("\nPacientes en orden de carga:\n"+c1.toString());
        System.out.println("\nPacientes ordenados por edad\n"+c1.mostrarPacientesOrdenados(c1.pacientesOrdenadosXEdad()));
        
        ArrayList<Paciente> clonPacientes=new ArrayList(c1.getPacientes());
        //Collections.sort(clonPacientes, new OrdenXLegajo());
        //Collections.sort(clonPacientes, new OrdenPorApeYNombre());
        Collections.sort(clonPacientes, new OrdenPorNombre());
        System.out.println("\nOrdenados segun criterio por parametro: \n"+c1.mostrarPacientesOrdenados(clonPacientes));
        System.out.println("\nPacientes orden de carga: \n"+c1.toString());
        
    }
    
}
