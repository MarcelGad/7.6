package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new User("Justyna", new FacebookPublisher());
        User user2 = new User("Adam", new TwitterPublisher());
        User user3 = new User("Mariusz", new SnapchatPublisher());
        //When
        String result1 = user1.sharePost();
        String result2 = user2.sharePost();
        String result3 = user3.sharePost();
        //Then
        assertEquals("Post shared", result1);
        assertEquals("Post shared", result2);
        assertEquals("Post shared", result3);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new User("Justyna", new TwitterPublisher());
        User user2 = new User("Adam", new SnapchatPublisher());
        User user3 = new User("Mariusz", new FacebookPublisher());
        //When
        String result1 = user1.sharePost();
        String result2 = user2.sharePost();
        String result3 = user3.sharePost();
        //Then
        assertEquals("Post shared", result1);
        assertEquals("Post shared", result2);
        assertEquals("Post shared", result3);
    }
}