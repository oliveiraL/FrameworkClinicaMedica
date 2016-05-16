/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dominio.Especialidade;
/**
 *
 * @author lucio
 */
public class EspecialidadeDao extends GenericDao<Especialidade>{
    
    public EspecialidadeDao() {
        super(System.getProperty("user.dir")+ "/src/xmlVeterinaria/especialidade.xml");
    }
    
    public void salvar(Especialidade especialidade) {
        especialidade.setId(listagem.size()+1);
        listagem.add(especialidade);
        super.salvar();
    }

    public void atualizar(Especialidade especialidade) {
        listagem.stream().filter((aux) -> (aux.getId() == especialidade.getId())).forEach((aux) -> {
            aux = especialidade;
        });
        super.atualizar();
    }

    public void remover(Especialidade especialidade) {
        listagem.stream().filter((aux) -> (aux.getId() == especialidade.getId())).forEach((aux) -> {
            listagem.remove(aux);
        });
        super.remover();
    }

    
    public Especialidade buscar(int id){
        Especialidade especialidade = null;
        for(Especialidade aux : listagem){
            if(aux.getId() == id)
                especialidade = aux;
        }
        
        return especialidade;
    }
    
}
