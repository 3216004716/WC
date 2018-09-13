import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function {
	public void getLineNum(String Path) {
		//创建方法，获取文件的行数
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
			System.out.println("该文件的行数是："+line);
		} catch (Exception e) {
			System.out.println("文件不存在！");
		}
		
	}
	
	public void getCharNum(String Path) {
		//创建方法，获取文件的字符数
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
			System.out.println("该文件的字符数为："+length);
		} catch (Exception e) {
			System.out.println("文件不存在！");
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
		System.out.println("该文件词的个数为："+word);
		} catch (Exception e) {
			System.out.println("该文件不存在！");
		}
		
	}
}
