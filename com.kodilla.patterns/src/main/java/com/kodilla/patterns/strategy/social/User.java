package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    private final SocialPublisher socialPublisher;

    public User(String name, SocialPublisher socialPublisher) {
        this.name = name;
        this.socialPublisher = socialPublisher;
    }

    public String sharePost() {
        socialPublisher.share();
        return "Post shared";
    }
}