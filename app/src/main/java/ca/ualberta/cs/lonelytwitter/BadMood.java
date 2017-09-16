package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by owenm_000 on 9/15/2017.
 */

public class BadMood extends Mood{
    public BadMood(String mood, Date date) {
        super(mood, date);
    }
    public Boolean isBad() {
        return Boolean.TRUE;
    }
}
