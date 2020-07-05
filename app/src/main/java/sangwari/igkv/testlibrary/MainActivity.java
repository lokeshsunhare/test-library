package sangwari.igkv.testlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sangwari.igkv.my_library.GetToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetToast.getToast(this, "lokesh");
    }
}
