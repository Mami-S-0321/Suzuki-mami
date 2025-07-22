/**
 * Methodクラスの①～⑥のメソッドを呼び出して、処理結果をコンソール上に出力
 * 
 * ▼出力例
 * 20cm2
 * 15.0cm2
 * 50.24cm2
 * 名前を入力してください。
 * 田中太郎
 * 田中太郎です。
 * trueです。
 */
package question08;

import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {
		
		Method method = new Method();
		
		//①　引数5と4
		int squareArea = method.square(5, 4);
		
		System.out.println(squareArea + "cm2");
		
		//②　引数5と6
		double triangleArea = method.triangle(5, 6);
		
		System.out.println(triangleArea + "cm2");
		
		//③　引数4
		double circleArea = method.circle(4);
		
		System.out.println(circleArea + "cm2");
		
		//④
		String name = method.nameInput();
		
		System.out.println(name +"です。");
		
		//⑤
		boolean flag = method.numberCheck(9);
		
		System.out.println(flag + "です。");

	}

}
