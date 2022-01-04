package jb.springboot.springbootjb;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById((UUID.fromString(id)));
		// return topics.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}

	public List<Topic> getTopicByLesson(String lesson) {
		return topicRepository.findByLesson(lesson);
		// return topics.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topic.setId();
		topicRepository.save(topic);
		// topics.add(topic);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
		// deleteTopic(id);
		// topics.add(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(UUID.fromString(id));
		// topics = new ArrayList<>(topics.stream()
		// .filter(s ->!s.getId().equals(id)).toList());

	}

}
