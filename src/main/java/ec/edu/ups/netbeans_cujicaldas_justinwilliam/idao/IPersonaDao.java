/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.netbeans_cujicaldas_justinwilliam.idao;

import ec.edu.ups.netbeans_cujicaldas_justinwilliam.modelo.Persona;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IPersonaDao {
    public void agregarPersona(Persona persona);
    public Persona buscarPersona(int id);
    public List<Persona> listarPersona();
}
