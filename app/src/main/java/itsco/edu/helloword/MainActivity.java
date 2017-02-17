package itsco.edu.helloword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hice una pequeña actualización", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Activity Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity Stop", Toast.LENGTH_SHORT).show();
    }
@Override
protected  void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity Pause", Toast.LENGTH_SHORT).show();
}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity Destroy", Toast.LENGTH_SHORT).show();
    }
}