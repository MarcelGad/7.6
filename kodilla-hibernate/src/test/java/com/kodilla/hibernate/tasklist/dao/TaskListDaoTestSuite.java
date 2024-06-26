package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        // Given
        String listName = "Test List";
        TaskList taskList = new TaskList(listName, "Test Description");
        taskListDao.save(taskList);

        // When
        List<TaskList> readTaskLists = taskListDao.findByListName(listName);

        // Then
        assertEquals(1, readTaskLists.size());
        assertEquals(listName, readTaskLists.get(0).getListName());

        // CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
