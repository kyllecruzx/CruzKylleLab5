package kylle.cruz.com.cruzkyllelab5;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnActivity2) {
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.MapsActivity1) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.5792 + "," + 120.9725));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        }
    }
}
