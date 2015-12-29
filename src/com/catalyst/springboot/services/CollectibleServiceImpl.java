package com.catalyst.springboot.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.catalyst.springboot.daos.CollectibleDao;
import com.catalyst.springboot.entities.Collectible;


@Service
public class CollectibleServiceImpl implements CollectibleService {
	
	@Autowired
	private CollectibleDao collectibleDao;
	
	public void setEmployeeDao(CollectibleDao taskDao) {
		this.collectibleDao = taskDao;
	}
	
	@Override
	public void addCollectible(Collectible collectible){
		
		/* write method */
	}

	@Override
	public List<Collectible> getCollectibles(){
		
		/* write method */
		return null;
	}


	@Override
	public void updateCollectible(Collectible collectible){
		
		/* write method */
	}

	@Override
	public Collectible getCollectibleById(Integer taskId){
		
		/* write method */
		return null;
	}
}
