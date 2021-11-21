package practice;

public class StudentInfromation
{	
	 Integer studentrollno ;
	 String studentname ;
	 int studentage ;
     int studentno ;
	 public StudentInfromation ( int studentrollno, String studentname,int studentage, int studentno )
	 {
			this.studentrollno=studentrollno;
			this.studentname=studentname;
			this.studentage=studentage;
			this.studentno=studentno;
	  }
	 public int getstudentrollno()
	 {
		 return studentrollno;
	 }
	 public String getstudentname()
	 {
		 return studentname;
	 }
	 public int getstudentage()
	 {
		 return studentage;
	 }
	 public int getstudentno()
	 {
		 return studentno;
	 }
}
