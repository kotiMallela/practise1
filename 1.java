import java.util.*;
class A
	{
	 static Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 float m1(String a)
	      {
	        System.out.println(a);
	        System.out.println(this.a);
	        return sc.nextFloat();
	      }
	 int m2(float f)
	  {
	   System.out.println(this.m1(sc.next()));
	   System.out.println(f);
	   return sc.nextInt();
	  }
	 A(int a)
	  {
	    System.out.println(a);
	  }
	 A()
	  {
	   this(sc.nextInt());
	  }
	 A(int a,boolean b)
	 {
	  System.out.println(a);
	  System.out.println(b);
	  }
	 }
	class B extends A
	 {
	  double m3(char ch)
	  {
	   System.out.println(ch);
	   System.out.println(super.a);
	   System.out.println(super.m1(sc.next()));
	   return sc.nextDouble();
	  }
	 float m1(String d)
	      {
	        System.out.println(d);
	        return sc.nextFloat();
	      }
	B()
	 {
	  super(sc.nextInt(),sc.nextBoolean());
	 }
	public static void main(String args[])
	 {
	  A obj1 = new A();
	   System.out.println(obj1.m2(sc.nextFloat()));
	  B obj = new B();
	  System.out.println(obj.m3(sc.next().charAt(0)));
	}
	}
	  