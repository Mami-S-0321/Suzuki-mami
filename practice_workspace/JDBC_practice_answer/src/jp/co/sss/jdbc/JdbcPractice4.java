
package jp.co.sss.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.jdbc.dao.BookDao;

public class JdbcPractice4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// コンソールに文字を入力できる準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("書籍の削除を行います。");
		System.out.print("削除する書籍のIDを入力してください。>");
		// 書籍ID入力
		int bookId = Integer.parseInt(br.readLine());

		BookDao.deleteBook(bookId);
	}

}
