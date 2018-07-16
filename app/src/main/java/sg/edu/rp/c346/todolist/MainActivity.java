package sg.edu.rp.c346.todolist;

import java.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvToDo;

    ArrayList<ToDoListList> alToDo;
    CustomAdapter caToDo;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvToDo = findViewById(R.id.listViewToDo);
        alToDo = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2018,7,1);
        date2.set(2018,9,22);
        ToDoListList toDo1 = new ToDoListList("MSA",date1);
        ToDoListList toDo2 = new ToDoListList("Go",date2);
        alToDo.add(toDo1);
        alToDo.add(toDo2);

        caToDo = new CustomAdapter(this,R.layout.to_do_list,alToDo);

        lvToDo.setAdapter(caToDo);



    }
}
