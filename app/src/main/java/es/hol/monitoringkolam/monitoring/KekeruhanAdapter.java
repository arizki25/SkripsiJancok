package es.hol.monitoringkolam.monitoring;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.hol.monitoringkolam.monitoring.pojo.Kekeruhan;


public class KekeruhanAdapter extends RecyclerView.Adapter<KekeruhanAdapter.ViewHolder> {

    ArrayList<Kekeruhan> listKekeruhan;
    Context context;

    public KekeruhanAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Kekeruhan> getListKekeruhan() {
        return listKekeruhan;
    }

    public void setListKekeruhan(ArrayList<Kekeruhan> listKekeruhan) {
        this.listKekeruhan = listKekeruhan;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.kekeruhan_item, parent, false);
//        ButterKnife.bind(this, view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Kekeruhan kekeruhan = listKekeruhan.get(position);
        holder.tvHasil.setText(getListKekeruhan().get(position).getNtu());
        holder.tvStatus.setText(getListKekeruhan().get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return getListKekeruhan().size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.hasilNTU)
        TextView tvHasil;
        @BindView(R.id.status)
        TextView tvStatus;
        public ViewHolder( View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}


//public class KekeruhanAdapter extends RecyclerView.Adapter<KekeruhanAdapter.ViewHolder> {
//    ArrayList<Kekeruhan> listkekeruhan;
//    Context context;
//
//    KekeruhanAdapter(Context context){this.context = context;}
//
//    public ArrayList<Kekeruhan>getListkekeruhan(){return listkekeruhan;}
//    public void setListkekeruhan(ArrayList<Kekeruhan>listkekeruhan){
//        this.listkekeruhan = listkekeruhan;
//    }
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kekeruhan_item,viewGroup,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
//        final Kekeruhan kekeruhan = listkekeruhan.get(i);
//        viewHolder.ntu.setText(kekeruhan.getNtu());
//        viewHolder.status.setText(kekeruhan.getStatus());
//    }
//
//    @Override
//    public int getItemCount() {return getListkekeruhan().size();}
//    public class ViewHolder extends RecyclerView.ViewHolder{
//        @BindView(R.id.hasilNTU)
//        TextView ntu;
//        @BindView(R.id.status)
//        TextView status;
//
//        public ViewHolder (@NonNull View itemView){
//            super(itemView);
//            ButterKnife.bind(this.itemView);
//        }
//    }
//
//}
