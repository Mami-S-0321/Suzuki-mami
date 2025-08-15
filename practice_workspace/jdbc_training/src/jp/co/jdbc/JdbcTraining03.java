package jp.co.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTraining03 {

	public static void main(String[] args) throws IOException {
		System.out.println("部署NOを入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String deptNo = br.readLine();

		findByDeptNo(deptNo);

	}

	public static void findByDeptNo(String deptNo) {

		Connection connection = null;

		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "education", "systemsss");

			ps = connection.prepareStatement("SELECT * FROM emp WHERE deptno = ?");

			ps.setString(1, deptNo);

			rs = ps.executeQuery();

			System.out.println("社員NO\t社員名\t\t上司\t入社日\t給与\t職種\t\t部署NO");

			while (rs.next()) {

				System.out.print(rs.getString("empno") + "\t\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("superior") + "\t");
				System.out.print(rs.getDate("hiredate") + "\t");
				System.out.print(rs.getString("sal") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getString("deptno") + "\t");

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
