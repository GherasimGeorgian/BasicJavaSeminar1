package model;

import Utils.Constants;

import java.time.LocalDateTime;

public class MessageTask  extends  Task{
    private String message;
    private String from;
    private String to;
    private LocalDateTime date;

    public MessageTask(String taskId, String descriere, String message, String from, String to, LocalDateTime date) {
        super(taskId, descriere);
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }
    @Override
    public void execute(){
        System.out.println(this.toString());
    }


    public String toString(){
        return super.toString() + " " + message + " " + from + " " + to + date.format(Constants.DATE_TIME_FORMATTER);
    }
}
