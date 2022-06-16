package models;

import java.util.ArrayList;

public class HeadHunter implements Subject {
    private ArrayList<String> jobs;
    private ArrayList<Observer> userList;
    
    public HeadHunter() {
        jobs = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public void addJob(String job) {
        this.jobs.add(job);
        notifyAllObserver();
    }

    public ArrayList<String> getJobs() {
        return this.jobs;
    }

    @Override
    public void registerObserver(Observer o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        userList.remove(o);
    }

    @Override
    public void notifyAllObserver() {
       for(Observer o : userList) {
        o.update(this);
       }
    }

    @Override
    public String toString() {
        return jobs.toString();
    }

}
