package day05.q02.anser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleReader {

	int inputId() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id = Integer.parseInt(br.readLine());

		return id;
	}

}
