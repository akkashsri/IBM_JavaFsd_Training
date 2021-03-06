package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String message;
	
}
