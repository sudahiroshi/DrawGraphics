import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.net.*;

/**
 * レポートのためのひな形プログラム
 * author 須田
 * version 1.0
 */
public class DrawGraphics extends Frame{
	private MyCanvas c;
	private boolean mode = true;

	/** mainメソッド
	 * @param args コマンドラインパラメータ
	 */
	public static void main( String[] args ) {
		DrawGraphics dg = new DrawGraphics();
		dg.draw();
	}

	/** コンストラクタ兼プログラム本体 */
	public DrawGraphics() {
		super( "DrawGraphics" );
		setSize( 640, 480 );
		addWindowListener( new WindowAdapter() {
			@Override public void windowClosing( WindowEvent e ) {
				System.exit(0);
			}
		});
		c = new MyCanvas();
		add( c );
		setVisible( true );
	}

	/**
	 * 描画メソッド
	 * @param g 描画オブジェクト
	 */
	@Override public void paint( Graphics g ){
		c.repaint();
	}

	public void draw() {
		c.push( new Line( 0, 0, 500, 400 ) );
		c.push( new Line( 300, 0, 300, 400 ) );
		for( int i=0; i<10; i+=3 ) {
			c.push( new Line( i, 0, 640-i, 480 ) );
		}
	}
}
