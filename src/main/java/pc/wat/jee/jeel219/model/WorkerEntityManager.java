/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.wat.jee.jeel219.model;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@ApplicationScoped
public class WorkerEntityManager {
    final private String PU = "pc.wat.jee_JEEL219_war_1.0-SNAPSHOTPU";
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU);
    private EntityManager em = Persistence.createEntityManagerFactory(PU).createEntityManager();
    
    public List<WorkerEntity> getAllWorkers(){
        List<WorkerEntity> result = new ArrayList<>();
        CriteriaBuilder cb = emf.getCriteriaBuilder();
        CriteriaQuery<WorkerEntity> cq = cb.createQuery(WorkerEntity.class);
        Root<WorkerEntity> rootOfQuery = cq.from(WorkerEntity.class);
        
        cq.select(rootOfQuery);
        //EntityManager em = emf.createEntityManager();
        //em.create ("SELECT w FROM WORKERS").getResultList();
        result.addAll( em.createQuery(cq).getResultList());
        //em.close();
        return result;
    }
    
    public void saveWorker(WorkerEntity toSave){
        //EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(toSave);
        em.getTransaction().commit();
        //em.close();
    }
}
