/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author tiago
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        //Pegar um usuario da view
    Usuario usuario  = helper.obterModelo();
        
        //Pesquisar usuario no banco de dados
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o usuario da view tiver mesmo usuario e senha que o usuario vindo do banco direiconar para o menu principal 
        if (usuarioAutenticado != null){
            //Navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibemensagem("Usuario ou senha incorreto");
        }
    }            
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do Banco de Dados");
        
        this.view.exibemensagem("Executei o fiz tarefa");
        
    }       
    
    
}
