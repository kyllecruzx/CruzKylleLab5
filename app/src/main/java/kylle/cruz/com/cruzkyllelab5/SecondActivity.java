package kylle.cruz.com.cruzkyllelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnActivity1) {
            i = new Intent(this, FirstActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.MapsActivity2) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.5810 + "," + 120.9884));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        }
    }
}
