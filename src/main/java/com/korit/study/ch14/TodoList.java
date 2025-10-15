package com.korit.study.ch14;

public class TodoList {
    Todo[] todos;

    TodoList() {
        todos = new Todo[0];
    }

    int generatedTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].id + 1;
//        int newId = 1;
//        if (todos.length == 0) {
//            return newId;
//        }
//        return todos[todos.length - 1].id + 1;
    }

    void add(Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[temp.length - 1] = todo;
        todos = temp;
    }

    // 다건조회
    Todo[] findAllByUserId(int userId) {
        int foundTodoCount = 0;
        for (Todo todo : todos) {
            if (todo.user.id == userId) {
                foundTodoCount++;
            }
        }
        Todo[] foundTodos = new Todo[foundTodoCount];
        for (int i = 0, j = 0; i < todos.length; i++) {
            if (todos[i].user.id == userId) {
                foundTodos[j] = todos[i];
                j++;
            }
        }
        return foundTodos;
    }


}

// find - 1. 특정 녀석 하나만 찾는 것 2. 여러개를 찾아서 가는 것