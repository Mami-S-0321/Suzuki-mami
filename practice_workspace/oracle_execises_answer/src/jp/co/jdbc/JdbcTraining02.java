package jp.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTraining02 {

	public static void main(String[] args) {

		selectAllEmployee();

	}

	public static void selectAllEmployee() {

		Connection connection = null;

		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "education", "systemsss");

			ps = connection.prepareStatement("SELECT * FROM emp e INNER JOIN dept d ON e.deptno = d.deptno");

			rs = ps.executeQuery();

			System.out.println("社員NO\t社員名\t\t部署");

			while (rs.next()) {

				System.out.print( rs.getString("empno") + "\t\t");
				System.out.print( rs.getString("ename") + "\t");
				System.out.print( rs.getString("dname") + "\t");

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
