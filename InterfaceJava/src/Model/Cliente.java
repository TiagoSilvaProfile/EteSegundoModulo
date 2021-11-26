/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Cliente extends Pessoa {

    public static boolean add(ArrayList<Cliente> clientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    private String endereco;
    private String cep;
    private String descricao;

    public Cliente(int id, String nome, char sexo, String datanascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, datanascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
        this.nome = nome;
        
    }
    
    
    public Cliente(String endereco, String cep, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     *
     * @return
     */
    @Override
  public String toString(){
      return getNome();
      
  }
   
    
}
