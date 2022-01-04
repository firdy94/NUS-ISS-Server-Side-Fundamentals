package jb.springboot.springbootjb;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, UUID> {

	public List<Topic> findByLesson(String lesson);

}
