package com.example.admin.uiexample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView vibrantView;
    private TextView vibrantLightView;
    private TextView vibrantDarkView;
    private TextView mutedView;
    private TextView mutedLightView;
    private TextView mutedDarkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newexample);
//this code for palette using for color extractor from image
       /* initViews();
        paintTextBackground();
*/
    }


  /*  private void initViews() {
        vibrantView = (TextView) findViewById(R.id.vibrantView);
        vibrantLightView = (TextView) findViewById(R.id.vibrantLightView);
        vibrantDarkView = (TextView) findViewById(R.id.vibrantDarkView);
        mutedView = (TextView) findViewById(R.id.mutedView);
        mutedLightView = (TextView) findViewById(R.id.mutedLightView);
        mutedDarkView = (TextView) findViewById(R.id.mutedDarkView);

    }*/

   /* private void paintTextBackground() {

        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.images);

        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                //work with the palette here
                int defaultValue = 0x000000;
                int vibrant = palette.getVibrantColor(defaultValue);
                int vibrantLight = palette.getLightVibrantColor(defaultValue);
                int vibrantDark = palette.getDarkVibrantColor(defaultValue);
                int muted = palette.getMutedColor(defaultValue);
                int mutedLight = palette.getLightMutedColor(defaultValue);
                int mutedDark = palette.getDarkMutedColor(defaultValue);

                vibrantView.setBackgroundColor(vibrant);
                vibrantLightView.setBackgroundColor(vibrantLight);
                vibrantDarkView.setBackgroundColor(vibrantDark);
                mutedView.setBackgroundColor(muted);
                mutedLightView.setBackgroundColor(mutedLight);
                mutedDarkView.setBackgroundColor(mutedDark);
            }



                public void setToolbarColor(Bitmap bitmap) {
                    // Generate the palette and get the vibrant swatch
                    // See the createPaletteSync() and checkVibrantSwatch() methods
                    // from the code snippets above
                    Palette p = createPaletteSync(bitmap);
                    Palette.Swatch vibrantSwatch = checkVibrantSwatch(p);

                    // Set the toolbar background and text colors
                    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                    toolbar.setBackgroundColor(vibrantSwatch.getRgb());
                    toolbar.setTitleTextColor(vibrantSwatch.getTitleTextColor());
                }
        });


    }

    private Palette.Swatch checkVibrantSwatch(Palette p) {
        Palette.Swatch vibrant = p.getVibrantSwatch();
        if (vibrant != null) {
            return vibrant;
        }


        return vibrant;
    }

    private Palette createPaletteSync(Bitmap bitmap) {

        Palette p = Palette.from(bitmap).generate();
        return p;
    }*/
}