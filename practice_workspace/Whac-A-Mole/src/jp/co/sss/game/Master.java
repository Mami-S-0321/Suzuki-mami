package jp.co.sss.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ゲームの進行役クラス<br/>
 * モグラたたきゲームの中心となるクラス
 *
 * @author SystemShared
 *
 */
public class Master {

    /** ユーザーの名前 */
    public static final String NAME1 = "あなた";

    /** コンピューター（対戦相手）の名前 */
    public static final String NAME2 = "コンピューター";

    /**
     * ゲーム進行機能<br/>
     * ゲームの進行を行う。
     *
     */
    public void advance() {

        System.out.println("\n「ゲームスタート！」");

        // ユーザーの準備
        Player player1 = new Player();
        player1.setName(NAME1);

        // コンピューターの準備
        Player player2 = new Player();
        player2.setName(NAME2);

        // モグラ1の準備
        Mole mole1 = new Mole();
        mole1.setName("モグ太郎");

        // モグラ2の準備
        Mole mole2 = new Mole();
        mole2.setName("モグ次郎");

        // それぞれのモグラをプレイヤーに持たせる
        player1.setMole(mole1);
        player2.setMole(mole2);

        // どちらか一方のモグラが叩かれるまでくり返す
        do {
            // それぞれのプレイヤーにモグラを配置させる
            player1.positioningMole();
            player2.positioningMole();

            // 盤の表示
            Display.showHex();

            // それぞれのプレイヤーに叩くマスを決定させる
            int strikePoint1 = player1.selectStrikePoint();
            int strikePoint2 = player2.autoSelectStrikePoint();

            // ユーザーがモグラを叩けたか判定
            judge(player2, strikePoint1);

            // ユーザーの結果表示
            showResult(player1, player2, strikePoint1);

            // コンピューターがモグラを叩けたか判定
            judge(player1, strikePoint2);

            // コンピューターの結果表示
            showResult(player2, player1, strikePoint2);

            goNext(); // 次へ進む(Enterキーの入力)

            // どちらか一方の（あるいは両方の）モグラが叩かれた場合はループを抜ける
        } while (!player1.getMole().isHitFlag()
                && !player2.getMole().isHitFlag());

        // 最終勝者の判定と表示
        finalJudge(player1, player2);
    }

    /**
     * あたり判定機能<br/>
     * プレイヤーがモグラを叩けたか判定する
     *
     * @param opponent
     *            対戦相手のプレイヤーオブジェクト
     *
     * @param strikePoint
     *            判定対象プレイヤーが叩いた座標
     *
     */
    private void judge(Player opponent, int strikePoint) {

        // 対戦相手のモグラを取得する
        Mole mole = opponent.getMole();

        // あたった場合は
        if (mole.getStayPoint() == strikePoint) {

            // 叩かれたモグラ内のフラグを立てる
            mole.setHitFlag(true);

        }
    }

    /**
     * 叩いた後の盤表示機能<br/>
     * 叩いた後ゲーム盤がどのようになっているか表示する
     *
     * @param currentPlayer
     *            判定対象のプレイヤーオブジェクト
     * @param opponent
     *            対戦相手のプレイヤーオブジェクト
     * @param strikePoint
     *            判定対象プレイヤーが叩いた座標
     */
    private void showResult(Player currentPlayer, Player opponent,
            int strikePoint) {

        System.out
                .println("\n「" + currentPlayer.getName() + "が叩いた結果を表示します。」\n");

        // 対戦相手のモグラを取得する
        Mole mole = opponent.getMole();

        // 盤の情報を表示する処理
        Display.showHex(mole, strikePoint);

        // モグラにメッセージを出力させる
        mole.speak();
    }

    /**
     * 最終勝者判定機能<br/>
     * 最終的な勝者を判定し表示する
     *
     * @param player1
     *            ユーザーのオブジェクト
     * @param player2
     *            コンピューターのオブジェクト
     */
    private void finalJudge(Player player1, Player player2) {

        System.out.println("\n「ゲーム終了！」\n");

        // ユーザーのモグラが無傷でコンピューターのモグラが叩かれていた場合
        if (!player1.getMole().isHitFlag() && player2.getMole().isHitFlag()) {
            System.out
                    .println("\n「おめでとうございます。" + player1.getName() + "の勝利です。」");

            // ユーザー、コンピューターともにモグラが叩かれた場合
        } else if (player1.getMole().isHitFlag()
                && player2.getMole().isHitFlag()) {
            System.out.println("\n「う～ん、おしい！今回は引き分けでした。」");

            // コンピューターのモグラが無傷でユーザーのモグラが叩かれていた場合
        } else {
            System.out.println("\n「残念でした。。。" + player2.getName() + "が勝ちました。」");
        }
    }

    /**
     * 次画面表示機能<br/>
     * コンソールの出力が流れるのを防ぐため<br/>
     * Enterキーを入力させ、次に展開に進ませる
     *
     */
    private void goNext() {

        System.out.println("\n【Enterキーを押してください】");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // 入力させる(Enterキーで案内しているが何が入力されても可)
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
