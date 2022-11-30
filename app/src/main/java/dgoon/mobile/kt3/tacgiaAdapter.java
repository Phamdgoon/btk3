package dgoon.mobile.kt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class tacgiaAdapter  extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Tacgia> tacgias;

    //private IClickItemLanguagueListener iClickItemLanguagueListener;


    public tacgiaAdapter(Context context, int layout, ArrayList<Tacgia> tacgias) {
        this.context = context;
        this.layout = layout;
        this.tacgias = tacgias;
    }

    @Override
    public int getCount() {
        return tacgias.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView img ;
        TextView txtName, txtMota, txtStar;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            // Ánh xạ View
            holder.txtName = (TextView) view.findViewById(R.id.name);
            holder.txtMota  = (TextView) view.findViewById(R.id.mota);
            holder.txtStar = (TextView) view.findViewById(R.id.sao);
            holder.img = (ImageView) view.findViewById(R.id.img);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Tacgia course = tacgias.get(i);

        holder.txtName.setText(course.getName());
        holder.txtMota.setText(course.getMota());
        holder.txtStar.setText(course.getSao());
        holder.img.setImageResource(course.getImg());
        return view;

    }
}

