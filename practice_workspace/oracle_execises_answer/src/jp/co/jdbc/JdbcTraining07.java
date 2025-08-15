package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTraining07 {

	public static void main(String[] args) throws IOException {

		Connection connection = null;

		PreparedStatement ps = null;

		try {
			System.out.println("部署を削除します。、");

			System.out.println("部署NOを入力してください。");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String deptNo = br.readLine();


			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "education", "systemsss");

			ps = connection.prepareStatement("DELETE dept WHERE deptno = ?");

			ps.setString(1, deptNo);

			ps.executeUpdate();

			System.out.println("部署を削除しました。");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		} finally {

			if (ps != null) {

				try {

					ps.close();

				} catch (SQLException e) {

					e.printStackTrace();

				}

			}

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
