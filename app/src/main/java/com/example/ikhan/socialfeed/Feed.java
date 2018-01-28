package com.example.ikhan.socialfeed;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.facebook.AccessToken;

public class Feed extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_feed);
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        TextView txt=(TextView)findViewById(R.id.Token);
        txt.setText(""+accessToken);
    }
}
