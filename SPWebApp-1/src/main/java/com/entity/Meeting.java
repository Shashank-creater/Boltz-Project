package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Meeting_Table")
public class Meeting 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int meetingId;
	private String meetingSubject;
	
/*	@ManyToMany(mappedBy="meeting")
	private Set<Employee> employees = new HashSet<Employee>();
*/
	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getMeetingSubject() {
		return meetingSubject;
	}

	public void setMeetingSubject(String meetingSubject) {
		this.meetingSubject = meetingSubject;
	}

/*	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
*/	
	
}
