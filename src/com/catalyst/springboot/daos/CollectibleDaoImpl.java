package com.catalyst.springboot.daos;

import java.util.ArrayList;
import java.util.List;

import com.catalyst.springboot.entities.Collectible;

public class CollectibleDaoImpl implements CollectibleDao {

	private List<Collectible> collectibleList = new ArrayList<>();

	/**
	 * ADD COLLECTIBLE add a new collectible object to the list
	 */
	@Override
	public void addCollectible(Collectible collectible) {
		collectibleList.add(collectible);
	}

	/**
	 * UPDATE COLLECTIBLE if the id of the collectible passed in matches an ID
	 * of a collectible in the list, replace the previous collectible with the
	 * collectible passed in
	 */
	@Override
	public void updateCollectible(Collectible collectible) {
		for (int i = 0; i < collectibleList.size(); i++) {
			/*
			 * if the id of the object passed in is equal to any object id in
			 * the list..
			 */
			if (collectibleList.get(i).getId() == collectible.getId()) {
				/* exchange the objects */
				collectibleList.set(i, collectible);
				/* return so that the search stops */
				return;
			}
		}
	}

	/**
	 * GET COLLECTIBLE BY ID if the id of the collectible passed in matches an
	 * ID of a collectible in the list, return that collectible
	 */
	@Override
	public Collectible getCollectibleById(Integer id) {
		/*
		 * search the list for a collectible that contains the id that was
		 * passed in
		 */
		for (int i = 0; i < collectibleList.size(); i++) {
			if (collectibleList.get(i).getId() == id) {
				/* return object if id match found */
				return collectibleList.get(i);
			}
		}
		/* else return null, no match found */
		return null;
	}

	/**
	 * GET ALL COLLECTIBLES return all collectibles in the list if it exists
	 */
	@Override
	public List<Collectible> getAllCollectibles() {
		if (collectibleList != null) {
			/* return entire collectible list */
			return collectibleList;
		}
		/* return null - collection list empty */
		return null;
	}
}
