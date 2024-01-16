package genericMethods;

import java.io.FileInputStream;
import java.util.Properties;

public class HandlingPropertyFiles {

	public static String getProperty(String path, String key) throws Exception
	{
		FileInputStream fis = new FileInputStream(path);
		Properties property = new Properties();
		
		property.load(fis);
		
		return property.getProperty(key);
	}

}
