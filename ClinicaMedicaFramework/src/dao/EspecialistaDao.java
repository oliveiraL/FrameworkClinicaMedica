package dao;

import dominio.Especialista;
import java.util.ArrayList;


public class EspecialistaDao{

    private GenericDao genericDao;
    
    private ArrayList<Especialista> especialistas; 

    public EspecialistaDao(String caminho) {
        this.genericDao = new GenericDao(caminho);
        this.especialistas = new ArrayList<>();
    }

    public boolean existe(Especialista especialista) {
        return false;
    }

    public void salvar(Especialista especialista) {
        especialistas.add(especialista);
        genericDao.salvar(especialistas);
    }

    public void atualizar(Especialista especialista) {
        especialistas.stream().filter((aux) -> (aux.getId() == especialista.getId())).forEach((aux) -> {
            aux = especialista;
        });
        genericDao.atualizar(especialistas);
    }

    public void remover(Especialista especialista) {
        especialistas.stream().filter((aux) -> (aux.getId() == especialista.getId())).forEach((aux) -> {
            especialistas.remove(aux);
        });
        genericDao.remover(especialistas);
    }

    public ArrayList<Especialista> listar() {
        return (ArrayList<Especialista>) genericDao.listar();
    }
    
    public Especialista buscar(int id){
        Especialista especialista = null;
        for(Especialista aux : especialistas){
            if(aux.getId() == id)
                especialista = aux;
        }
        
        return especialista;
    }


}
