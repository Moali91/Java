package json_api;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class Main {


    private static HttpURLConnection connection;
    static final Charset UTF8 = Charset.forName("UTF-8");


    public static void main(String[] args) {
        //Methode 1: java.net.HttpURLConenction

        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            URL url = new URL("http://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=1c488ff068774a759c2b59ba4f93e146");
            connection = (HttpURLConnection) url.openConnection();
            //request: setup

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            System.out.println(status); //200 means connection successful

            if(status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();
            }else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), UTF8));
                while ((line = reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();
            }
            //System.out.print(responseContent.toString());
            parse(responseContent.toString());
            JSONObject jsonObject = new JSONObject(responseContent.toString());
            JSONArray jsonArray = jsonObject.getJSONArray("articles");
            //System.out.print(jsonArray+"\n");

            JSONObject titleObj = jsonArray.getJSONObject(9);
            String title = titleObj.getString("title");
            System.out.println(title);



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
        }


    }

    public static String parse(String responseBody){
        JSONObject jsonObject = new JSONObject(responseBody);
        JSONArray albums = jsonObject.getJSONArray("articles");
        System.out.print("ID "+"Title "+"UserID\n");
        for(int i= 0; i < albums.length(); i++){
            JSONObject album = albums.getJSONObject(i);
            String author = album.getString("author");
            String title = album.getString("title");
            System.out.println(author);
        }
        return null;
    }



}
