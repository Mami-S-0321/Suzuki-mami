/*追加問題

パッケージ名 day4
クラス名 Lesson7.java

数当てゲームをします。
1から10の任意の整数をコンソールから入力をしてもらい、正解を当てられるまでコンソール入力を繰り返します。

以下の条件と出力例にあてはまるように記述を行ってください

【条件】
①繰り返し処理にはwhile文を使って下さい
②今回の解答の数値は「7」とします
③1以上10以下の整数に当てはまらない場合はcontinue文を用いて再度の入力をさせて下さい
④はずれの数値が入力された場合は「はずれです」という文言を出力し再度ループさせてください。
⑤「7」が入力された場合は「正解」を表示し、繰り返し処理から抜けてください

【出力例】
数当てゲームです。
1-10の整数を入力して下さい

input number?[1-10] >>11
error:1-10の整数を入力してください

input number?[1-10] >>1
残念、はずれです。。。もう一回！

input number?[1-10] >>7
正解！

ゲームを終了します
*/
package day04;

import java.io.IOException;

public class Lesson7 {

	public static void main(String[] args) throws IOException {
		/*ここから記入*/

		/*ここまで記入*/

		System.out.println("\nゲームを終了します");

	}
}



/*答え
 * import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson7_answer {

	public static void main(String[] args) throws IOException {

		int ansNum = 7;// 解答の数値

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean isCorrected = false;// ループ処理の判定変数。

		System.out.println("数当てゲームです。");
		System.out.println("1-10の整数を入力して下さい");
		while (!isCorrected) {

			System.out.print("\ninput number?[1-10] >>");
			int input = Integer.parseInt(br.readLine());

			// 範囲外の数値が入力された場合
			if (input < 1 || 10 < input) {
				System.out.println("error:1-10の整数を入力してください");
				continue;
			}

			// 答えの数値が入力された場合
			if (input == ansNum) {
				System.out.println("正解！");
				isCorrected = true;
				break;
			} // elseブロックで分岐処理させてもかまいません

			System.out.println("残念、はずれです。。。もう一回！");

		}

		System.out.println("\nゲームを終了します");

	}
}
 */