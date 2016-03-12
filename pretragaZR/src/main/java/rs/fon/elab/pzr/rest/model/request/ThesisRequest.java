package rs.fon.elab.pzr.rest.model.request;

import java.util.Date;
import java.util.Set;

public class ThesisRequest {
	
	protected String name;

	protected Integer grade;

	protected Date defenseDate;

	protected String description;

	protected String subjectName;

	protected Long userId;
	
	protected String userName;
	
	protected String userEmail;

	protected Long mentorId;
	
	protected Set<String> tags;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}	

	public Date getDefenseDate() {
		return defenseDate;
	}

	public void setDefenseDate(Date defenseDate) {
		this.defenseDate = defenseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}	
}