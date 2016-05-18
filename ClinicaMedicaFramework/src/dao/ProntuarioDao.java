package dao;

import dominio.Prontuario;



public class ProntuarioDao extends GenericDao<Prontuario>{

    public ProntuarioDao() {
        super(System.getProperty("user.dir")+ "/src/xmlVeterinaria/prontuario.xml");
    }

}
