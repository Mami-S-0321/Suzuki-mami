/*ソースコードリーディング等にお使いください。*/

package other.venderMachine;

public class Main {

	public static void main(String[] args) {

		VenderMachine venderMachine = new VenderMachine();
		Human human = new Human("植木");
		human.insertCoin(venderMachine);
		human.buyDrink(venderMachine);
		human.show();
		venderMachine.show();

	}

}
