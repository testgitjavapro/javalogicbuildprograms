package com.patternmatch;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> al = new ArrayList<String>();
      al.add("laxmiputra");
      al.add("amar");
      al.add("manju");
      al.add("ramesh");
      al.add("sachin");
      System.out.println("Before Sorting"+al);
      Collections.sort(al);
      System.out.println("After Sorting"+al);
	}

}
