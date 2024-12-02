import java.util.*;
class Employe
	{
	 private int id;
	 private String name;
	 private long sal;
	Employe(int id,String name,long sal)
	   {
	    this.id=id;
	    this.name=name;
	    this.sal=sal;
	   }
	 static Display()
	  {
	   System.out.println(id);	
	   System.out.println(name);	
	   System.out.println(sal);	
	}
	public static void main(String args[])
	 {
	 Employe obj= new Employe(sc.nextInt(),sc.next(),sc.nextLong());
	  Display();
	}
   }