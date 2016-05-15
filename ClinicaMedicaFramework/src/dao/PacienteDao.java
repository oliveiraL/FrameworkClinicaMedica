package dao;

import dominio.Paciente;
import java.util.ArrayList;

public class PacienteDao {

    private GenericDao genericDao;
    private ArrayList<Paciente> pacientes;

    public PacienteDao(String caminho) {
        this.genericDao = new GenericDao(caminho);
        this.pacientes = new ArrayList<>();
    }

    public boolean existe(Paciente paciente) {
        return false;
    }

    public void salvar(Paciente paciente) {
        pacientes.add(paciente);
        genericDao.salvar(pacientes);
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
