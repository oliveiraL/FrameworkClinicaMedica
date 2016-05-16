package dao;

import dominio.Paciente;
import java.util.ArrayList;

public class PacienteDao {

    private final GenericDao genericDao;
    private final ArrayList<Paciente> pacientes;
    public PacienteDao() {
        this.genericDao = new GenericDao(System.getProperty("user.dir")+ "/src/xmlVeterinaria/paciente.xml");
        Object obj = genericDao.listar();
        if(obj != null)
            this.pacientes = (ArrayList<Paciente>)obj;
        else
            this.pacientes = new ArrayList<>();
    }

    public boolean existe(Paciente paciente) {
        return false;
    }

    public void salvar(Paciente paciente) {
        paciente.setId(pacientes.size()+1);
        pacientes.add(paciente);
        genericDao.salvar(pacientes);
        System.err.println(pacientes.size());
    }

    public void atualizar(Paciente paciente) {
        pacientes.stream().filter((aux) -> (aux.getId() == paciente.getId())).forEach((aux) -> {
            aux = paciente;
        });
        genericDao.atualizar(pacientes);
    }

    public void remover(Paciente paciente) {
        pacientes.stream().filter((aux) -> (aux.getId() == paciente.getId())).forEach((aux) -> {
            pacientes.remove(aux);
        });
        genericDao.remover(pacientes);
    }

    public ArrayList<Paciente> listar() {
        return (ArrayList<Paciente>) genericDao.listar();
    }
    
    public Paciente buscar(int id){
        Paciente paciente = null;
        for(Paciente aux : pacientes){
            if(aux.getId() == id)
                paciente = aux;
        }
        
        return paciente;
    }

}
