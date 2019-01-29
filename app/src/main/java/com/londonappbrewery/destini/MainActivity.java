package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView story;
    private Button topBtn;
    private Button bottomBtn;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story =  findViewById(R.id.storyTextView);
        topBtn = findViewById(R.id.buttonTop);
        bottomBtn = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1 || mStoryIndex == 2) {
                    story.setText(R.string.T3_Story);
                    topBtn.setText(R.string.T3_Ans1);
                    bottomBtn.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else{
                    story.setText(R.string.T6_End);
                    topBtn.setVisibility(View.GONE);
                    bottomBtn.setVisibility(View.GONE);
                }
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    story.setText(R.string.T2_Story);
                    topBtn.setText(R.string.T2_Ans1);
                    bottomBtn.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if(mStoryIndex == 2){
                    story.setText(R.string.T4_End);
                    topBtn.setVisibility(View.GONE);
                    bottomBtn.setVisibility(View.GONE);
                }else{
                    story.setText(R.string.T5_End);
                    topBtn.setVisibility(View.GONE);
                    bottomBtn.setVisibility(View.GONE);
                }
            }
        });







    }
}
