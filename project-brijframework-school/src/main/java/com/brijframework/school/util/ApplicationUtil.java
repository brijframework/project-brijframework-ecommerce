package com.brijframework.school.util;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationUtil {

	@Value("${application.dateformat}")
	private String dateFormat;
	
	@Value("${application.timeformat}")
	private String timeFormat;
	
	public Date toDate(String date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(this.dateFormat);
		try {
			return dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Time toTime(String date) {
		if(date==null) {
			return null;
		}
		SimpleDateFormat dateFormat=new SimpleDateFormat(this.timeFormat);
		try {
			return new Time(dateFormat.parse(date).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String toString(Date date) {
		if(date==null) {
			return null;
		}
		SimpleDateFormat dateFormat=new SimpleDateFormat(this.dateFormat);
		return dateFormat.format(date);
	}
}
