package Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Entity.DashBoardItem;
import neuroitech.ramajan.banglaApp.test.R;

/**
 * Created by Tanvir on 5/22/2015.
 */
public class CustomGridViewAdapter extends ArrayAdapter {

    Context context;
    int layoutResourceId;
    ArrayList<DashBoardItem> item = new ArrayList<>();

    public CustomGridViewAdapter(Context context, int layoutResourceId,
                                 ArrayList<DashBoardItem> item) {
        super(context, layoutResourceId, item);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.item = item;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        UserHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new UserHolder();

            holder.dashImage = (ImageView) row.findViewById(R.id.imgDashView);
            holder.dashTitle = (TextView) row.findViewById(R.id.txtDashLabel);

            row.setTag(holder);
        } else {
            holder = (UserHolder) row.getTag();
        }

        DashBoardItem dashItem = item.get(position);

        holder.dashImage.setImageResource(dashItem.getDashBoardimage());
        holder.dashTitle.setText(dashItem.getDashBoardTitle());

        holder.dashImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        holder.dashTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        return row;
    }

    static class UserHolder {
        ImageView dashImage;
        TextView dashTitle;
    }

}
