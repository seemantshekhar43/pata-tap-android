package comandydevo.wixsite.seemantshekhar43.patatap;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playMusic(View view){

        int id = view.getId();// it is the unique no.

        //we will take the id name that we have assigned that is one, two....
        String nameID = view.getResources().getResourceEntryName(id);


        // set the music for each ids in the form(r.id...)
        int myMusic = getResources().getIdentifier(nameID,"raw","comandydevo.wixsite.seemantshekhar43.patatap");
        //create media player
        MediaPlayer mediaPlayer = MediaPlayer.create(this,myMusic);
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
