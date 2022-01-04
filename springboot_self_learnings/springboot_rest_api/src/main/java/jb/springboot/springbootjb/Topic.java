package jb.springboot.springbootjb;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topics")
public class Topic {

	@Id
	private UUID course_uid;
	@Column(name = "lesson")
	private String lesson;
	@Column(name = "university")
	private String university;
	@Column(name = "salutation")
	private String salutation;
	@Column(name = "professor")
	private String professor;
	@Column(name = "email_address")
	private String email_address;
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "language")
	private String language;
	@Column(name = "lesson_timing")
	private int lesson_timing;

	public Topic() {
	}

	public Topic(String name, String university) {
		this.course_uid = UUID.randomUUID();
		this.lesson = name;
		this.university = university;
	}

	public UUID getId() {
		return this.course_uid;
	}

	public void setId() {
		this.course_uid = UUID.randomUUID();
	}

	public void setId(UUID id) {
		this.course_uid = id;
	}

	public String getName() {
		return this.lesson;
	}

	public void setName(String lesson) {
		this.lesson = lesson;
	}

	public String getUniversity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getProfessor() {
		return this.professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getEmailAdd() {
		return this.email_address;
	}

	public void setEmailAdd(String email_address) {
		this.email_address = email_address;
	}

	public String getPhoneNum() {
		return this.phone_number;
	}

	public void setPhoneNum(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getHours() {
		return this.lesson_timing;
	}

	public void setHours(int lesson_timing) {
		this.lesson_timing = lesson_timing;
	}

}
