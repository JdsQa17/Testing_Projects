package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesReader {
	public Properties prop;
	
	public PropertiesReader() throws IOException {
		prop = new Properties();
		String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties";
		InputStream file = new FileInputStream(filePath);
		prop.load(file);
;	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public String getUrl() {
		return prop.getProperty("url");
	}
	
	
}
