//問題

//パッケージ名 day5.q1
//クラス名1 CashRegister.java
//クラス名2 Main.java

//税抜き金額をコンソール入力し、税込み金額を出力します。
//下記の条件を満たすクラスをそれぞれ作成しなさい

//【CashRegisterクラス】
//クラス内に以下の条件を満たすcalcPriceメソッドを作成しなさい。
//なお、消費税は10%で計算すること
//・戻り値の型 int
//・int型の引数
//・引数の値に10%を上乗せし計算後の値をreturnする。値はキャストして整数値で返すこと。

//【Mainクラス】
//メインメソッド内に以下の条件を記述する。
//①コンソールから税抜き価格を入力します。
//②入力値を税抜き価格として出力する
//③CashRegisterオブジェクトをnewする。
//④コンソールからの入力値を実引数にし、CashRegisterオブジェクトのcalcPriceメソッドを呼び出す
//⑤呼び出したメソッドの戻り値を変数に代入し税込価格として出力する。
//
//【出力例】
//商品の税込み金額（消費税10％）を計算します。
//税抜き金額を入力してください。
//input money? >>56789
//税抜き価格：\56789
//税込み価格：\62467

package day05.q1.anser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("商品の税込み金額（消費税10％）を計算します。\n税抜き金額を入力してください。");
		System.out.print("input money? >>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cost = Integer.parseInt(br.readLine());
		System.out.println("税抜き価格：\\" + cost);

		CashRegister cashRegister = new CashRegister();// レジオブジェクトの生成
		int priceIncludeTax = cashRegister.calcPrice(cost);// メソッドを呼び出し、戻り値を変数に代入
		System.out.println("税込み価格：\\" + priceIncludeTax);

	}

}
