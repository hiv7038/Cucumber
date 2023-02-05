package com.example.demo.services;

import java.util.HashMap;

import com.example.demo.Pojo.Country;

//here we write all logic
public class CountyServices {
static HashMap<Integer,Country> CountryIdMap;

public CountyServices()
{
	CountryIdMap=new HashMap<Integer,Country>();
	
	Country indiaCountry=new Country(1,"India","Delhi");
	Country UsaCountry=new Country(2,"USA","Weshington");
	Country UKCountry=new Country(3,"UK","London");

	CountryIdMap.put(1, indiaCountry);
	CountryIdMap.put(2, UsaCountry);
	CountryIdMap.put(3, UKCountry);


	
}
}
