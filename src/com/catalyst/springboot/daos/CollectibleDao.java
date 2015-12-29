package com.catalyst.springboot.daos;

import java.util.List;

import com.catalyst.springboot.entities.Collectible;

/**
 * CollectibleDao
 */
public interface CollectibleDao {

	/**
	 * add a new collectible to the collection
	 */
	void addCollectible(Collectible collectible);

	/**
	 * update a collectible in the collection
	 */
	public void updateCollectible(Collectible collectible);

	/**
	 * get a collectible by id
	 */
	public Collectible getCollectibleById(Integer id);

	/**
	 * get all collectibles in the collection
	 */
	public List<Collectible> getAllCollectibles();

}
