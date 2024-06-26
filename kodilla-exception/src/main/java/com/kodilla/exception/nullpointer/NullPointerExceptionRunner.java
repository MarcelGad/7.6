package com.kodilla.optional;

import com.kodilla.exception.nullpointer.User;

import java.util.Optional;

class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getName()));
    }
}