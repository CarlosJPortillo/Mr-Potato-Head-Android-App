//App constructs an image of Mr. Potato Head

package com.example.carlos.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CheckBox> checkBoxes = new ArrayList<CheckBox>();
        ArrayList<ImageView> images = new ArrayList<ImageView>();
        images.add((ImageView) findViewById(R.id.earsImage));
        images.add((ImageView) findViewById(R.id.mouthImage));
        images.add((ImageView) findViewById(R.id.hatImage));
        images.add((ImageView) findViewById(R.id.noseImage));
        images.add((ImageView) findViewById(R.id.armsImage));
        images.add((ImageView) findViewById(R.id.shoesImage));
        images.add((ImageView) findViewById(R.id.eyesImage));
        images.add((ImageView) findViewById(R.id.glassesImage));
        images.add((ImageView) findViewById(R.id.mustacheImage));
        images.add((ImageView) findViewById(R.id.eyesbrowsImage));

        checkBoxes.add((CheckBox) findViewById(R.id.checkBox16));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox17));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox18));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox19));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox20));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox21));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox22));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox23));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox24));
        checkBoxes.add((CheckBox) findViewById(R.id.checkBox25));
        int i = 0;
        //loop to add listeners to each of the checkBoxes
        while( i < checkBoxes.size()){
            final int fI = i;
            checkBoxes.get(i).setOnCheckedChangeListener((CompoundButton view, boolean isChecked) -> {
                        if(isChecked){
                            images.get(fI).setVisibility(view.VISIBLE);
                        }
                        else{
                            images.get(fI).setVisibility(view.INVISIBLE);
                        }
                    }
            );
            i++;
        }


    }
}
