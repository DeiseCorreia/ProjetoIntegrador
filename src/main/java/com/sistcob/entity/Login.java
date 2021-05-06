/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistcob.entity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.eclipse.persistence.sessions.Session;
/**
 *
 * @author joual
 */
@RequestScoped
@ManagedBean
public class Login {
    
    
   String login;
   String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
   public String login(){
       if(login.equals("sistcob")&& senha.equals("cob")){
           
           return "/home/home.xhtml";
       }
       else{
           return "index.xhtml";
       }
   }
   
   
   
}
