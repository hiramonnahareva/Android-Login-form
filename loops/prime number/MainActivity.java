package com.example.loop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edFirstNum, edLastNum;

    String sFirstNum, sLastNum;
    long firstNum, lastNum;

    Button button;

    TextView textView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edFirstNum = findViewById(R.id.edFirstNum);
        edLastNum = findViewById(R.id.edLastNum);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sFirstNum = edFirstNum.getText().toString();
                sLastNum  = edLastNum.getText().toString();

                firstNum = (long) Float.parseFloat(sFirstNum);
                lastNum = (long) Float.parseFloat(sLastNum);

//                for(int x = 1; x <=5; x++) {
//                    for(int y = 1; y<=x; y++) {
//                        textView.setText(" * " );
//
////                    }
//                }
//                    textView.setText(" \n" );
//
                int num = (int) firstNum ,count =0;
                while ( count < lastNum) {
                    if (isPrimeNumber(num)) {
                        textView.append( num +"\n ");
                        count++;
                    }
                    num++;
                }

//        for (int i = (int) firstNum; i <=lastNum; ++i) {
//            for (int j = 1; j <= i; ++j) {
//                if (j % i == 0) {
//
//                }
//            }
//            textView.append("\n");
//        }
//
            }




//        int rows = 5, k = 0;
//
//        for (int x = 1; x <= rows; ++x, k = 0) {
//            for (int space = 1; space <= rows - x; ++space) {
//                textView.append("  ");
//            }
//
//            while (k != 2 * x - 1) {
//                textView.append("* ");
//                ++k;
//            }
//
//            textView.append("\n");
//        }
        });


    }
    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        boolean flag = true;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
