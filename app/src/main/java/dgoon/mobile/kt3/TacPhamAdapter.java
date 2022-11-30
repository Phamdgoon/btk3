package dgoon.mobile.kt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TacPhamAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TacPham> tacPhams;

    public TacPhamAdapter(Context context, int layout, List<TacPham> tacPhams) {
        this.context = context;
        this.layout = layout;
        this.tacPhams = tacPhams;
    }

    @Override
    public int getCount() {
        return tacPhams.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder { ;
        TextView txtName,  txtStar;

    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TacPhamAdapter.ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new TacPhamAdapter.ViewHolder();
            // Ánh xạ View
            holder.txtName = (TextView) view.findViewById(R.id.name);
            holder.txtStar = (TextView) view.findViewById(R.id.sao);
            view.setTag(holder);
        } else {
            holder = (TacPhamAdapter.ViewHolder) view.getTag();
        }
        TacPham course = tacPhams.get(i);
        holder.txtName.setText(course.getNameTP());
        holder.txtStar.setText(course.getSao());
        return view;

    }
}
