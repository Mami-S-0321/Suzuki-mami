package jp.co.sss.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.jdbc.dao.DrinkDao;

public class JdbcPractice7 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		System.out.println("飲料の価格変更を行います。");
		System.out.println("変更する価格の範囲を入力してください。");
		
		//コンソールに文字を入力できる準備
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("最小金額>");
		int rowPrice=Integer.parseInt(br.readLine());
		
		System.out.print("最大金額>");
		int highPrice=Integer.parseInt(br.readLine());
		
		System.out.println(rowPrice+"円から"+highPrice+"円の範囲の価格を一括変更します。");
		System.out.print("変更金額を入力してください。>");
		
		int newPrice=Integer.parseInt(br.readLine());
		
		//更新処理を実行
		DrinkDao.updateDrinkPrice(rowPrice,highPrice,newPrice);
		
		System.out.println("更新が完了しました。");
		
		
		
			
		}

	}


