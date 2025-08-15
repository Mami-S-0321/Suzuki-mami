package jp.co.sss.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import jp.co.sss.jdbc.dao.DrinkDao;
import jp.co.sss.jdbc.dto.Drink;

public class JdbcPractice6 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		System.out.println("あなたにおすすめの飲み物をご提案します。");
		System.out.print("飲んでみたい飲料名を入力してください。>");
		
		//コンソールに文字を入力できる準備
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String drinkName=br.readLine();
		
		System.out.print("希望価格を入力してください。>");
		int price=Integer.parseInt(br.readLine());
		
		//検索結果が複数返ってくる可能性があるためDTO型のListで受け取る
		List<Drink> drinkList=DrinkDao.findByNameAndPrice(drinkName,price);
		
		//Listの中身が空の場合
		if(drinkList.isEmpty()) {
			System.out.println("該当するデータがありません。");
		}else {
			System.out.print("飲料名"+"\t");
			System.out.print("\t"+"\t"+"\t"+"\t"+"発売日"+"\t"+"\t");
			System.out.print("\t"+"\t"+"\t"+"価格"+"\t"+"\t");
			System.out.println("\t"+"ジャンル"+"\t"+"\t");
			
			for(Drink drink:drinkList) {
				System.out.print(drink.getDrinkName());
				System.out.print("\t"+"\t"+"\t"+"\t"+drink.getReleaseDate()+"\t");
				System.out.print("\t"+"\t"+"\t"+drink.getSelPrice()+"\t");
				System.out.println("\t"+"\t"+"\t"+drink.getGenre().getGenreName());
				
			}
		}
			
		}

	}


