package com.wedidit.htmldemo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import static com.wedidit.htmldemo.Utils.*;
/**
 * Created by Abdellah on 07/12/2015.
 */
public class HttpRequest {
    HttpURLConnection mHttpURLConnection;
    InputStream inputStream;

    public String getResponseAsString(URL url){
        String mRequestResponse = null;
        try {
            mHttpURLConnection = (HttpURLConnection) url.openConnection();
            inputStream = new BufferedInputStream(mHttpURLConnection.getInputStream());
            mRequestResponse = convertStreamToString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mRequestResponse;
    }
}
