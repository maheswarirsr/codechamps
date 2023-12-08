package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	private static Properties properties;
	private static String browserType = null;
	private final static String propertyFilePath = "./src/test/resources/config/config.properties";	
	
	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	public static void setBrowserType(String browser) {
		browserType = browser;
	}
	public static String getBrowserType() throws Throwable {
		 browserType = properties.getProperty("browser");
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	public static String getHomePage() {
		String homeurl=properties.getProperty("homepageurl");
		if(homeurl != null) 
			return homeurl;
		else
			throw new RuntimeException("homeurl not specified in the Configuration.properties file.");
		
	}
	public static String getRegisterPage() {
		String registerurl=properties.getProperty("registerurl");
		if(registerurl != null) 
			return registerurl;
		else
			throw new RuntimeException("registerurl not specified in the Configuration.properties file.");
		
	}
	public static String getLoginUrl() {
		String loginurl=properties.getProperty("loginurl");
		if(loginurl != null) 
			return loginurl;
		else
			throw new RuntimeException("loginurl not specified in the Configuration.properties file.");
		
	}
	public static String getexcelfilepath() {
		String xlfilepath = properties.getProperty("excelfilepath");
		if(xlfilepath != null)
			return xlfilepath;
		else
			throw new RuntimeException("xlfilepath not specified in the Configuration.properties file.");
	}
	public static String getUrl(String pagename) {		
		String pageUrl = properties.getProperty(pagename);
		if(pageUrl == null || pageUrl.isEmpty())
			throw new RuntimeException( pagename + "url not specified in the Configuration.properties file.");
		return pageUrl;
	}
	
	public static String getUrl() {
		String treeurl=properties.getProperty("tree");
		if(treeurl != null)
			return treeurl;
		else
			throw new RuntimeException("treeurl not specified in the Configuration.properties file.");		
	}
	public static String getArrayUrl() {
		String arrayurl=properties.getProperty("array");
		if(arrayurl != null)
			return arrayurl;
		else
			throw new RuntimeException("treeurl not specified in the Configuration.properties file.");		
	}
	public static String getPracticeUrl() {
		String practice=properties.getProperty("practice");
		if(practice != null)
			return practice;
		else
			throw new RuntimeException("treeurl not specified in the Configuration.properties file.");		
	}
	public static String getStackUrl() {
		String stackurl=properties.getProperty("stack");
		if(stackurl != null)
			return stackurl;
		else
			throw new RuntimeException("treeurl not specified in the Configuration.properties file.");
		
	}
	public static String getLinkUrl() {
		String linkurl=properties.getProperty("linkedlist");
		if(linkurl != null)
			return linkurl;
		else
			throw new RuntimeException("linkurl not specified in the Configuration.properties file.");
	}
	public static String getQueueUrl() {
		String queueurl=properties.getProperty("queueurl");
		if(queueurl != null)
			return queueurl;
		else
			throw new RuntimeException("queueurl not specified in the Configuration.properties file.");
		
	}
}
