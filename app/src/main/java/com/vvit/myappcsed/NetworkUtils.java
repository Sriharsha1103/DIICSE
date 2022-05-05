package com.vvit.myappcsed;
import android.net.Uri;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class NetworkUtils {
    public static String HTTP_URL = "https://api.themoviedb.org/3/movie/popular?api_key=d696f7a5f93540b0dac2ed52b5b7ee93";

    public static String getResponseFromHttpUrl()
            throws IOException{
        Uri uri = Uri.parse(HTTP_URL).buildUpon().build();
        URL url = new URL(uri.toString());
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try{
            InputStream in = urlConnection.getInputStream();
            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");
            boolean hasInput = scanner.hasNext();
            if(hasInput)
                return scanner.next();
            else
                return null;
        }
        finally {
            urlConnection.disconnect();
        }

    }
}
