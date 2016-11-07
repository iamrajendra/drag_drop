package com.newsapp.model;

import org.simpleframework.xml.Element;

/**
 * Created by gwl on 23/8/16.
 */
@Element(name="channel")
public class Channel
{
    @Element(name="title")
    private String title;
    @Element(name="description")
    private String description;
    @Element(name="link")
    private String link;
    @Element(name="lastBuildDate")
    private String lastBuildDate;
    @Element(name="item")
    private Item[] item;

    private String copyright;

    private String language;

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

    public String getLastBuildDate ()
    {
        return lastBuildDate;
    }

    public void setLastBuildDate (String lastBuildDate)
    {
        this.lastBuildDate = lastBuildDate;
    }

    public Item[] getItem ()
    {
        return item;
    }

    public void setItem (Item[] item)
    {
        this.item = item;
    }

    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", description = "+description+", link = "+link+", lastBuildDate = "+lastBuildDate+", item = "+item+", copyright = "+copyright+", language = "+language+"]";
    }
}