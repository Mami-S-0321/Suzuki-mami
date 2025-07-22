package day06.q02.anser;

class Bank {

	private String bankCode = "000111";
	private String bankName = "シェアード銀行";
	private Depositor depositor;// DepositorをBankに集約

	public Depositor getDepositor() {
		return depositor;
	}

	public void setDepositor(Depositor depositor) {
		this.depositor = depositor;
	}

	public void showData() {
		System.out.println("\n銀行情報を表示します");
		System.out.println("bankCode:" + this.bankCode);
		System.out.println("bankName:" + this.bankName);

		depositor.showData();// depositorの表示は委譲する
	}

}
