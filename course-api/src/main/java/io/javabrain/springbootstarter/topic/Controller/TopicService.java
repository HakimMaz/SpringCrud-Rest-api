package io.javabrain.springbootstarter.topic.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	

	private List<Topic> topics = Arrays.asList(
			new Topic(1,"spring framework","learn spring in few days"),
			new Topic(2,"java android","make mobile application"),
			new Topic(3,"javascript","getting started with ES6")
			);

	
	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getOneTopic(Integer id)
	{
		return topics.get(id);
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

}
