package io.javabrain.springbootstarter.topic.Controller;

public class Topic {
	
	private Integer idTopic;
	private  String nameTopic;
	private  String description;
	
	
	public Topic() {
		super();
		
	}

	public Topic(Integer idTopic, String nameTopic, String description) {
		super();
		this.idTopic = idTopic;
		this.nameTopic = nameTopic;
		this.description = description;
	}
	
	
	public Integer getIdTopic() {
		return idTopic;
	}

	public void setIdTopic(Integer idTopic) {
		this.idTopic = idTopic;
	}

	public String getNameTopic() {
		return nameTopic;
	}
	public void setNameTopic(String nameTopic) {
		this.nameTopic = nameTopic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
