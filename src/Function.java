import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function {
	public void getLineNum(String Path) {
		//������������ȡ�ļ�������
		int line = 0;
		try {
			File file = new File(Path);
			FileReader fReader = new FileReader(file);
			BufferedReader bfr = new BufferedReader(fReader);
			while (bfr.readLine() != null) {
				line++;
				}
			fReader.close();
			bfr.close();
			System.out.println("���ļ��������ǣ�"+line);
		} catch (Exception e) {
			System.out.println("�ļ������ڣ�");
		}
		
	}
	
	public void getCharNum(String Path) {
		//������������ȡ�ļ����ַ���
		long length = 0;
		String string = null;
		try {
			File file = new File(Path);
			FileReader frReader = new FileReader(file);
			BufferedReader bfr = new BufferedReader(frReader);
			while ((string = bfr.readLine())!=null) {
				length += string.length();
			}
			bfr.close();
			frReader.close();
			System.out.println("���ļ����ַ���Ϊ��"+length);
		} catch (Exception e) {
			System.out.println("�ļ������ڣ�");
		}
	}
	
	public void getWordNum(String Path) {
		int word = 0;
		String string = null;
		StringBuffer sBuffer = new StringBuffer();
		try {
			File file = new File(Path);
			FileReader frReader = new FileReader(file);
			BufferedReader bfr = new BufferedReader(frReader);
			while ( (string = bfr.readLine()) != null ) {
				sBuffer.append(string+"\n");
			}
			frReader.close();
			bfr.close();
			Pattern p = Pattern.compile("\\b[A-Za-z]+\\b");
			Matcher m = p.matcher(sBuffer.toString());
			while (m.find()) {
				word++;
			}
		System.out.println("���ļ��ʵĸ���Ϊ��"+word);
		} catch (Exception e) {
			System.out.println("���ļ������ڣ�");
		}
		
	}
}
