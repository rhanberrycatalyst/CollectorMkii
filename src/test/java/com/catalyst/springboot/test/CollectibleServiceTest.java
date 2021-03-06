package com.catalyst.springboot.test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.springboot.daos.CollectibleDao;
import com.catalyst.springboot.daos.CollectibleDaoImpl;
import com.catalyst.springboot.entities.Collectible;
import com.catalyst.springboot.services.CollectibleServiceImpl;

/**
 * COLLECTIBLE SERVICE TEST
 * designed to test the methods in 
 * CollectibleDaoImpl
 */
public class CollectibleServiceTest{
    
	/* create target that we will test */
	private CollectibleServiceImpl target;
	
	/* use mock object for testing */
	private CollectibleDao mockCollectibleDao;
	
	/* set up target and mock object */
	@Before
	public void setup(){
		target = new CollectibleServiceImpl();
		mockCollectibleDao = mock(CollectibleDao.class);
		target.setCollectibleDao(mockCollectibleDao);
	}
    
	/* test checks for successful addition of Collectible */
	@Test
	public void testAddCollectible(){
		target.addCollectible(null);
		verify(mockCollectibleDao, times(1)).addCollectible(null);
	}
	
	@Test
	public void getCollectibleByIdTest(){
		
		CollectibleDaoImpl testObject = new CollectibleDaoImpl();

		/* make new object */
		Collectible testCollectible = new Collectible(55555, 1, 1, "String nameIN",
				"String descriptionIN", "String categoryIN", "String conditionIN", "String colorIN",
				false);
		
		/* add the test object to the list */
		testObject.addCollectible(testCollectible);
		
		/* check to see if getCollectibleByID returns the testCollectibleObject as expected */
		assertEquals(testObject.getCollectibleById(55555), testCollectible);
	
	}
	
	@Test
	public void updateCollectibleByIdTest(){
		
		CollectibleDaoImpl testObject = new CollectibleDaoImpl();
		
		/* make new object */
		Collectible testCollectible = new Collectible(55555, 1, 1, "String nameIN",
				"String descriptionIN", "String categoryIN", "String conditionIN", "String colorIN",
				false);
		
		/* make new object with same id but different other attributes  */
		Collectible testCollectibleUpdated = new Collectible(55555, 2, 2, "UPDATED",
				"UPDATED", "UPDATED", "UPDATED", "UPDATED",
				true);
		
		/* add object to the list */
		testObject.addCollectible(testCollectible);
		
		/* send in new object with same ID which should update other attributes */
		testObject.updateCollectible(testCollectibleUpdated);
		
		/* check to see if the name of the object with id 55555 is now updated */
		assertEquals(testObject.getCollectibleById(55555).getName(), "UPDATED");

	}
}
