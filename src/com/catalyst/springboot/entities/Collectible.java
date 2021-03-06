package com.catalyst.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Collectible
 */
@Entity
@Table(name="itemschema.collectible")
public class Collectible {

	
	/* FIELDS */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer collectId;
	private int catalogueNumber;
	private int age;
	private String name;
	private String description;
	private String category;
	private String condition;
	private String color;
	private boolean forSale;

	/* ARRAY OF THREE KEYWORDS ASSOCIATED WITH EACH COLLECTIBLE */
	private String[] CollectibleKeywords = new String[3];

	/* DEFAULT CONSTRUCTOR */
	public Collectible() {
		this.collectId = 0;
		this.catalogueNumber = 0;
		this.age = 0;
		this.name = "";
		this.description = "";
		this.category = "";
		this.condition = "";
		this.color = "";
		this.forSale = false;
		this.CollectibleKeywords = null;
	}
	
	/* CONSTRUCTOR */

	public Collectible(Integer idIN, int catalogueNumberIN, int ageIN, String nameIN,
			String descriptionIN, String categoryIN, String conditionIN, String colorIN,
			boolean forSaleIN){
		
		setId(idIN);
		setCatalogueNumber(catalogueNumberIN);
		setAge(ageIN);
		setName(nameIN);
		setDescription(descriptionIN);
		setCategory(categoryIN);
		setColor(colorIN);
		setCondition(conditionIN);
		setForSale(forSaleIN);
	}

	/* SETTERS */

	public void setId(Integer id) {
		this.collectId = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCatalogueNumber(int catalogueNumber) {
		this.catalogueNumber = catalogueNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCollectibleKeywords(String[] myStringArray) {
		this.CollectibleKeywords = myStringArray;
	}

	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}

	/* GETTERS */

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getCatalogueNumber() {
		return catalogueNumber;
	}

	public int getAge() {
		return age;
	}

	public String getCategory() {
		return category;
	}

	public String getCondition() {
		return condition;
	}

	public String getColor() {
		return color;
	}

	public String[] getCollectibleKeywords() {
		return CollectibleKeywords;
	}

	public boolean getIsForSale() {
		return forSale;
	}

	public Integer getId() {
		return collectId;
	}

}
