package dao;

import dominio.Especialista;
import java.util.ArrayList;


public class EspecialistaDao extends GenericDao<Especialista>{


    public EspecialistaDao() {
        super(System.getProperty("user.dir")+ "/src/xmlVeterinaria/especialista.xml");
        System.out.println(listagem.size());
        
    }

    public boolean existe(Especialista especialista) {
        return false;
    }

    public void salvar(Especialista especialista) {
        listagem.add(especialista);
        super.salvar();
    }

    public void atualizar(Especialista especialista) {
        listagem.stream().filter((aux) -> (aux.getId() == especialista.getId())).forEach((aux) -> {
            aux = especialista;
        });
        super.atualizar();
    }

    public void remover(Especialista especialista) {
        listagem.stream().filter((aux) -> (aux.getId() == especialista.getId())).forEach((aux) -> {
            listagem.remove(aux);
        });
        super.remover();
    }

    
    public Especialista buscar(int id){
        Especialista especialista = null;
        for(Especialista aux : listagem){
            if(aux.getId() == id)
                especialista = aux;
        }
        
        return especialista;
    }


}
