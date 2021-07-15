package SimpleDictionary;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Properties props = new Properties();
			
//			File file = new File("dict.props");
//			System.out.println(file.getAbsolutePath());
			
			try (FileReader reader = new FileReader("dict.props")){
				props.load(reader);
			} catch (Exception err) {
				System.out.println(err.getMessage());
			}
			System.out.println(props.get("사과"));
			props.put("장미", "rose");
			FileOutputStream out = null;
			try {
			out = new FileOutputStream("dict.props");
			props.save(out,"나의 한영사전");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {out.close();}
				catch (Exception ignore) {
					
				}
			}
	}
}
