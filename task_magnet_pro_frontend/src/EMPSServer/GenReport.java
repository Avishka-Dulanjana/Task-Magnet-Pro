package EMPSServer;
import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class GenReport extends Application {
	
	public static String s1=null;
	public static String s2=null;
	public static String s3=null;
	public static String s4=null;
	public static String s5=null;
	public static String s6=null;
	public static String s7=null;
	public static String s8=null;
	public static String s9=null;
	public static String s10=null;
	
	public static void SetVal(int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8,int a9,int a10) {
	
	s1 = Integer.toString(a1);
	s2 = Integer.toString(a2);
	s3 = Integer.toString(a3);
	s4 = Integer.toString(a4);
	s5 = Integer.toString(a5);
	s6 = Integer.toString(a6);
	s7 = Integer.toString(a7);
    s8 = Integer.toString(a8);
	s9 = Integer.toString(a9);
	s10 = Integer.toString(a10);
	}

    public static void main(String[] args) {
      launch(args);
    }

    public void start(Stage primaryStage) {
    
    	
        primaryStage.setTitle("EMPSatisfy Survey Question Analysis Report");

        WebView webView = new WebView();
   
        webView.getEngine().load("https://quickchart.io/chart?"
        		+ "bkg=orange"
        		+ "&c=%7B%0A%20%20"
        		+ "type%3A%20%27"
        		+ "bar%27%2C%0A%20%20"
        		+ "data%3A%20%7B%0A%20%20%20%20"
        		+ "labels"
        		+ "%3A%20%5B%221%20Stars%22%2C%222%20Stars%22%2C%223%20Stars%22%2C%224%20Stars%22%2C%225%20Stars%22%2C%226%20Stars%22%2C%227%20Stars%22%2C%228%20Stars%22%2C%229%20Stars%22%2C%2210%20Stars%22%2C%5D%2C%0A%20%20%20%20"
        		+ "datasets"
        		+ "%3A%20%5B%7B%0A%20%20%20%20%20%20"
        		+ "label"
        		+ "%3A%20%27"
        		+ "No%20of%20users"
        		+ "%27%2C%0A%20%20%20%20%20%20"
        		+ "data%3A%20%5B"
        		+ s1
        		+ "%2C"
        		+ s2
        		+ "%2C"
        		+ s3
        		+ "%2C"
        		+ s4
        		+ "%2C"
        		+ s5
        		+ "%2C"
        		+ s6
        		+ "%2C"
        		+ s7
        		+ "%2C"
        		+ s8
        		+ "%2C"
        		+ s9
        		+ "%2C"
        		+ s10
        		+ "%2C%5D%0A%20%20%20%20%7D%2C%20%5D%0A%20%20%7D%0A%7D");

        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 960, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}

