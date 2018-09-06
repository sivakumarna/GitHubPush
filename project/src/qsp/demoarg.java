package qsp;

import java.util.ArrayList;
import java.util.Collections;

public class demoarg {
	public static void main(String args [])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("qsp");
		a.add("asp");
		a.add("jsp");
		Collections.sort(a);
		for(String b:a)
			System.out.println(b);
	}
		 

}
