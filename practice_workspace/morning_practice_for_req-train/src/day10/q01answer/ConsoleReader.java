package day10.q01answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public int inputPIN() throws IllegalInputException {
		int pin = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("4ケタの暗証番号を入力して下さい");
		System.out.print("input PIN? >>");
		String inputString = "";
		try {
			inputString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (!inputString.matches("[0-9]{4}")) {
			throw new IllegalInputException("不正な入力:" + inputString);
		}

		pin = Integer.parseInt(inputString);
		return pin;
	}

}
