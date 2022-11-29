package com.example.todolist

import androidx.annotation.WorkerThread
import java.util.concurrent.Flow

class TaskItemRepository(private val taskItemDao:TaskItemDao) {

    val allTaskItems: kotlinx.coroutines.flow.Flow<List<TaskItem>> = taskItemDao.allTaskItems()

    @WorkerThread
    suspend fun insertTaskItem(taskItem: TaskItem){
        taskItemDao.insertTaskItem(taskItem)
    }

    @WorkerThread
    suspend fun updateTaskItem(taskItem: TaskItem){
        taskItemDao.updateTaskItem(taskItem)
    }

}