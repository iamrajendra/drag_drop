package com.newsapp.model;

import org.simpleframework.xml.Element;

/**
 * Created by gwl on 23/8/16.
 */
@Element(name="Item")
public class Item
{
    @Element(name="guid")
    private String guid;
    @Element(name="pubDate")
    private String pubDate;
    @Element(name="title")
    private String title;
    @Element(name="description")
    private String description;
   
    private String link;
    private String imageThumb;

    public String getGuid ()
    {
        return guid;
    }

    public void setGuid (String guid)
    {
        this.guid = guid;
    }

    public String getPubDate ()
    {
        return pubDate;
    }

    public void setPubDate (String pubDate)
    {
        this.pubDate = pubDate;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getImageThumb ()
    {
        return imageThumb;
    }

    public void setImageThumb (String imageThumb)
    {
        this.imageThumb = imageThumb;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [guid = "+guid+", pubDate = "+pubDate+", title = "+title+", description = "+description+", link = "+link+", imageThumb = "+imageThumb+"]";
    }
}