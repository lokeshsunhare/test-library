package sangwari.igkv.my_library;

import android.content.Context;
import android.widget.Toast;

public class GetToast {
    public static void getToast(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
}
