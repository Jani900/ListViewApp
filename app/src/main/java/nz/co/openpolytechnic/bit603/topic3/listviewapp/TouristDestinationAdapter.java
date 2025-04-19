package nz.co.openpolytechnic.bit603.topic3.listviewapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TouristDestinationAdapter extends BaseAdapter {
    List<TouristDestination> data;
    Context context;

    public TouristDestinationAdapter(List<TouristDestination> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    class Elements{
        ImageView image;
        TextView title;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Elements elements = null;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.layout_destination_list_item, null);
        }
        elements = new Elements();
        elements.image = view.findViewById(R.id.destinationCardImage);
        elements.title = view.findViewById(R.id.destinationCardTitle);
        TouristDestination destination = data.get(i);
        elements.image.setImageResource(destination.getImageSource());
        elements.title.setText(destination.getTitle());
        return view;
    }
}
