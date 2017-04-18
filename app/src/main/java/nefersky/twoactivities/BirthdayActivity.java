package nefersky.twoactivities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        String user = "Animal";
        String gift = "a donut hole";

        user = getIntent().getStringExtra("nefersky.user");
        gift = getIntent().getStringExtra("nefersky.gift");

        TextView infoTextView = (TextView)findViewById(R.id.textView);
        infoTextView.setText(user + ", you got " + gift);
    }
}
