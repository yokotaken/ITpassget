import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Hashtable;

/**
 * Main�v���O����
 * @author admin
 *
 */
public class GetURLpage {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		// URL�p�^�[���̒�`


		// URL�p�^�[�����Ƃ�HTML�\�[�X���擾

		// HTML�\�[�X������A�񓚁A����ɕ���


		//




	}


	/**
	 * URL���w�肵�A�\�[�X���擾���郁�\�b�h
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
	 * HTML�\�[�X����A�񓚁A����ɂ킯�AHash�ŕԋp
	 * @param source
	 * @return
	 * @throws IOException
	 */
	public static Hashtable<String,String> separateHTMLtext(String source) throws IOException {

		Hashtable<String,String> rethash = new Hashtable<String,String>();

		return rethash;
	}
}
