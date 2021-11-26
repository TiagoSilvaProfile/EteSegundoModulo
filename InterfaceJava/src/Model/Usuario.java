/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tiago
 */
public class Usuario extends Pessoa {
    
    private String senha;
    private String nivelacesso;

    public Usuario(String senha, String nivelacesso, int id, String nome, char sexo, String datanascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, datanascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelacesso = nivelacesso;
    }

    public Usuario( int id, String nome, char sexo, String dataNascimento, String telefone,String email, String rg, String senha, String nivelacesso ) {
        super(id, nome);
        this.senha = senha;
        this.nivelacesso = nivelacesso;
    }

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    /*public Usuario(String nome, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(String nivelacesso) {
        this.nivelacesso = nivelacesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

}
