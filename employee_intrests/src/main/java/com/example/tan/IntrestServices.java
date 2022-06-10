package com.example.tan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class IntrestServices{
	private List<Intrests> intrestList = new ArrayList<>(Arrays.asList(

            new Intrests("001", "Mitalee", "Playing"),
            new Intrests("002", "Pratham", "Drawing"),
            new Intrests("003", "Sham", "Reading")

    ));
	
	

	public List<Intrests> getAllIntrest() {
		// TODO Auto-generated method stub
		return intrestList;
	}
}
