package com.bug;

import android.app.Activity;
import android.os.Bundle;

public class Bug extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Bar = Common.Foo;
    }
    
    public static int Bar = 100;
}