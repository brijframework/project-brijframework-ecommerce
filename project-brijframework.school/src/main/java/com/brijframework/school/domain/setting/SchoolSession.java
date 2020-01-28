package com.brijframework.school.domain.setting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "SCHOOL_SESSION")
public class SchoolSession extends EntityObject<Integer> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "session_id")
	private Integer sessionId;

	@Column(name = "session_duration")
	private String sessionDuration;

	@Column(name = "current_session")
	private boolean currentSession;

	public boolean isCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(boolean currentSession) {
		this.currentSession = currentSession;
	}

	public Integer getSessionId() {
		return sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionDuration() {
		return sessionDuration;
	}

	public void setSessionDuration(String sessionDuration) {
		this.sessionDuration = sessionDuration;
	}

}
