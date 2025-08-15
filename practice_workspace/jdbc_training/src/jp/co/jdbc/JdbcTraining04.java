package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTraining04 {

	public static void main(String[] args) throws IOException {
		System.out.println("給与の範囲検索をします。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("最小値");
		String min = br.readLine();
		System.out.println("最大値");
		String max = br.readLine();


		findBySal(min,max);

	}

	public static void findBySal(String min,String max) {

		Connection connection = null;

		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "education", "systemsss");


			ps = connection.prepareStatement("SELECT * FROM emp WHERE  ? <= sal AND sal <= ? ");

			//なお、BETWEEN演算でも実現できます。例： ～ WHERE sal BETWEEN ? AND ?


			ps.setString(1, min);
			ps.setString(2, max);

			rs = ps.executeQuery();

			System.out.println("社員名\t\t給与\t職種\t");

			while (rs.next()) {

				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("sal") + "\t");
				System.out.print(rs.getString("job") + "\t");

				System.out.println();
			}

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();

		} finally {

			if (rs != null) {

				try {

					rs.close();

				} catch (SQLException e) {

					e.printStackTrace();

				}
			}

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

