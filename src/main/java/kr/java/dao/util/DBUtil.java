package kr.java.dao.util;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
    public static Connection getConnection() {
        System.out.println("커넥션 연결 시작");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("클래스 로드 성공");
            Dotenv dotenv = Dotenv.configure()
                    .ignoreIfMissing()
                    .load();
            String DB_URL = dotenv.get("DB_URL");
            String DB_USER = dotenv.get("DB_USER");
            String DB_PASSWORD = dotenv.get("DB_PASSWORD");
            Properties properties = new Properties();
            properties.setProperty("user", DB_USER);
            properties.setProperty("password", DB_PASSWORD);
            Connection conn = DriverManager.getConnection(
                    DB_URL,
                    properties
            );
            System.out.println("커넥션 연결 성공");
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
