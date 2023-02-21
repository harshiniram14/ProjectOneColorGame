package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	private String yourFavColor="Blue";
	@GetMapping("/")
	public String getmyFav() {
		return "My Fav Color is "+yourFavColor;
	}
}
