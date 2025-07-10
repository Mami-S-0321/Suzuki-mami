package day09.q01;

import java.io.IOException;

public class SampleMain {

	public static void main(String[] args) throws IOException {

		HumanPlayer p1 = new HumanPlayer("suzuki");
		HumanPlayer p2 = new HumanPlayer("tanaka");

		Playable winner = JankenBattle.doBattle(p1, p2);

		if (winner == null) {
			System.out.println("あいこです");
		} else if (winner.equals(p1)) {
			System.out.println(p1.getName() + "さんの勝ちです");
		} else if (winner.equals(p2)) {
			System.out.println(p2.getName() + "さんの勝ちです");

		}

	}

}
