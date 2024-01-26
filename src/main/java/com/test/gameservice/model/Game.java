package com.test.gameservice.model;


import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Game {
	@Id
	private String id;
	private String name;
	private Double price;
	private Date releaseDate = new Date();
}