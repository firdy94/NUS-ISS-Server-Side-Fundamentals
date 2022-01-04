package jb.springboot.springbootjb;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {

	@Autowired
	private TopicService topicsService;

	@GetMapping("/")
	public ModelAndView landingPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");
		return modelAndView;
	}

	@GetMapping("/link")
	public ModelAndView linkedPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("link.html");
		return modelAndView;
	}

	@GetMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicsService.getTopics();
	}

	@GetMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicsService.getTopic(id);
	}

	@GetMapping("/topics/{lesson}")
	public List<Topic> getTopicByLesson(@PathVariable String lesson) {
		return topicsService.getTopicByLesson(lesson);
	}

	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicsService.addTopic(topic);
	}

	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topic.setId(UUID.fromString(id));
		topicsService.updateTopic(topic);

	}

	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicsService.deleteTopic(id);

	}

}
