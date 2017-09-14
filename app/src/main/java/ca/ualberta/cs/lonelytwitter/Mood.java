package ca.ualberta.cs.lonelytwitter;

/**
 * Created by owenm_000 on 9/13/2017.
 */

import java.util.Date;package ca.ualberta.cs.lonelytwitter;

/**
 * Created by owenm_000 on 9/13/2017.
 */
        import java.util.Date;

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
    public void setMood(String message) throws MoodNotSupported{
        if (message.toUpperCase().equals("Hungry") ){
            this.mood = "Hungry";
        }
        else if (message.toUpperCase().equals("Thirsty")){
            this.mood = "Thirsty";
        }
        else {
            throw new MoodNotSupported();
        }
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();
}
