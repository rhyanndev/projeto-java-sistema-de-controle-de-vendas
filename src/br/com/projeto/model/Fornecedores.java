/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.model;

/**
 *
 * @author Loja
 */
public class Fornecedores extends Clientes {
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    private String cnpj;
    
    //sobrescrita
    @Override
    public String toString(){
        
        return this.getNome();
    
    }
    
    
}
