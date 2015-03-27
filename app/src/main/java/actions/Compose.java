package actions;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.application.linkit.R;

/**
 * Created by Marion on 3/25/2015.
 */
public class Compose extends ListActivity {
    private static final String[] items = {"marion", "mik", "chris"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.font_page);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items));

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
