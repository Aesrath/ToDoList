package sg.edu.rp.c346.todolist;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by 16003806 on 16/7/2018.
 */

public class ToDoListList {

    private String description;
    private Calendar date;

    public ToDoListList(String description, Calendar date) {
        this.description = description;
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDoListList{" +
                "description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}


