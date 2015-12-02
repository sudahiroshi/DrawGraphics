import java.awt.*;
import java.awt.event.*;
/**
 * Frameに描画するサンプルプログラム
 * @author 須田
 * @version 1.0
 */
public class DrawExample extends Frame{
	/** mainメソッド */
	public static void main(String[] args) {
		new DrawExample();
	}

	/** コンストラクタ */
	public DrawExample(){
		super( "DrawExample" );
		setSize( 640, 480 );
		setLayout( null );
		addWindowListener( new WindowAdapter(){
			@Override public void windowClosing( WindowEvent e ){
				System.exit(0);
			}});
		setVisible( true );
		repaint();
	}

	/**
	 * paintメソッド
	 * javaが自動的に呼び出す
	 * @param g 描画対象オブジェクト
	 */
	@Override public void paint( Graphics g){
		g.drawLine( 100, 100, 200, 200 );
		System.out.println( "DrawExampleのpaintにより再描画しました" );
	}
}
