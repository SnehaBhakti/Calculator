package com.example.demo.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {


	@RequestMapping("/")
	public String check()
	{
	return "Simple Calculator";
	}

	@RequestMapping("/Calc/{a}/{b}/{op}")
	public float operationCompute(@PathVariable int a, @PathVariable int b, @PathVariable char op)
	{
	switch(op)
	{
	case '+':
	return(a+b);

	case '-':
	return(a-b);


	case '*':
	return(a*b);



	}
	return 1;
	}

}