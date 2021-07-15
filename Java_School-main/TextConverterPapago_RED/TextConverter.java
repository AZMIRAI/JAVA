package TextConverterPapago_RED;

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

import org.json.JSONObject;


public class TextConverter extends JFrame{
 JButton converter;
 JButton canceler;
 JTextArea textIn;
 JTextArea textOut;

 public TextConverter()
 {
     super("text converter");

     textIn=new JTextArea(10,14);
     textOut=new JTextArea(10,14);
     textIn.setLineWrap(true);
     textOut.setLineWrap(true);
     textOut.setEnabled(false);

     JPanel textAreaPanel=new JPanel(new GridLayout(1,2,20,20));
     textAreaPanel.add(textIn);
     textAreaPanel.add(textOut);

     converter=new JButton("convert");
     canceler=new JButton("cancel");
     converter.addActionListener(new ButtonActionListener());
     canceler.addActionListener(new ButtonActionListener());

     JPanel buttonPanel=new JPanel(new FlowLayout());
     buttonPanel.add(converter);
     buttonPanel.add(canceler);

     JPanel mainPanel=new JPanel(new BorderLayout(10,10));
     mainPanel.add(BorderLayout.CENTER, textAreaPanel);
     mainPanel.add(BorderLayout.SOUTH, buttonPanel);

     this.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
     this.add(mainPanel);
     this.pack();
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
 }

 private class ButtonActionListener implements ActionListener
 {

     @Override
     public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
         if(e.getSource()==converter)
         {
             textOut.setText("");
             String result=getTransSentence(textIn.getText());
             textOut.append(subStringResult(result));
         }
         if(e.getSource()==canceler)
             textOut.setText("");

     }

     // private String toEnglish(String korean)
     // {
     //     String result=korean;
     //     result=result.replace("�ؽ�Ʈ","Text");
     //     result=result.replace("����","English");
     //     return result;
     // }
     
 }

 public String subStringResult(String s)
 {
     // String s_1=s;
     // int idx1=s_1.indexOf("translatedText");
     // int idx2=s_1.indexOf("engineType");
     //  return s_1.substring(idx1+17,idx2-3);
     
     //{"message":
     //        {"@type":"response",
     //          "@service":"naverservice.nmt.proxy",
     //          "@version":"1.0.0",
     //          "result":
     //                  {"srcLangType":"ko",
     //                  "tarLangType":"en",
     //                  "translatedText":"Kim Jin Hong",
     //                  "engineType":"N2MT",
     //                  "pivot":null}}}
     //
     // XXXX : AAAA �� getString(XXXX)�� AAAA�� ������ �� �ְ�
     // XXXX : {...} �� getJSONObject(XXXX)�� {...} ���� ��� ������ ���� �� �� �ִ�.

     JSONObject jObject=new JSONObject(s);               //  s : �ؼ��� ���� , s�� JSONObject���Ϸ� ��ȯ, s�� ���� �ּ�ó���� ����
     JSONObject converter_1=jObject.getJSONObject("message").getJSONObject("result");    // ���� ������ ��� message ��� ���� result ��ȣ�ȿ� �ִ� ��� ���� ������
     String result=converter_1.getString("translatedText");  // result ��� ���߿����� �츮�� �ʿ��� translatedText ��� ���� ������. ū����ǥ�� : ���� �˾Ƽ� �ɷ���

     return result;  // ���� ���� ����
     
     
     

 }

 public static void main(String[] args)
 {
     TextConverter t=new TextConverter();
     
 }


 // ���İ� API
 public String getTransSentence(String s){
     
     String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
     String text;
     try {
         text = URLEncoder.encode(s, "UTF-8");
     } catch (UnsupportedEncodingException e) {
         throw new RuntimeException("���ڵ� ����", e);
     }

     Map<String, String> requestHeaders = new HashMap<>();
     requestHeaders.put("X-Naver-Client-Id","lfGlyovLP4cw6i9Gw3Oc" );
     requestHeaders.put("X-Naver-Client-Secret", "g_5IkoWHyh");

     String responseBody = post(apiURL, requestHeaders, text);
     

     
     return responseBody;
     
 }

 private static String post(String apiUrl, Map<String, String> requestHeaders, String text){
     HttpURLConnection con = connect(apiUrl);
     String postParams = "source=ko&target=en&text=" + text; //�������: �ѱ��� (ko) -> �������: ���� (en)
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

