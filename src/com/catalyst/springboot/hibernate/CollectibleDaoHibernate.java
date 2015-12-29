package com.catalyst.springboot.hibernate;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
import com.catalyst.springboot.daos.CollectibleDao;
import com.catalyst.springboot.entities.Collectible;

@Component
@Transactional
public class CollectibleDaoHibernate implements CollectibleDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em){
		this.em = em;
	}
	
	@Override
	public void addCollectible(Collectible collectible){
		/*adds collectible item line*/
		em.persist(collectible);
		
	}

	@Override
	public void updateCollectible(Collectible collectible){
		/*Updates collectible fields*/
		em.merge(collectible);
	}

	@Override
	public Collectible getCollectibleById(Integer id){
		
		/* write method */
		return null;
	}

	@Override
	public List<Collectible> getAllCollectibles() {
		
		return em.createQuery("SELECT e FROM collectible e", Collectible.class).getResultList();
	};
}
