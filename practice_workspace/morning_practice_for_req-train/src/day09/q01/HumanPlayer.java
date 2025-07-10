package day09.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer implements Playable {

	private String name;

	public HumanPlayer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int doJanken() throws IOException {

		String hand[] = { "グー", "チョキ", "パー" };
		int choiceNumber = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(name + "さん、じゃんけんの手を選んで下さい");
		for (int i = 0; i < hand.length; i++) {
			System.out.println("\t" + i + "\t" + hand[i]);
		}
		System.out.print("input number[0-2]? >>");
		choiceNumber = Integer.parseInt(br.readLine());
		if (0 > choiceNumber || choiceNumber > 2) {
			throw new IllegalStateException("不正な値が入力されました");
		}
		return choiceNumber;
	}

}
