package utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;




public class Configuration {


		
		public static String readProperty(String key) {
			InputStream inputStream = null;
			String value = "";
			String property="Config.Property";
			try {
			Properties prop = new Properties();
		
			inputStream = Configuration.class.getClassLoader().getResourceAsStream(property);
			if (inputStream != null) {
			prop.load(inputStream);
			inputStream.close();
			} else {
			throw new FileNotFoundException("property file '" + property + "' not found in the classpath");
			}
			value = prop.getProperty(key);
			}  catch (Exception e) {
				 e.printStackTrace();
			}
			return value;
			}
	}


