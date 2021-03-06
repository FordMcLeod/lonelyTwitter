package ca.ualberta.cs.lonelytwitter;

/**
 * Created by owenm_000 on 9/13/2017.
 */
import java.util.Date;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() >= 140){
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();

    public void setDate(Date date) {this.date=date;}

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
