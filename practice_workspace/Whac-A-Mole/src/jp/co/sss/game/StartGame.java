package jp.co.sss.game;

/**
 * モグラたたきゲームの開始クラス<br/>
 * マスターオブジェクトの生成および<br/>
 * ゲーム進行機能の呼び出しを行う
 *
 * @author SystemShared
 *
 */
public class StartGame {

    /**
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {

        // ゲーム開始の準備
        Master master = new Master();

        // ゲーム開始
        master.advance();

    }
}
