/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import entidades.Animal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author PABLO
 */
public class Util {
        
        public static void persistir(Object object){
                EntityManagerFactory factory = Persistence.createEntityManagerFactory("sistema");
                EntityManager em = factory.createEntityManager();
                
                em.getTransaction().begin();
                em.persist(object);
                em.getTransaction().commit();

                em.close();
                factory.close();
        }
        
}
