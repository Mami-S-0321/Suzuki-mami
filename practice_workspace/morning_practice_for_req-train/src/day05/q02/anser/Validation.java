package day05.q02.anser;

class Validation {

	boolean checkId(int id) {

		boolean canLogin = false;
		if (id == 1111 || id == 2222) {
			canLogin = true;
		}
		return canLogin;
	}

}
