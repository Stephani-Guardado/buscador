package buscadoresDao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import duscardor.TbUsuariop;

public class BuscaDao {

	public List<TbUsuariop> buscar(TbUsuariop usu) {
		List<TbUsuariop> u = new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("duscardor");
		em = emf.createEntityManager();
		
	    try {
			em.getTransaction().begin();
			u = em.createQuery("from TbUsuariop as u where u.dui = '"+usu.getDui()+"'").getResultList();
			em.getTransaction().commit();		
		} catch (Exception e) {
			System.out.println("Erro1r" + e);
		}
			return u;
		}
}
