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

	public void setCollectibleDao(CollectibleDao collectibleDao) {
		this.collectibleDao = collectibleDao;
	}

	@Override
	public void addCollectible(Collectible collectible) {
		System.out.println("SERVIMPL ADD");
		collectibleDao.addCollectible(collectible);

	}

	@Override
	public List<Collectible> getCollectibles() {
		System.out.println("SERVIMPL GETLIST");

		return collectibleDao.getAllCollectibles();
	}

	@Override
	public void updateCollectible(Collectible collectible) {

		System.out.println("SERVIMPL UPDATE");
		collectibleDao.updateCollectible(collectible);
	}

	@Override
	public Collectible getCollectibleById(Integer id) {
		System.out.println("SERVIMPL GETBYID");
		return collectibleDao.getCollectibleById(id);

	}
}
