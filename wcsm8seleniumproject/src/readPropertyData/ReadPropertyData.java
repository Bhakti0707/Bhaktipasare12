package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	
	public static void main(String[] args) throws IOException {
		
		//provide the path
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//read the data from property file
		Properties prop = new Properties();
		
		//make the property file to read
		prop.load(fis);
		
		String password = prop.getProperty("password");
		System.out.println(password);
	}

}
