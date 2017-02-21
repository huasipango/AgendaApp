/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaapp;

/**
 *
 * @author israe
 */
import javax.persistence.*;

/**
 *
 * @author israe
 */
public class ManejoDB {
    EntityManagerFactory emf;
    EntityManager em;
    Usuarios c;
    
    public ManejoDB(){
        emf = Persistence.createEntityManagerFactory("AgendaAppPU");
        em = emf.createEntityManager();
    }
    
    public ManejoDB(Usuarios c){
        emf = Persistence.createEntityManagerFactory("AgendaAppPU");
        em = emf.createEntityManager();
        
        this.c = c;
    }
    
    public void close(){
        em.close();
        emf.close();
    }
    
    public void insertar (Usuarios c){
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    
    public Usuarios buscarPorId(int id){
        Usuarios c = em.find(Usuarios.class, id);
        
        return c;
    }
    
    public void borrar(Usuarios c){
        em.getTransaction().begin();
        Usuarios usuario = buscarPorId(c.getId());
        em.remove(usuario);
        em.getTransaction().commit();
        
        
    }
    
    public void actualizar(Usuarios c){
        Usuarios usuario = em.find(Usuarios.class, c.getId());
        em.getTransaction().begin();
        usuario.setNombre(c.getNombre());
        usuario.setApellido(c.getApellido());
        
        em.getTransaction().commit();
    }
}
