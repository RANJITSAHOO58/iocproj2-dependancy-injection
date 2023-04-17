package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private LocalDate date;

	public SeasonFinder() {
		System.out.println("0 param constructor excuted");
	}
	
	public String findoutSeasonName (String user) {
		System.out.println("season.findoutSeasonName() executed");
		// find out month value from date
		int month=date.getMonthValue();
		//show the month name
		if(month>=3 && month<=6) {
			return "hot summer::"+user;
		}
		else if(month>=6 && month<=10) {
			return "dirzling moosom::"+user;
		}
		else
			return "cool summer::"+user;
	}
}
