package exemplo.dao;

import exemplo.modelDomain.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VeiculoDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("FrotaPU");

    public void salvar(Veiculo v) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (v.getId() == null) {
            em.persist(v);
        } else {
            em.merge(v);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void remover(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Veiculo v = em.find(Veiculo.class, id);
        if (v != null) {
            em.remove(v);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Veiculo> listarTodos() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT v FROM Veiculo v", Veiculo.class).getResultList();
        } finally {
            em.close();
        }
    }
}