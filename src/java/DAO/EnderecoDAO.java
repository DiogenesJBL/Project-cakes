/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Endereco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import util.ConectaBanco;

/**
 *
 * @author Diogenes's
 */
public class EnderecoDAO {
    public boolean cadastrar(Endereco endereco){
        EntityManager em = ConectaBanco.getEntityManager();
        EntityTransaction et = em.getTransaction();
        
        et.begin();
        em.persist(endereco);
        et.commit();
        em.close();
        
        return true;
    } 
    
    public List<Endereco> consultarTodos (){
        EntityManager em = ConectaBanco.getEntityManager();
        Query query = em.createQuery("select e from Endereco as e", Endereco.class);
        
        List<Endereco> enderecos = query.getResultList();
        
        return enderecos;
    }
    
    public Endereco consultarPorId (int idEndereco){
        EntityManager em = ConectaBanco.getEntityManager();
        Endereco endereco = em.find(Endereco.class, idEndereco);
        
        return endereco;
    }
}
