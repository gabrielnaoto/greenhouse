/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.uc;

import br.udesc.greenhouse.modelo.dao.jpa.JPAUsuarioDAO;
import br.udesc.greenhouse.modelo.entidade.Usuario;

/**
 *
 * @author ignoi
 */
public class NewClass {
    
    public static void main(String[] args) {
        JPAUsuarioDAO dao = new JPAUsuarioDAO();
        int i = 0;
        for (char a = 'a'; a <= 'z'; a++) {
            Usuario u = new Usuario();
            u.setCpf(getCPF(Integer.toString((int )Math.ceil(Math.random() * 1000000000))));
            u.setNome("user" + a);
            u.setEmail(a + "@email.com");
            dao.inserir(u);
            i++;
        }
    }
    
    public static String getCPF(String cpf){
        String resultado = "";
        resultado += cpf;
        for (int i = cpf.length(); i < 11; i++) {
            resultado += "0";
        }
        
        return resultado;
    }
    
}
