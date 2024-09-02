package genericProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtil {
	public String getDataFromProperties (String data ) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\91790\\Downloads\\seleniumfolder\\A4CommonData.properies");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(data);
		return value;
		
	}

}
