package jp.co.sss.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

import jp.co.sss.jdbc.dao.DrinkDao;

public class JdbcPractice8 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		System.out.println("販売終了の商品を削除します。");
		System.out.print("削除する日付入力してください。>");
		
		//コンソールに文字を入力できる準備
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Date date=Date.valueOf(br.readLine());

		//削除処理を実行
		DrinkDao.deleteDrink(date);
		
		System.out.println("削除が完了しました。");
		
		
		
			
		}

	}


