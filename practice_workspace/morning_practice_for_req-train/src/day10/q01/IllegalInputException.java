//	・Exceptionクラスを継承する
//	・コンストラクタ（Eclipseの自動生成機能を用いてもよい）
//		+ IllegalInputException()
//			・処理なし
//		+ IllegalInputException(message:String)
//			・super(message)

package day10.q01;

public class IllegalInputException extends Exception {
	public IllegalInputException(){

	}
    public IllegalInputException(String message){
		super(message);

	}

}
