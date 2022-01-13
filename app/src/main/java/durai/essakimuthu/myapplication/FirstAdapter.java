package durai.essakimuthu.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.viewholder>{

    ArrayList<modal> dataholder;
    public FirstAdapter(ArrayList<modal> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content,parent,false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
       holder.image.setImageResource(dataholder.get(position).getImg());
        holder.titlecard.setText(dataholder.get(position).getTitle());
        holder.contentcard.setText(dataholder.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView titlecard,contentcard;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.sporting_image);
            titlecard = itemView.findViewById(R.id.sporting_title);
            contentcard = itemView.findViewById(R.id.sporting_content);

        }
    }
}
