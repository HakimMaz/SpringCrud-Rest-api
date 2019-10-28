package io.javabrain.springbootstarter.topic.Controller;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics()
	{
		return topicService.getTopics();			
	}
	@RequestMapping("/topic/{id}")
	public Topic getOneTopic(@PathVariable( value = "id") Integer id)
	{
		return topicService.getOneTopic(id-1);		
	}

}
