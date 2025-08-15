
package jp.co.sss.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;

import jp.co.sss.jdbc.dao.BookDao;

public class JdbcPractice3 {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {

		// コンソールに文字を入力できる準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("書籍の更新を行います。");
		System.out.print("変更する書籍のIDを入力してください。>");
		// 書籍ID入力
		int bookId = Integer.parseInt(br.readLine());

		System.out.print("書籍名>");
		// 書籍名入力
		String bookName = br.readLine();

		System.out.print("発売日>");
		// 発売日入力
		String releaseDay = br.readLine();
		// 入力値はString型なので、date型に直す。
		Date releaseDate = Date.valueOf(releaseDay);

		System.out.print("価格>");
		// 価格入力
		int price = Integer.parseInt(br.readLine());

		System.out.println("ジャンルID");
		System.out.println("1:絵本");
		System.out.println("2:技術");
		System.out.println("3:娯楽");
		System.out.println("4:ビジネス");
		System.out.println("5:音楽");
		System.out.print("IDを入力して下さい>");

		int genreId = Integer.parseInt(br.readLine());

		BookDao.updateBook(bookName, releaseDate, price, genreId,bookId);
	}

}
