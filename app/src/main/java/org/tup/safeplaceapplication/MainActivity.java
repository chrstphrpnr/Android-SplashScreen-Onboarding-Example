package org.tup.safeplaceapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.tup.safeplaceapplication.onboarding.Feature_Adapters;
import org.tup.safeplaceapplication.onboarding.screens.Features_Screen_1;
import org.tup.safeplaceapplication.onboarding.screens.Features_Screen_2;
import org.tup.safeplaceapplication.onboarding.screens.Features_Screen_3;
import org.tup.safeplaceapplication.onboarding.screens.Features_Screen_4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private Feature_Adapters fragmentAdapter;
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private ImageView iv4;

    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_SafePlaceApplication);         //reset to original theme
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);

        btnNext = findViewById(R.id.btnNext);




        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Features_Screen_1());
        fragments.add(new Features_Screen_2());
        fragments.add(new Features_Screen_3());
        fragments.add(new Features_Screen_4());


        fragmentAdapter = new Feature_Adapters(getSupportFragmentManager(), getLifecycle(),fragments);
        viewPager.setAdapter(fragmentAdapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });


        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if(position == 0){
                    iv1.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_btngreen));
                    iv2.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv3.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv4.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                }

                else if(position == 1){
                    iv1.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv2.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_btngreen));
                    iv3.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv4.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                }

                else if(position == 2){
                    iv1.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv2.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv3.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_btngreen));
                    iv4.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                }

                else if(position == 3){
                    iv1.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv2.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv3.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_lightfont));
                    iv4.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.safeplace_btngreen));
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });




    }


}