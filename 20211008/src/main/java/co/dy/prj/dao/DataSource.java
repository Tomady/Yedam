package co.dy.prj.dao;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	private static DataSource dataSource = new DataSource();
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;

	private DataSource() {
		dbConfig();
	} // �ܺο��� ������ �� ������ �����.

	public static DataSource GetInstance() {

		return dataSource;
	}

	private void dbConfig() { // �ܺ� properties file�� �о ���� ����.
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath(); // getPath() 또는 getFile()

		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			Class.forName(driver); // ojdbc load
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
