package jp.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTraining01 {

	public static void main(String[] args) {

		Connection connection = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "education", "systemsss");

			System.out.println("接続に成功しました。");

		} catch (SQLException | ClassNotFoundException e) {

			System.out.println("接続に失敗しました。");

		} finally {

			if (connection != null) {

				try {

					connection.close();

				} catch (SQLException e) {

					e.printStackTrace();

				}

			}

		}

	}

}
