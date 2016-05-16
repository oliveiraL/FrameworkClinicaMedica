/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EspecialidadeDao;
import dominio.Especialidade;

/**
 *
 * @author lucio
 */
public class GerenciarEspecialidadeController {
    private EspecialidadeDao especialidadeDao;

    public GerenciarEspecialidadeController() {
        especialidadeDao = new EspecialidadeDao();
    }
    
    public void cadastrar(Especialidade especialidade){
        especialidadeDao.salvar(especialidade);
    }
    
    public void atualizar(Especialidade especialidade){
        especialidadeDao.atualizar(especialidade);
    }
    public void remover(Especialidade especialidade){
        especialidadeDao.remover(especialidade);
    }
    
}
