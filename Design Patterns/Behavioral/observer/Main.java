import models.HeadHunter;
import models.JobSeeker;

public class Main{
    public static void main(String[] args) {
       HeadHunter hh = new HeadHunter();
       hh.registerObserver(new JobSeeker("Sema"));
       hh.registerObserver(new JobSeeker("Mehmet"));
       hh.registerObserver(new JobSeeker("Irena Adler"));
       
       //each time, a new job is added,
       //all registered job seekers will get noticed
       hh.addJob("Google Job");
       hh.addJob("SpaceX Job");
    }
}