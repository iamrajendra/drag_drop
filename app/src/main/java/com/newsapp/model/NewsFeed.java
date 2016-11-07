package com.newsapp.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by gwl on 23/8/16.
 */
@Root(name ="xml")
public class NewsFeed
{
    @Element(name="rss")
    private Rss rss;

    public Rss getRss ()
    {
        return rss;
    }

    public void setRss (Rss rss)
    {
        this.rss = rss;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rss = "+rss+"]";
    }
}