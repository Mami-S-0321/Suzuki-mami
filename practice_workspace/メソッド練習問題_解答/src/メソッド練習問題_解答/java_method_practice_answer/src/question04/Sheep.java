/**
 * 戻り値の型；String
 * 引数：int型の変数hitPoint
 * メソッド名：drop
 * 処理：引数の値を利用して、引数の値が5以上であれば"羊肉"　それ以外の場合は"羊の毛"を戻り値として返す
 * 戻り値：String型の変数dropItem
 * 
 */
package question04;

public class Sheep {
	
	String drop(int hitPoint) {
		
		String dropItem;
		
		if(hitPoint >= 5) {
			
			dropItem = "羊肉";
			
		}else {
			
			dropItem = "羊の毛";
			
		}
		
		return dropItem;
	}

}
