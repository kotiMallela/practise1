import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class Main{
	public static void main(String args[])throws Exception{
	  String sourceFile = "property1.properties";
	 FileInputStream fis = new  FileInputStream(sourceFile);
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Properties\\property1.properties");
	 Properties p = new Properties();
	 p.setProperty("Id","1");
	 p.setProperty("Name","koti");
	 p.setProperty("marks","77");
	 //fos.getProperty();
	 p.store(fos,"koti");
	  fis.close();
        }
}
	 
	 