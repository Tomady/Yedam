package co.dy.prj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class MainApp {
	private static Properties properties = new Properties(); // 사용할 Properties객체 생성

	public static void main(String[] args) {
		File path = new File("src/main/resources/info.properties");
//		File path = new File("info.properties");
		FileReader file;
		
		try {
			file = new FileReader(path);
			properties.load(file);
			System.out.println(properties.getProperty("name"));
			System.out.println(properties.getProperty("tel"));
			System.out.println(properties.getProperty("address"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
