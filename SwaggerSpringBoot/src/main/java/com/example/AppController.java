package com.example;

import java.io.File;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController()
@RequestMapping(value="app")
@Api(value="Main App")
public class AppController 
{
	@ApiOperation(value="Print value",notes = "It Prints User")
	@RequestMapping(value="/print",method = RequestMethod.GET)
	public void print(UserModel model)
	{
		System.out.println(new File(".").getAbsolutePath());
	}
}
