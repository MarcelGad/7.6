package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList;

    public Forum() {
        this.userList = new ArrayList<>();
    }

    public void addUser(ForumUser user) {
        userList.add(user);
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}