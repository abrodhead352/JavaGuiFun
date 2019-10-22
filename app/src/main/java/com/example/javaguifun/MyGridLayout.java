package com.example.javaguifun;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MyGridLayout extends GridLayout {

    public MyGridLayout(final Context context) {
        super(context);
        setBackgroundColor(Color.BLACK);
        /*
        setColumnCount(1);

        Button myButton = new Button(context);
        myButton.setText("Hello!");

        //you want this button to match parent for width, height
        //use GridLayout.LayoutParams
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.width = LayoutParams.MATCH_PARENT;
        layoutParams.height = LayoutParams.MATCH_PARENT;

        //set layoutParams to myButton
        myButton.setLayoutParams(layoutParams);

        //add it to the grid layout
        addView(myButton);
        */

        //task: add an NxN grid of buttons
        //hint: nested for loop
        int N = 4;

        //create listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hello from " +((Button) v).getText(), Toast.LENGTH_SHORT).show();
            }
        };

        //
        setColumnCount(N);
        Button grid[][] = new Button[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                grid[i][j] = new Button(context);
                grid[i][j].setText("(" + i +", " + j + ")");
                grid[i][j].setOnClickListener(listener);
                //to use spans and weights, use GridLayout.Spec nested class,
                //and its GridLayout.spec() static methods
                //row start index, row span, row weight
                GridLayout.Spec rowSpec = GridLayout.spec(i, 1, 1);
                GridLayout.Spec colSpec = GridLayout.spec(j, 1, 1);
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(rowSpec, colSpec);
                grid[i][j].setLayoutParams(layoutParams);
                addView(grid[i][j]);

            }
        }
    }
}
