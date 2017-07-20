/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.EnderecoDAO;
import Model.Endereco;
import java.util.ArrayList;

/**
 *
 * @author Diogenes's
 */
public class Teste {

    public static void main(String[] args) {
//        Endereco endereco = new Endereco();
//        endereco.setLogradouro("rua Tal");
//        endereco.setNumero(97);
//        endereco.setCidade("cidade Tal");
//        endereco.setEstado("estado Tal");

        EnderecoDAO endDAO = new EnderecoDAO();
//        if (endDAO.cadastrar(endereco)){
//            System.out.println("Cadastrado com sucesso");
//        } else {
//            System.out.println("Erro");
//        }

//        ArrayList<Endereco> enderecos = (ArrayList<Endereco>) endDAO.consultarTodos();

//        for (int i = 0; i < enderecos.size(); i++) {
//            System.out.println(enderecos.get(i).getIdEndereco());
//            System.out.println(enderecos.get(i).getLogradouro());
//            System.out.println(enderecos.get(i).getNumero());
//            System.out.println(enderecos.get(i).getCidade());
//            System.out.println(enderecos.get(i).getEstado());
//        }
        
        Endereco end1 = endDAO.consultarPorId(2);
        System.out.println(end1.getIdEndereco());
        System.out.println(end1.getLogradouro());
        System.out.println(end1.getNumero());
        System.out.println(end1.getCidade());
        System.out.println(end1.getEstado());
    }
}
