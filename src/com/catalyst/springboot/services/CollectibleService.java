package com.catalyst.springboot.services;

import java.util.List;

import com.catalyst.springboot.entities.Collectible;

public interface CollectibleService {

	/**
	 * POST
	 */
	void addCollectible(Collectible collectible);

	/**
	 * GET
	 */
	public List<Collectible> getCollectibles();

	/**
	 * PUT
	 */
	public void updateCollectible(Collectible collectible);

	/**
	 * GET BY ID
	 */
	public Collectible getCollectibleById(Integer collectibleId);

}
