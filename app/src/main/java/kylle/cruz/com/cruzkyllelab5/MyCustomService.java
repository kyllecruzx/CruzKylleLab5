package kylle.cruz.com.cruzkyllelab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyCustomService extends IntentService {
    public MyCustomService(String name) {
        super("MyCustomService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Service", "MyCustomService is running in the background...");
    }
}
