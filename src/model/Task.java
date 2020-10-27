package model;

import java.util.Objects;

public abstract class Task {
    private String taskId;
    private String descriere;

    public String getTaskId() {
        return taskId;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Task(String taskId, String descriere) {
        this.taskId = taskId;
        this.descriere = descriere;
    }
    public abstract void execute();

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        // daca nu este task nu este
        if(!(o instanceof Task)){
            return false;
        }
        Task t = (Task)o;
        return Objects.equals(t.getTaskId(),getTaskId()) &&
                Objects.equals(t.getDescriere(),getDescriere());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getTaskId(),getDescriere());
    }


    @Override
    public String toString(){
        return taskId + " " + descriere;
    }
}
