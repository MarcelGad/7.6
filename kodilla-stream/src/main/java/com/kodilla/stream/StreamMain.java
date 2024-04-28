package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        // Inicjowanie listy użytkowników forum
        Forum forum = new Forum();
        forum.addUser(new ForumUser(1, "John", 'M', LocalDate.of(1990, 5, 15), 2));
        forum.addUser(new ForumUser(2, "Anna", 'F', LocalDate.of(1985, 8, 20), 0));
        forum.addUser(new ForumUser(3, "Mike", 'M', LocalDate.of(2000, 3, 10), 5));
        forum.addUser(new ForumUser(4, "Emily", 'F', LocalDate.of(1998, 11, 25), 1));

        // Inicjowanie strumienia i przetwarzanie
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M') // Filtrowanie mężczyzn
                .filter(user -> user.getBirthDate().plusYears(20).isBefore(LocalDate.now())) // Filtrowanie osób powyżej 20 lat
                .filter(user -> user.getPostsCount() >= 1) // Filtrowanie użytkowników z co najmniej jednym postem
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user)); // Tworzenie mapy z unikalnymi identyfikatorami użytkowników

        // Wyświetlanie mapy wynikowej
        System.out.println(resultMap);
    }
}