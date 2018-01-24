package example.codeclan.com.rockpaperscissorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void onClickPlayButton(View button){
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);

    }
}
