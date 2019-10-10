package mx.edu.tesoem.isc.proyectokarr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class frameMenu extends AppCompatActivity {

//Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_menu);

        //btn= (Button) findViewById(R.id.botong);
        //btn.setOnClickListener(this);
    }
    public void frameGuitarra(View v){
        Intent frameGuitar= new Intent(this,frameGuitarra.class);
        startActivity(frameGuitar);
        finish();
    }
    public void frameBajo(View v){
        Intent framebass= new Intent(this,frameBajo.class);
        startActivity(framebass);
        finish();
    }
    public void frameTeclado(View v){
        Intent frametec= new Intent(this,frameTeclado.class);
        startActivity(frametec);
        finish();
    }
    public void frameBateria(View v){
        Intent framedrums= new Intent(this,frameBateria.class);
        startActivity(framedrums);
        finish();
    }
    public void frameViolin(View v){
        Intent frameviolin= new Intent(this,frameViolin.class);
        startActivity(frameviolin);
        finish();
    }
    public void frameTrompeta(View v){
        Intent frametrumpet= new Intent(this,frameTrompeta.class);
        startActivity(frametrumpet);
        finish();
    }
    public void frameBeatbox(View v){
        Intent framebeat = new Intent(this,frameBeatbox.class);
        startActivity(framebeat);
        finish();
    }
    public void FrameAbout (View v){
        Intent about= new Intent(this,FrameAbout.class);
        startActivity(about);
        finish();
    }
}
