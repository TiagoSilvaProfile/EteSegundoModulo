/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author tiago
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
public void atualizaTabel(){
    
    // Buscar Lista com agendamento do banco de dados
    
    AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
    
    //Exibir esta lista na view
    
    helper.preencherTabela(agendamentos);
    }

public void atualizaCliente(){
    //Buscar cliente no Banco de Dados
     ClienteDAO clienteDAO = new ClienteDAO();
     ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
    //Exibir cliente no Combobox Cliente
        helper.preencherClientes(clientes);
        
    }
    
public void atualizaServico(){
    ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
}
                
public void atualizaValor(){
    Servico servico = helper.obterServico();
    helper.setarValor(servico.getValor());
    
     }    
public void agendar(){
    //buscar agendamento da tela
    Agendamento agendamento = helper.obterModelo();
    
    //Salvar objeto no banco de dados
    new AgendamentoDAO().insert(agendamento);
    
    atualizaTabela();
    helper.limparTela();
        
}

    private void atualizaTabela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
     
}
