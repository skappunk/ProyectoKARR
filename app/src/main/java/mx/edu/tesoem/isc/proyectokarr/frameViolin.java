package mx.edu.tesoem.isc.proyectokarr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class frameViolin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_violin);
    }
    public void frameMenu (View v){
        Intent frameM= new Intent(this,frameMenu.class);
        startActivity(frameM);
        finish();
    }
}
