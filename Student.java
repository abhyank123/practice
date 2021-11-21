package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student 
{

	public static void main(String[] args)
	{	
		StudentInfromation s1 = new StudentInfromation(456121,"suresh",20,987654364);
		StudentInfromation s2 = new StudentInfromation(456122,"Ramesh",20,987654344);
		StudentInfromation s3 = new StudentInfromation(456123,"Sukhdesh",20,987651364);
		StudentInfromation s4 = new StudentInfromation(456124,"surmngesh",20,987664364);
		StudentInfromation s5 = new StudentInfromation(456125,"sureshnarayan",20,989654364);
	
		
		ArrayList<StudentInfromation> al =new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
	
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
        	StudentInfromation si = (StudentInfromation)itr.next();
        	System.out.println(si.studentrollno+" "+si.studentname+"\t "+si.studentage+" "+si.studentno );
        }
        
        
        System.out.println("8888888888888888888888888888888888888888888888888");
		Map <Integer, String> map = new HashMap <Integer, String>();
		
		/*
		for(StudentInfromation t : al)
		{
		    map.put(t.getstudentrollno(),t.getstudentname());
		}
		System.out.println(map);
		*/
		System.out.println("----------------------------------------------------");
		
		for(StudentInfromation m:al)
		{
			System.out.println(m.getstudentrollno()+" "+m.getstudentname());
		}
		
	}
	

}
