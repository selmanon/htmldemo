package com.wedidit.htmldemo;

import android.text.Html;

/**
 * Created by Abdellah on 07/12/2015.
 */
public class HtmlParser {
    String body;

    String getTagValueFromString(String tag){
        String tagValue = null;
        tagValue = String.valueOf(Html.fromHtml(tag));
        return tagValue;
    }
}
