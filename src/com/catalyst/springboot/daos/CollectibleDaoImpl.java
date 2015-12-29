package com.catalyst.springboot.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.catalyst.springboot.entities.Collectible;

public class CollectibleDaoImpl implements CollectibleDao {
	
	private List<Collectible> collectibleList = new ArrayList<>();
	
	@Override
	public void addCollectible(Collectible collectible){
		
		/* write method */
	}

	@Override
	public void updateCollectible(Collectible collectible){
		
		/* write method */
	}

	@Override
	public Collectible getCollectibleById(Integer id){
		
		/* write method */
		return null;
	}

	@Override
	public List<Collectible> getAllCollectibles(){
		
		/* write method */
		return null;
	}
}
