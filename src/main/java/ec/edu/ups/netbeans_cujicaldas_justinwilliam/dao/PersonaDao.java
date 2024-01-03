/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.dao;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IPersonaDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Cliente;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Empleado;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PersonaDao implements IPersonaDao{

    private List<Persona> listaPersonas;

    public PersonaDao() {
        listaPersonas = new ArrayList<>();
    }

    
    @Override
    public void agregarPersona(Persona persona) {
        if (persona instanceof Cliente) {
            listaPersonas.add(persona);
        }else if(persona instanceof Empleado){
            listaPersonas.add(persona);
        }
    }

    @Override
    public Persona buscarPersona(int id) {
        for (Persona listaPersona : listaPersonas) {
            if(listaPersona.getId() == id){
                return  listaPersona;
            }
        }
        return null;
    }

    @Override
    public List<Persona> listarPersona() {
        return listaPersonas;
    }
    
}
