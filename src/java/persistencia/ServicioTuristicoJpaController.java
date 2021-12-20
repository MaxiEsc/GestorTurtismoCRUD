/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.ServicioTuristico;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Max Esc
 */
public class ServicioTuristicoJpaController implements Serializable {

    public ServicioTuristicoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ServicioTuristicoJpaController() {
        emf = Persistence.createEntityManagerFactory("TPFinalU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ServicioTuristico servicioTuristico) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(servicioTuristico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ServicioTuristico servicioTuristico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            servicioTuristico = em.merge(servicioTuristico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = servicioTuristico.getCodigo();
                if (findServicioTuristico(id) == null) {
                    throw new NonexistentEntityException("The servicioTuristico with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ServicioTuristico servicioTuristico;
            try {
                servicioTuristico = em.getReference(ServicioTuristico.class, id);
                servicioTuristico.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The servicioTuristico with id " + id + " no longer exists.", enfe);
            }
            em.remove(servicioTuristico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ServicioTuristico> findServicioTuristicoEntities() {
        return findServicioTuristicoEntities(true, -1, -1);
    }

    public List<ServicioTuristico> findServicioTuristicoEntities(int maxResults, int firstResult) {
        return findServicioTuristicoEntities(false, maxResults, firstResult);
    }

    private List<ServicioTuristico> findServicioTuristicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ServicioTuristico.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ServicioTuristico findServicioTuristico(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ServicioTuristico.class, id);
        } finally {
            em.close();
        }
    }

    public int getServicioTuristicoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ServicioTuristico> rt = cq.from(ServicioTuristico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
