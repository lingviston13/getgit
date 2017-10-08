package com.getgit;

import java.util.Date;

public class Repo {

	private final String name;
    private final Date createdAt;
    private final String description;
    private final String cloneUrl;
    
    public Repo(String name, Date date, String description, String cloneUrl) 
    {
    	this.name=name;
    	this.createdAt=date;
    	this.description=description;
    	this.cloneUrl=cloneUrl;
    }
    
    public String getName(){
    	return name;
    }
    
    public Date getCreationDate(){
    	return createdAt;
    }
    public String getDescription(){
    	return description;
    }
    public String getCloneUrl(){
    	return cloneUrl;
    }
}
