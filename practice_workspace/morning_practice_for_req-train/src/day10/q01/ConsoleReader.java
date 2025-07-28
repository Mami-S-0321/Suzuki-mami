//	※既存クラスを修正すること
//	・メソッド（修正箇所のみ記載）
//		+ inputPIN():戻り値の型 int throws IOException,IllegalInputException
//			※コメントの場所に以下を追記
//			・if[4桁の数字以外の入力値の場合]
//				・throw new IllegalInputException("不正な入力:" + 入力値)
//			ヒント：条件は正規表現をつかって記述すること（P135参照）

package day10.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public int inputPIN() throws IOException,IllegalInputException {
		int pin = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("4ケタの暗証番号を入力して下さい");
		System.out.print("input PIN? >>");
		String inputString = br.readLine();

		/* ここに記述 */
		if(!inputString.matches("[0-9]{4}")){
			throw new IllegalInputException("不正な入力:" + inputString);
		}

		/* 記述終了 */

		pin = Integer.parseInt(inputString);
		return pin;
	}

}
