package durai.essakimuthu.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.viewhold> {

    ArrayList<modal1> dataholder1;

    public SecondAdapter(ArrayList<modal1> dataholder1) {
        this.dataholder1 = dataholder1;
    }
    @NonNull
    @Override
    public viewhold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content1,parent,false);

        return new viewhold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewhold holder, int position) {
        holder.titlecard1.setText(dataholder1.get(position).getText1());
        holder.contentcard1.setText(dataholder1.get(position).getText2());
    }

    @Override
    public int getItemCount() {
        return dataholder1.size();
    }

    public class viewhold extends RecyclerView.ViewHolder  {
        TextView titlecard1,contentcard1;
        public viewhold(@NonNull View itemView) {
            super(itemView);
            titlecard1 = itemView.findViewById(R.id.txt1);
            contentcard1 = itemView.findViewById(R.id.txt2);

        }
    }
}
