package pro.jeong.tnb.dataretriever.connector;

import pro.jeong.tnb.dataretriever.common.WebSources;

import java.io.IOException;
import java.net.*;

public class Connector {
    Socket socket = new Socket();
    URL url = null;
    URLConnection connection = null;

    public Connector() {
        setURL();
        establishHttpConnection();
    }

    private void setURL() {
        try {
            url = new URL(WebSources.OKSUSU_MOVIE + "9000000333");
        } catch(MalformedURLException e) {
            e.printStackTrace();
            System.out.println("URL incorrect : " + url.getPath());
        }

    }

    private void establishSocketConnection() {

    }

    private void establishHttpConnection() {
        try {
            connection = url.openConnection();
            System.out.println("Connection Successfully Established");
            System.out.println(connection.getDate());
            System.out.println(connection.getContent());
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Failed to open connection with url : " + url.getPath());
        }
    }
}
