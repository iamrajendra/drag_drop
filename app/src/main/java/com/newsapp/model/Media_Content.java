package com.newsapp.model;

/**
 * Created by gwl on 23/8/16.
 */
public class Media_Content
        {
private String height;

private String width;

private String url;

private String medium;

public String getHeight ()
        {
        return height;
        }

public void setHeight (String height)
        {
        this.height = height;
        }

public String getWidth ()
        {
        return width;
        }

public void setWidth (String width)
        {
        this.width = width;
        }

public String getUrl ()
        {
        return url;
        }

public void setUrl (String url)
        {
        this.url = url;
        }

public String getMedium ()
        {
        return medium;
        }

public void setMedium (String medium)
        {
        this.medium = medium;
        }

@Override
public String toString()
        {
        return "ClassPojo [height = "+height+", width = "+width+", url = "+url+", medium = "+medium+"]";
        }
        }