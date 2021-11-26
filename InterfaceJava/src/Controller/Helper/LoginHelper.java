/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import view.Login;

/**
 *
 * @author tiago
 */
    public class LoginHelper implements IHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        
        String nome = view.getTextEntrar().getText();
        String senha = view.getPassword().getText();
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo; 
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextEntrar().setText(nome);
        view.getPassword().setText(senha);
        
    }
    
    public void limparTela(){
        view.getTextEntrar().setText("");
        view.getPassword().setText("");
    }
}
