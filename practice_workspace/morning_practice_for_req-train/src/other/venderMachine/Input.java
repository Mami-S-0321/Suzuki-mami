package other.venderMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public int number() {

		int inputNum = 0;

		try {

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("input? >>");
			String input = bufferedReader.readLine();
			if (input.matches("[0-9０-９]+")) {
				inputNum = Integer.parseInt(input);
			}

		} catch (IOException e) {
			System.out.println("入力例外");
			e.printStackTrace();
		}
		return inputNum;
	}

}
