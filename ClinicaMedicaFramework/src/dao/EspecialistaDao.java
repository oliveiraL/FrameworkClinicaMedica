package dao;


import dominio.Especialista;



public class EspecialistaDao extends GenericDao<Especialista>{


    public EspecialistaDao() {
        super(System.getProperty("user.dir")+ "/src/xmlVeterinaria/especialista.xml");
        System.out.println(listagem.size());
        
    }

    public void salvar(Especialista especialista) {
        especialista.setId(listagem.size()+1);
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

    
    public Especialista buscar(String CPF){
        Especialista especialista = null;
        for(Especialista aux : listagem){
            if(aux.getCPF() == null ? CPF == null : aux.getCPF().equals(CPF))
                especialista = aux;
        }
        
        return especialista;
    }



}
