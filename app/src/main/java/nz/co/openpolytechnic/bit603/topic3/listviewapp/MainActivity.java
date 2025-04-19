package nz.co.openpolytechnic.bit603.topic3.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView destinationList;
    List<TouristDestination> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDataList();
        destinationList = findViewById(R.id.touristDestinationListView);
        TouristDestinationAdapter adapter = new TouristDestinationAdapter(data, getApplicationContext());
        destinationList.setAdapter(adapter);
        destinationList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), TouristDestinationDetailsActivity.class);
                intent.putExtra(getResources().getString(R.string.tourist_destination_object), data.get(i));
                startActivity(intent);
            }
        });

        Button recycleViewButton = findViewById(R.id.topButton);
        recycleViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecycleViewActivity.class);
                startActivity(intent);
            }
        });

    }
    private void createDataList(){
        TypedArray imageResources = getResources().obtainTypedArray(R.array.images);
        String [] imageTitles = getResources().getStringArray(R.array.titles);
        String [] descriptions = getResources().getStringArray(R.array.descriptions);
        for(int i = 0; i < imageTitles.length; i++){
            TouristDestination item = new TouristDestination(imageResources.getResourceId(i, -1),
                    imageTitles[i],
                    descriptions[i]);
            data.add(item);
        }
    }
    @Override
    protected void onStart() {
        Log.d("MainLifeCycle", "starting MainActivity");
        super.onStart();
    }
    @Override
    protected void onPause() {
        Log.d("MainLifeCycle", "pausing MainActivity");
        super.onPause();
    }
    @Override
    protected void onResume() {
        Log.d("MainLifeCycle", "resuming MainActivity");
        super.onResume();
    }
    @Override
    protected void onRestart() {
        Log.d("MainLifeCycle", "restarting MainActivity");
        super.onRestart();
    }
    @Override
    protected void onStop() {
        Log.d("MainLifeCycle", "stopping MainActivity");
        super.onStop();
    }


}