package com.kleinpix.factories;

import com.kleinpix.model.Site;

import java.util.Map;

public class SiteFactory {

    public static Site getSite(Map<String, String> values,int id)
    {
        Site site = new Site.Builder()
                .id(id)
                .name(values.get("name"))
                .url(values.get("url"))
                .storyurl(values.get("story"))
                .build();
        return site;
    }
}
