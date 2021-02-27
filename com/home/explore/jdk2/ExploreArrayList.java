/**
 * @author Karthikeyan.V
 * Concepts Used: Interface, ArrayList, Iterator
 */
package com.home.explore.jdk2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExploreArrayList {

	static Logger logger = Logger.getLogger(ExploreArrayList.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
		// Convert Array To ArrayList
		String[] countries = { "India", "Sri Lanka", "Japan", "US",	"UK" };
		
		//WAY 1
		ArrayList<String> countryList1 = new ArrayList<String>(Arrays.asList(countries));
		System.out.println("\nConvert Array To ArrayList:");
		for (String country : countryList1) {
			System.out.println(country);
		}
		//WAY 2
		ArrayList<String> countryList2 = new ArrayList<String>();
		for (String country : countries) {
			countryList2.add(country);
		}		
		//WAY 3
		List<String> countryList3 = new ArrayList<String>(countries.length);
		for (String country : countries) {  
			countryList3.add(country);
		}
		
		Dogs d1 = new Dogs();
		Dogs d2 = new Dogs();
		d1.setLifeTime(10);
		d1.setBehaveLike("Will Bark");
		d2.setLifeTime(12);
		d2.setBehaveLike("Will Bark");

		LoveBirds l1 = new LoveBirds();
		LoveBirds l2 = new LoveBirds();
		l1.setLifeTime(3);
		l1.setBehaveLike("Will Sing");
		l2.setLifeTime(3);
		l2.setBehaveLike("Will Sing");
		
		ArrayList<String> a = new ArrayList<String>(1);
		a.add(0, "String");
		
		ArrayList al = new ArrayList();
		al.add(d1);
		al.add(d2);
		al.add(l1);
		al.add(l2);
		al.add(d1);
		al.add(d2);
		al.add(l1);
		al.add(l2);
		al.add(d1);
		al.add(d2);
		al.add(l1);
		al.add(l2);
		al.add("String Object 1");
		al.add("String Object 2");
		
		Iterator i = al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if(o instanceof String)
				System.out.println(o);				
			else {
				AnimalsAndBirds obj = (AnimalsAndBirds) o;
				System.out.println(obj.getBehaveLike());
			}
		}
	}
}

interface AnimalsAndBirds {
	public abstract int getLifeTime();

	String getBehaveLike();
}

class Dogs implements AnimalsAndBirds {
	private int lifeTime;
	private String behaveLike;

	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}

	@Override
	public int getLifeTime() {
		return lifeTime;
	}

	public void setBehaveLike(String behaveLike) {
		this.behaveLike = behaveLike;
	}

	@Override
	public String getBehaveLike() {
		return behaveLike;
	}
}

class LoveBirds implements AnimalsAndBirds {
	private int lifeTime;
	private String behaveLike;

	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}

	@Override
	public int getLifeTime() {
		return lifeTime;
	}

	public void setBehaveLike(String behaveLike) {
		this.behaveLike = behaveLike;
	}

	@Override
	public String getBehaveLike() {
		return behaveLike;
	}
}
