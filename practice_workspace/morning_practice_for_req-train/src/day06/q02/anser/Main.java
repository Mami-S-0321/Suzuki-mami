//追加問題 

//パッケージ名 day6.q2
//クラス名1 Depositor.java 預金者クラス
//クラス名2 Bank.java 銀行クラス
//クラス名3 Main.java オブジェクト生成し、プログラムを実行するクラス

//銀行に預金口座を作成します。口座情報として預金者の氏名と預金額を登録します。
//その後、銀行クラスを生成、操作し銀行、預金者の情報を表示します

//以下の条件を満たすクラスを作成しなさい。
//※「+」はpublic、「-」はprivateを表す
//【Depositor】
//	・フィールド
//		- name:String
//		- money:int
//	・メソッド
//		+ showData():戻り値の型 void 
//			・預金者情報としてフィールドの内容を表示します
//		+ 各フィールドのsetter,getter(ソースタブの機能を用いて定義する)
//【Bankクラス】
//	・フィールド
//		- bankCode:String 初期値:"000111"
//		- bankName:int 初期値:"シェアード銀行"
//		- depositor:Depositor 
//	・メソッド
//		+ showData():戻り値の型 void 
//			・銀行情報としてbankCode,bankNameフィールドの内容を表示します
//			・depositorのshowData()を呼び出します
//		+ depositorのsetter,getter(ソースタブの機能を用いて定義する)
//【Mainクラス】
//	・メソッド
//		+ main(args:String[]):戻り値の型 void 
//			・コンソールから名前と預金額を入力します
//			・Depositorオブジェクトを生成します
//			・Depositorオブジェクトに名前と預金額をsetします
//			・Bankオブジェクトを生成します
//			・BankオブジェクトにDepositorオブジェクトをsetします
//			・Bank#showData()を呼び出します

//【出力例】
//預金者情報を登録します。
//input name? >>Miura Manabu
//input money? >>12345
//銀行に預金者情報を登録します。
//
//銀行情報を表示します
//bankCode:000111
//bankName:シェアード銀行
//
//預金者情報を表示します
//name:Miura Manabu
//money:12345

package day06.q02.anser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("預金者情報を登録します。");
		System.out.print("input name? >>");
		String name = br.readLine();
		System.out.print("input money? >>");
		int money = Integer.parseInt(br.readLine());

		Depositor depositor = new Depositor();// Depositorオブジェクト生成
		depositor.setName(name);// nameをDepositorにset
		depositor.setMoney(money);// moneyをDepositorにset

		System.out.println("銀行に預金者情報を登録します。");

		Bank bank = new Bank();// Bankオブジェクト生成
		bank.setDepositor(depositor);// depositorをBankにset

		bank.showData();// 銀行情報の表示

	}

}
