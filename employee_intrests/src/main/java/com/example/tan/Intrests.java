package com.example.tan;

import lombok.Data;

@Data
public class Intrests {
	
	 private String id;
	    private String name;
	    private String Hobby;
	    
		public Intrests(String id, String name, String hobby) {
			super();
			this.id = id;
			this.name = name;
			Hobby = hobby;
		}

		public Intrests() {
			super();
		}

	   

}
