/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.controlador;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao.IPersonaDao;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Persona;
import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.vista.PersonaVista;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorPersona {
    private PersonaVista personaVista;
    private IPersonaDao personaDAO;

    public ControladorPersona(PersonaVista personaVista, IPersonaDao personaDAO) {
        this.personaVista = personaVista;
        this.personaDAO = personaDAO;
    }

    public void mostrarListaPersonas() {
        List<Persona> personas = personaDAO.listarPersona();
        personaVista.mostrarListaPersonas(personas);
    }

    public void mostrarDetallesPersona(int idPersona) {
        Persona persona = personaDAO.buscarPersona(idPersona);
        personaVista.mostrarDetallesPersona(persona);
    }

    public void crearPersona(boolean esCliente) {
        Persona nuevaPersona = personaVista.solicitarDatosCreacionPersona(esCliente);
        
        //nuevaPersona.setIdPersona(id);
        personaDAO.agregarPersona(nuevaPersona);
    }
}
