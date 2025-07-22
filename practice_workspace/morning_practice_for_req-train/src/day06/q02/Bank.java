package day06.q02;

public class Bank {

	private  String bankCode = "000111";
	private String bankName = "シェアード銀行";
	private Depositor depositor;

	public void showData(){
	System.out.println("銀行情報を表示します");
	System.out.println("bankCode:" + bankCode);
	System.out.println("bankName:" + bankName);
	}

	public Depositor getDepositor() {
		return depositor;
	}

	public void setDepositor(Depositor depositor) {
		this.depositor = depositor;
	}




}
