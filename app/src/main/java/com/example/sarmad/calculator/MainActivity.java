package com.example.sarmad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mtvShow;
    Button mbtAC, mbtPM, mbtPercent, mbtDevide, mbtSeven, mbtEight, mbtNine, mbtMultiply, mbtFour, mbtFive, mbtSix, mbtMinus, mbtOne, mbtTwo, mbtThree, mbtPlus, mbtZero, mbtDot, mbtEqual;
    boolean maddition, mminus, mdevision, mmulti, mpercent;
    String ValueOne, ValueTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intit();


    }

    private void Intit() {

        mtvShow = (TextView) findViewById(R.id.tvShow);
        mbtAC = (Button) findViewById(R.id.btAC);
        mbtPM = (Button) findViewById(R.id.btPM);
        mbtPercent = (Button) findViewById(R.id.btPercent);
        mbtDevide = (Button) findViewById(R.id.btDevide);
        mbtSeven = (Button) findViewById(R.id.btSeven);
        mbtEight = (Button) findViewById(R.id.btEight);
        mbtNine = (Button) findViewById(R.id.btNine);
        mbtMultiply = (Button) findViewById(R.id.btMultiply);
        mbtFour = (Button) findViewById(R.id.btFour);
        mbtFive = (Button) findViewById(R.id.btFive);
        mbtSix = (Button) findViewById(R.id.btSix);
        mbtMinus = (Button) findViewById(R.id.btMinus);
        mbtOne = (Button) findViewById(R.id.btOne);
        mbtTwo = (Button) findViewById(R.id.btTwo);
        mbtThree = (Button) findViewById(R.id.btThree);
        mbtPlus = (Button) findViewById(R.id.btPlus);
        mbtZero = (Button) findViewById(R.id.btZero);
        mbtDot = (Button) findViewById(R.id.btDot);
        mbtEqual = (Button) findViewById(R.id.btEqual);
        mbtPM.setOnClickListener(this);
        mbtPercent.setOnClickListener(this);
        mbtDevide.setOnClickListener(this);
        mbtSeven.setOnClickListener(this);
        mbtEight.setOnClickListener(this);
        mbtNine.setOnClickListener(this);
        mbtMultiply.setOnClickListener(this);
        mbtFour.setOnClickListener(this);
        mbtFive.setOnClickListener(this);
        mbtSix.setOnClickListener(this);
        mbtMinus.setOnClickListener(this);
        mbtOne.setOnClickListener(this);
        mbtTwo.setOnClickListener(this);
        mbtThree.setOnClickListener(this);
        mbtPlus.setOnClickListener(this);
        mbtZero.setOnClickListener(this);
        mbtDot.setOnClickListener(this);
        mbtEqual.setOnClickListener(this);
        mtvShow.setText("");


    }


    @Override
    public void onClick(View view)

    {
        mbtZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "0");
            }
        });


        mbtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "1");
            }
        });

        mbtTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "2");
            }
        });


        mbtThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "3");
            }
        });


        mbtFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "4");
            }
        });


        mbtFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "5");
            }
        });


        mbtSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "6");
            }
        });


        mbtSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "7");
            }
        });


        mbtEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "8");
            }
        });


        mbtNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "9");
            }
        });


        mbtDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = mtvShow.getText().toString();
                mtvShow.setText("");
                mdevision = true;
            }
        });


        mbtMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = mtvShow.getText().toString();
                mtvShow.setText("");
                mmulti = true;
            }
        });


        mbtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = mtvShow.getText().toString();
                mtvShow.setText("");
                maddition = true;

            }
        });


        mbtMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = mtvShow.getText().toString();
                mtvShow.setText("");
                mminus = true;
            }
        });


        mbtDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + ".");
            }
        });


        mbtPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText(mtvShow.getText().toString() + "PM");
            }
        });


        mbtAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtvShow.setText("");
            }
        });


        mbtPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = mtvShow.getText().toString();
                mtvShow.setText("");
                mpercent = true;
            }
        });


        mbtEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueTwo = mtvShow.getText().toString();
                if (maddition) {
                    float Result = Float.parseFloat(ValueOne.toString()) + Float.parseFloat(ValueTwo.toString());
                    mtvShow.setText(Result + "");
                }
                if (mminus) {
                    float Result = Float.parseFloat(ValueOne.toString()) - Float.parseFloat(ValueTwo.toString());
                    mtvShow.setText(Result + "");
                }

                if (mmulti) {
                    float Result = Float.parseFloat(ValueOne.toString()) * Float.parseFloat(ValueTwo.toString());
                    mtvShow.setText(Result + "");
                }

                if (mdevision) {
                    float Result = Float.parseFloat(ValueOne.toString()) / Float.parseFloat(ValueTwo.toString());
                    mtvShow.setText(Result + "");
                }

                if (mpercent) {
                    Float Result = Float.parseFloat(ValueOne.toString()) % Float.parseFloat(ValueTwo.toString());
                    mtvShow.setText(Result + "");
                }


            }
        });


    }


};








