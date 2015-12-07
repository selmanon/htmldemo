package com.wedidit.htmldemo;

/**
 * Created by Abdellah on 07/12/2015.
 */
public class Utils {
    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
