package com.felipesarabia.development.training.model;

public class JobInformation {
	private Integer id;
	private Integer personId;
	private Integer experience;
	private String languages;
	
	public JobInformation() {}
	
	public JobInformation(Integer personId, Integer experience, String languages) {
		super();
		this.personId = personId;
		this.experience = experience;
		this.languages = languages;
	}

	public JobInformation(Integer id, Integer personId, Integer experience, String languages) {
		super();
		this.id = id;
		this.personId = personId;
		this.experience = experience;
		this.languages = languages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}
	

}
