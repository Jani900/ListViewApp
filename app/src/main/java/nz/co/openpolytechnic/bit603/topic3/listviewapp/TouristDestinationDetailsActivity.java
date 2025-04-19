package nz.co.openpolytechnic.bit603.topic3.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TouristDestinationDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_destination_details);

        TouristDestination destination;
        destination = (TouristDestination) getIntent().getSerializableExtra(getResources().getString(R.string.tourist_destination_object));
        ImageView imageView = findViewById(R.id.destinationDetailsImage);
        TextView title = findViewById(R.id.destinationTitleText);
        TextView description = findViewById(R.id.destinationDescriptionText);

        imageView.setImageResource(destination.getImageSource());
        title.setText(destination.getTitle());
        description.setText(destination.getDescription());
    }

    @Override
    protected void onStart() {
        Log.d("DetailsLifeCycle", "starting DetailsActivity");
        super.onStart();
    }
    @Override
    protected void onPause() {
        Log.d("DetailsLifeCycle", "pausing DetailsActivity");
        super.onPause();
    }
    @Override
    protected void onResume() {
        Log.d("DetailsLifeCycle", "resuming DetailsActivity");
        super.onResume();
    }
    @Override
    protected void onRestart() {
        Log.d("DetailsLifeCycle", "restarting DetailsActivity");
        super.onRestart();
    }
    @Override
    protected void onStop() {
        Log.d("DetailsLifeCycle", "stopping DetailsActivity");
        super.onStop();
    }
}