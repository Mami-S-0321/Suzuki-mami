package day10.q01answer;

public class Main {

	public static void main(String[] args) {

		Account suzuki = new Account();
		ConsoleReader consoleReader = new ConsoleReader();
		int pin = 0;
		try {
			pin = consoleReader.inputPIN();
			if (suzuki.getPin() == pin) {
				System.out.println("認証しました");
				suzuki.showAccount();
			} else {
				System.out.println("暗証番号が違います。");
			}
		} catch (IllegalInputException e) {
			e.printStackTrace();
		}

	}

}
