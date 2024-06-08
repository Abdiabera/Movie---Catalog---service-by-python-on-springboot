package com.demo.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.ComponentScan;
	
@RestController
@RequestMapping ("/Catalog")

public class MCController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	List<CatalogItem> cat = Arrays.asList(
			
			new CatalogItem ("Faridoon noori", "java developer", 100),
			new CatalogItem ("Abdi Abera", "java developer", 101),
					new CatalogItem ("bikila Abera", "ingenreing", 102) );

			@RequestMapping (path="/{userId}")
			public List<CatalogItem> getCatalog(@PathVariable("userId") String userId ) {	
				return cat;
			}
			
			 @RequestMapping (path =  "{/Rating}")
			 
			  public UserRating getRate() {
				 
				UserRating  ratings = restTemplate.getForObject("http://localhost:8083/Rating/Ra", UserRating.class);
				
				return ratings;
	
			}
			 
			}
