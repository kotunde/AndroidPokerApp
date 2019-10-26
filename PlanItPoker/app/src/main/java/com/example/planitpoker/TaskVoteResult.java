package com.example.planitpoker;

public class TaskVoteResult {

    private String Name;
    private int Grade;
    private String Task;

    public TaskVoteResult(){

    }

    public TaskVoteResult(String name, int grade, String task) {
        Name = name;
        Grade = grade;
        Task = task;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getGrade() {
        return Grade;
    }

    public void setGrade(Integer grade) {
        Grade = grade;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }
}
