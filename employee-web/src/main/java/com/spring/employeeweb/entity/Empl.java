package com.spring.employeeweb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Empl implements Serializable{
	
	
	 private String id;
	    private String name;
	    private String Hobby;
	    
		public Empl(String id, String name, String hobby) {
			super();
			this.id = id;
			this.name = name;
			Hobby = hobby;
		}

		public Empl() {
			super();
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHobby() {
			return Hobby;
		}

		public void setHobby(String hobby) {
			Hobby = hobby;
		}
		
		
}
