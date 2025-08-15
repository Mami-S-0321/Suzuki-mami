package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTraining05 {

	public static void main(String[] args) throws IOException {

		Connection connection = null;

		PreparedStatement ps = null;

		try {
			System.out.println("部署を新規登録します。、");


			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("部署名を入力してください。");

			String deptName = br.readLine();

			System.out.println("場所を入力してください。");

			String location = br.readLine();


			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "education", "systemsss");

			ps = connection.prepareStatement("INSERT INTO dept VALUES( dept_seq.nextval , ? , ? )");

			ps.setString(1, deptName);
			ps.setString(2, location);


			ps.executeUpdate();

			System.out.println("部署を登録しました。");

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
