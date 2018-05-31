package com.kleinpix.factories;

import com.kleinpix.model.Comment;
import com.kleinpix.model.User;
import com.kleinpix.model.Site;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class CommentFactory {
    public static Comment getComment(Map<String, String> values, Map<String, List> list, Date date,int id)
    {
        Comment comment = new Comment.Builder()
                .id(id)
                .comment(values.get("comment"))
                .date(date)
                .ipaddress(values.get("ipAddress"))
                .user((User) list.get("user"))
                .site((Site)list.get("site"))
                .build();
        return comment;
    }
}
