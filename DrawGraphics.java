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

	/** コンストラクタ */
	public DrawGraphics() {
		super( "DrawGraphics" );
		setSize( 640, 480 );
		addWindowListener( new WindowAdapter() {
			@Override public void windowClosing( WindowEvent e ) {
				System.exit(0);
			}
		});
		this.c = new MyCanvas();
		add( c );
		setVisible( true );
	}

	/**
	 * 描画に使用するメソッド
	 * @param g 描画オブジェクト
	 */
	@Override public void paint( Graphics g ){
		this.c.repaint();
	}

	/** 図形を描画するためにpushするメソッド */
	public void draw() {
		this.c.push( new Line( 0, 0, 500, 400 ) );
		this.c.push( new Line( 300, 0, 300, 400 ) );
	}
}
