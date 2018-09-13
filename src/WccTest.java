import java.io.IOException;

public class WccTest {
	public static void main(String[] args) throws IOException {
			
			switch (args[0]) {
				case "-c":
					Function f = new Function();
					f.getCharNum(args[1]);
				break;
				
				case "-l":
					Function f1 = new Function();
					f1.getLineNum(args[1]);
				break;
				
				case "-w":
					Function f2 = new Function();
					f2.getWordNum(args[1]);
					break; 
	
				default:
					System.out.println("输入功能错误，请重新选择！");
					break;
			}
		
	}
}
