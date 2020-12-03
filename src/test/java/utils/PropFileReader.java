package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFileReader {
	public static String readProperty(String filePath, String keyname) throws IOException {
		FileInputStream fis = new FileInputStream(new File(filePath));
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(keyname);	
	}

}
