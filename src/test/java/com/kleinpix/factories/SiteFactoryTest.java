package com.kleinpix.factories;

import com.kleinpix.model.Site;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SiteFactoryTest {

    Site site;
    Map<String, String> siteList;

    @Before
    public void setUp() throws Exception {

        siteList = new HashMap<String, String>();
        siteList.put("ID: ","1001");
        siteList.put("NAME: ","KLEINPIX");
        siteList.put("URL","http://www.kleinpix.co.za");
        siteList.put("StoryURL: ", "Photography Service");
        site = SiteFactory.getSite(siteList, 1001);
    }

    @Test
    public void getSite() {

        assertEquals("Photography Service", site.getUrl());
    }
    @Test
    public void testSiteObject() throws Exception {
        assertEquals(true, site.equals(site));
    }
}