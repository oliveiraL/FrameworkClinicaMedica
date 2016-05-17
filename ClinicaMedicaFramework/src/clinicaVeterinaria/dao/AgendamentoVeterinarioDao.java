/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.dao;
import dao.AgendamentoDao;
import dominio.Especialista;
import java.util.Date;
/**
 *
 * @author lucio
 */
public class AgendamentoVeterinarioDao extends AgendamentoDao{

    public AgendamentoVeterinarioDao() {
        super(System.getProperty("user.dir")+ "/src/xmlVeterinaria/agendamento.xml");
    }

    
}
