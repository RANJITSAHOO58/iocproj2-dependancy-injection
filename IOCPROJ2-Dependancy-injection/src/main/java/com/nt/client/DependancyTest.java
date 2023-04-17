package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependancyTest {

	public static void main(String[] args) {
		//create ioc container
		FileSystemXmlApplicationContext ctx= 
		new FileSystemXmlApplicationContext("src/main/java/com/nt/config/ApplicationContext.xml");
       
		//get target spring bean obj ref
		Object obj=ctx.getBean("sf");
		
		//type casting 
		 SeasonFinder finder=(SeasonFinder)obj;
		 //CALL findoutSeason Name ()
		 String result=finder.findoutSeasonName("Ranjit");
		 // print season name
		 System.out.println(result);
		 ctx.close();
		 
	}

}
