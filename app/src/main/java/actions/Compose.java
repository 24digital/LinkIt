package actions;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.application.linkit.R;

/**
 * Created by Marion on 3/25/2015.
 */
public class Compose extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText editText = (EditText)findViewById(R.id.message_pane);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
