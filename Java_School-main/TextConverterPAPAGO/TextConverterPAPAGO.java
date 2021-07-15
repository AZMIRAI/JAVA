package TextConverterPAPAGO;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextConverterPAPAGO extends JFrame{

	JButton converter;
	JButton canceler;
	JTextArea textIn;
	JTextArea textOut;
	private final static String CLIENT_ID = "lfGlyovLP4cw6i9Gw3Oc";
	private final static String CLIENT_SECRET = "g_5IkoWHyh";
	
	public TextConverterPAPAGO() {
		
		super("�ؽ�Ʈ��ȯ");
		
		//�ؽ�Ʈ����
		textIn = new JTextArea(10,14);
		textOut	=	new JTextArea(10,14);
		textIn.setLineWrap(true);
		textOut.setLineWrap(true);
		textOut.setEnabled(false);
//		textOut.setEditable(true);
		
		JPanel textAreaPanel = new JPanel (new GridLayout(1,2,20,20));
		textAreaPanel.add(textIn);
		textAreaPanel.add(textOut);
		
		converter = new JButton("��ȯ");
		canceler = new JButton("���");
		converter.addActionListener(new ButtonActionListener());
		canceler.addActionListener(new ButtonActionListener());
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(converter);
		buttonPanel.add(canceler);
		
		JPanel mainPanel = new JPanel(new BorderLayout(10,10));
		mainPanel.add(BorderLayout.CENTER,textAreaPanel);
		mainPanel.add(BorderLayout.SOUTH,buttonPanel);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		this.add(mainPanel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	private class ButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==converter) {
				textOut.setText("");
				String result = toEnglish(textIn.getText());
				textOut.append(result);
			}
			if(e.getSource()==canceler) {
				textOut.setText("");
			}
		}
		
//		��ȯ ��ư�� Ŭ���Ǿ��ٸ� ����textArea(textIn)�� �ؽ�Ʈ�� �о ����� ��ȯ�ϰ�
//		�� ��ȯ�� ����� ����textArea(textOut)�� append ��� ��ư�� Ŭ���Ǿ��ٸ� ���� textOut��
//		���ڿ��μ���
//			
		private String toEnglish(String korean) {
			//korean ���ڿ��� ����� ��ȯ�ؼ� ��ȯ
			//�ؽ�Ʈ >> text
			//���� >> english
			//������ �ٲ�°Ծƴ�
			String result = korean;
			String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
	        String text;
	        try {
	            text = URLEncoder.encode(korean, "UTF-8");
	        } catch (UnsupportedEncodingException e) {
	            throw new RuntimeException("���ڵ� ����", e);
	        }

	        Map<String, String> requestHeaders = new HashMap<>();
	        requestHeaders.put("X-Naver-Client-Id", CLIENT_ID);
	        requestHeaders.put("X-Naver-Client-Secret", CLIENT_SECRET);

	        result = post(apiURL, requestHeaders, text);
	        
	        //����� ������ �� �ڡ�
	        

	        result = result.substring(result.indexOf("translatedText")+
	        		"translatedText".length()+3,
	        result.indexOf("engineType")-3);
	        System.out.println(result);
			return result;

		}
	
	}

	 public static void main(String[] args) {
	        

	        String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
	        String text;
	        try {
	            text = URLEncoder.encode("�ȳ��ϼ���. ���� ����� ����ϱ�?", "UTF-8");
	        } catch (UnsupportedEncodingException e) {
	            throw new RuntimeException("���ڵ� ����", e);
	        }

	        Map<String, String> requestHeaders = new HashMap<>();
	        requestHeaders.put("X-Naver-Client-Id", CLIENT_ID);
	        requestHeaders.put("X-Naver-Client-Secret", CLIENT_SECRET);

	        String responseBody = post(apiURL, requestHeaders, text);
	        
	        System.out.println(responseBody);
	        
	        TextConverterPAPAGO t = new TextConverterPAPAGO();
	    }

	    private static String post(String apiUrl, Map<String, String> requestHeaders, String text){
	        HttpURLConnection con = connect(apiUrl);
	        String postParams = "source=ko&target=en&text=" + text; //�������: �ѱ��� (ko) -> �������: ���� (en)
	        	//���⸦ �ٲٸ� �� �ٲ�
	        
	        try {
	            con.setRequestMethod("POST");
	            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
	                con.setRequestProperty(header.getKey(), header.getValue());
	            }

	            con.setDoOutput(true);
	            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
	                wr.write(postParams.getBytes());
	                wr.flush();
	            }

	            int responseCode = con.getResponseCode();
	            if (responseCode == HttpURLConnection.HTTP_OK) { // ���� ����
	                return readBody(con.getInputStream());
	            } else {  // ���� ����
	                return readBody(con.getErrorStream());
	            }
	        } catch (IOException e) {
	            throw new RuntimeException("API ��û�� ���� ����", e);
	        } finally {
	            con.disconnect();
	        }
	    }

	    private static HttpURLConnection connect(String apiUrl){
	        try {
	            URL url = new URL(apiUrl);
	            return (HttpURLConnection)url.openConnection();
	        } catch (MalformedURLException e) {
	            throw new RuntimeException("API URL�� �߸��Ǿ����ϴ�. : " + apiUrl, e);
	        } catch (IOException e) {
	            throw new RuntimeException("������ �����߽��ϴ�. : " + apiUrl, e);
	        }
	    }

	    private static String readBody(InputStream body){
	        InputStreamReader streamReader = new InputStreamReader(body);

	        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
	            StringBuilder responseBody = new StringBuilder();

	            String line;
	            while ((line = lineReader.readLine()) != null) {
	                responseBody.append(line);
	            }

	            return responseBody.toString();
	        } catch (IOException e) {
	            throw new RuntimeException("API ������ �дµ� �����߽��ϴ�.", e);
	        }
	    }
	
	
}
