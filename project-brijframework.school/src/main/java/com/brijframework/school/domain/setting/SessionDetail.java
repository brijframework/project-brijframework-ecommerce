package com.brijframework.school.domain.setting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "SESSION_DETAIL")
public class SessionDetail extends EntityObject<Integer> {

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

	public String getSessionDuration() {
		return sessionDuration;
	}

	public void setSessionDuration(String sessionDuration) {
		this.sessionDuration = sessionDuration;
	}

}
