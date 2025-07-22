package question08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method {
	
	/**
	 * ①2つの引数を使って四角形の面積を計算し、その計算結果を戻り値とするメソッドを作成しなさい。
	 * 戻り値：int型
	 */
	public int square(int length, int width) {
		int squareArea = length * width;
		
		return squareArea;
	}
	
	
	/**
	 * ②2つの引数を使って三角形の面積を計算し、その計算結果を戻り値とするメソッドを作成しなさい。
	 * 戻り値：double型
	 */
	public double triangle(int bottom, int height) {
		double triangeleArea = (double)(bottom * height) / 2;
		
		return triangeleArea;
	}
	
	
	/**
	 * ③1つの引数を使って円の面積を計算し、その計算結果を戻り値とするメソッドを作成しなさい。
	 * 戻り値：double型
	 * 円周率：3.14
	 */
	public double circle(int radius) {
		double circleArea = radius * radius * 3.14;
		
		return circleArea;
	}
	
	/**
	 * ④名前を入力するためのメソッドを作成し、その入力結果を戻り値とする
	 * 戻り値：String型
	 */
	public String nameInput() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("名前を入力してください。");
		String name = reader.readLine();
		
		return name;
	}
	
	/**
	 * ⑤引数の値が0以上10未満の場合はtrueをそれ以外の場合はfalseを戻り値とするメソッドを作成
	 * ヒント：条件分岐の前にtrueとfalseを保存する変数を作り、条件分岐の処理でその変数にtrueかfalseを保存する。
	 */
	public boolean numberCheck(int num) {
		boolean flag;
		
		if (0 <= num && num <10) {
			flag = true;
		}else {
			flag = false;
		}
		
		return flag;
	}

}
