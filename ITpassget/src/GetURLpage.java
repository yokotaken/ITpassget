import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Hashtable;

/**
 * Mainプログラム
 * @author admin
 *
 */
public class GetURLpage {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// URLパターンの定義


		// URLパターンごとにHTMLソースを取得

		// HTMLソースから問題、回答、解説に分離


		//




	}


	/**
	 * URLを指定し、ソースを取得するメソッド
	 * @param url
	 * @return HTMLsource
	 * @throws IOException
	 */
	public static String getSourceText(URL url) throws IOException {
		InputStream in = url.openStream();
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(in));
			String s;
			while ((s=bf.readLine())!=null) {
			sb.append(s);
				}
		} finally {
			in.close();
		}
		return sb.toString();
	}


	/**
	 * HTMLソースを問題、回答、解説にわけ、Hashで返却
	 * @param source
	 * @return
	 * @throws IOException
	 */
	public static Hashtable<String,String> separateHTMLtext(String source) throws IOException {

		Hashtable<String,String> rethash = new Hashtable<String,String>();

		return rethash;
	}
}
