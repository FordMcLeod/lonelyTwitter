package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by owenm_000 on 9/13/2017.
 */

 public abstract class Mood {
    private String mood;
    private Date date;

    public Mood(String mood){
        date = new Date();
    }
    public Mood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
    public void setMood(String mood) throws MoodNotSupported{
        if (mood.toUpperCase().equals("Hungry") ){
            this.mood = "Hungry";
        }
        else if (mood.toUpperCase().equals("Thirsty")){
            this.mood = "Thirsty";
        }
        else {
            throw new MoodNotSupported();
        }
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isEmpty();
}
