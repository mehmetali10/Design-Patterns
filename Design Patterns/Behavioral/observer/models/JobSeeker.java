package models;

public class JobSeeker implements Observer {

    public String name;

    public JobSeeker(String name) {
        this.name = name;
    }


    @Override
    public void update(Subject s) {
        System.out.println(this.name + " got notified! ");
        System.out.println(s);
    }
    
}
