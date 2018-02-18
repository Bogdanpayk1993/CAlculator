package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public TextView out;
    public Button bsquare;
    public Button bcinnamon;
    public Button bplusminus;

    double r = 0;
    double r1 = 0;
    int d = 0;
    int p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = (TextView) findViewById(R.id.out);
        bsquare = (Button) findViewById(R.id.bsquare);
        bsquare.setText("\u0061" + "\u207F");
        bcinnamon = (Button) findViewById(R.id.bcinnamon);
        bcinnamon.setText("\u207F" + "\u221A" + "\u0061");
        bplusminus = (Button) findViewById(R.id.bplusminus);
        bplusminus.setText("\u00B1");
    }

    public void b0_Click(View v) {
        if (p == 0) {
            r = r * 10 + 0;
        }
        else {
            float k = 0;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void b1_Click(View v) {
        if (p == 0) {
            r = r * 10 + 1;
        }
        else
        {
            float k = 1;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void b2_Click(View v) {
        if (p == 0) {
            r = r * 10 + 2;
        }
        else
        {
            float k = 2;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void b3_Click(View v) {
        if (p == 0) {
            r = r * 10 + 3;
        }
        else
        {
            float k = 3;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void  b4_Click(View v) {
        if (p == 0) {
            r = r * 10 + 4;
        }
        else
        {
            float k = 4;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void b5_Click(View v) {
        if (p == 0) {
            r = r * 10 + 5;
        }
        else
        {
            float k = 5;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }
    public void b6_Click(View v) {
        if (p == 0) {
            r = r * 10 + 6;
        }
        else
        {
            float k = 6;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }
    public void b7_Click(View v) {
        if (p == 0) {
            r = r * 10 + 7;
        }
        else
        {
            float k = 7;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void b8_Click(View v) {
        if (p == 0) {
            r = r * 10 + 8;
        }
        else
        {
            float k = 8;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void b9_Click(View v) {
        if (p == 0) {
            r = r * 10 + 9;
        }
        else
        {
            float k = 9;
            for (int i = 0; i < p; i++)
            {
                k = k / 10;
            }
            r = r + k;
            p = p + 1;
        }
        out.setText(r + "");
    }

    public void bp_Click(View v) {
        if (p == 0) {
            p = 1;
        }
    }

    public void badd_Click(View v){
        if (d == 0) {
            d = 1;
            p = 0;
            r1 = r;
            r = 0;
            out.setText(0 + "");
        }
    }

    public void bsub_Click(View v) {
        if (d == 0) {
            d = 2;
            p = 0;
            r1 = r;
            r = 0;
            out.setText(0 + "");
        }
    }

    public void bmul_Click(View v) {
        if (d == 0) {
            d = 3;
            p = 0;
            r1 = r;
            r = 0;
            out.setText(0 + "");
        }
    }

    public void bdiv_Click(View v) {
        if (d == 0) {
            d = 4;
            p = 0;
            r1 = r;
            r = 0;
            out.setText(0 + "");
        }
    }

    public void bsquare_Click(View v) {
        if (d == 0) {
            d = 5;
            p = 0;
            r1 = r;
            r = 0;
            out.setText(0 + "");
        }
    }

    public void bcinnamon_Click(View v) {
        if (d == 0) {
            d = 6;
            p = 0;
            r1 = r;
            r = 0;
            out.setText(0 + "");
        }
    }

    public void blog_Click(View v) {
        if (d == 0)
        {
            r = Math.log10(r);
            out.setText(r + "");
        }
    }

    public void bplusminus_Click(View v) {
        if (d == 0)
        {
            r = r * -1;
            out.setText(r + "");
        }
    }

    public void bsin_Click(View v){
        if (d == 0)
        {
            r = Math.sin(r);
            out.setText(r + "");
        }
    }

    public void bcos_Click(View v) {
        if (d == 0) {
            r = Math.cos(r);
            out.setText(r + "");
        }
    }

    public void btan_Click(View v) {
        if (d == 0) {
            r = Math.tan(r);
            out.setText(r + "");
        }
    }

    public void berase_Click(View v) {
        d = 0;
        p = 0;
        r = 0;
        r1 = 0;
        out.setText("0");
    }

    public void bexactly_Click(View v) {
        if (d == 1)
        {
            r = r1 + r;
        }
        if (d == 2)
        {
            r = r1 - r;
        }
        if (d == 3)
        {
            r = r1 * r;
        }
        if (d == 4)
        {
            r = r1 / r;
        }
        if (d == 5)
        {
            double h = r;
            double t = Math.pow(r1, h);
            r = t;
        }
        if (d == 6)
        {
            double h = r;
            double t = Math.pow(r1, 1.0 / h);
            r = t;

        }
        d = 0;
        out.setText(r + "");
    }
}
