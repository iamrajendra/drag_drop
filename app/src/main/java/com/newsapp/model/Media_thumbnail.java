package com.newsapp.model;

/**
 * Created by gwl on 23/8/16.
 */
public class Media_thumbnail
        {
private String url;

public String getUrl ()
        {
        return url;
        }

public void setUrl (String url)
        {
        this.url = url;
        }

@Override
public String toString()
        {
        return "ClassPojo [url = "+url+"]";
        }
        }