package jp.co.sss.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import jp.co.sss.jdbc.dao.BookDao;
import jp.co.sss.jdbc.dto.Book;

public class JdbcPractice1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		System.out.println("書籍の検索を行います。");
		System.out.println("検索の形式を選んでください。");
		System.out.print("1:全件検索>");
		
		//コンソールに文字を入力できる準備
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//入力値をInteger.parseIntを使って数値型に変換し、int型のnoに代入
		int no=Integer.parseInt(br.readLine());
		
		//入力値に応じて条件分岐させるためにswitchを使用する
		switch(no) {
		//noの値が1だったら実行
		case 1:
		//selectAll()はstaticがついているため、呼び出す際には「クラス名.メソッド名」で呼び出す
		//メソッドの戻り値をbookに代入
		List<Book> bookList=BookDao.selectAll();
		
		System.out.print("書籍ID"+"\t");
		System.out.print("\t"+"書籍名"+"\t"+"\t");
		System.out.print("\t"+"\t"+"発売日"+"\t"+"\t");
		System.out.print("\t"+"\t"+"価格"+"\t");
		System.out.println("\t"+"ジャンル"+"\t");
		
		for(Book book:bookList) {
			System.out.print("\t"+book.getBookId());
			System.out.print("\t"+book.getBookName());
			System.out.print("\t"+"\t"+book.getReleaseDate()+"\t");
			System.out.print("\t"+"\t"+book.getSelPrice());
			System.out.println("\t"+"\t"+"\t"+book.getGenre().getGenreName());
		}
		//breakがないとdefaultの処理もおこなわれるため必ず必要
		break;
		
		//1以外の数値が打たれた際に実行する
		default:
			System.out.println("不正な数値の入力がありました。");
			System.out.println("システムを終了します。");
			break;
			
		}

	}

}
