package sg.edu.rp.c346.todolist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by 16003806 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoListList> toDo;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDoListList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        toDo = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvDesc = rowView.findViewById(R.id.textViewDesc);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        ToDoListList currentToDo = toDo.get(position);

        String description = currentToDo.getDescription();
        String date = currentToDo.getDateString();

        tvDesc.setText(description);
        tvDate.setText(date+"");

        return rowView;
    }
}
