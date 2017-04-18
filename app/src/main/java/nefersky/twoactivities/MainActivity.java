package nefersky.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClickBirthday(View view) {
        EditText userEditText = (EditText)findViewById(R.id.editTextUser);
        EditText giftEditText = (EditText)findViewById(R.id.editTextGift);

        Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);
        intent.putExtra("nefersky.user", userEditText.getText().toString());
        intent.putExtra("nefersky.gift", giftEditText.getText().toString());

        startActivity(intent);
    }
}
