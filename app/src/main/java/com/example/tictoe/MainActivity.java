package com.example.tictoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnRestart;
    String name1, name2;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0, count = 0;
    ImageView imageView;
    EditText player1, player2;
    TextView text1, text2, winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });

    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn6 = findViewById(R.id.btn6);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        imageView = findViewById(R.id.imageView);
        btnRestart = findViewById(R.id.btnRestart);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        winner = findViewById(R.id.winner);
    }
    public void restart() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
        btn1.setBackgroundColor(getResources().getColor(R.color.laal));
        btn2.setBackgroundColor(getResources().getColor(R.color.laal));
        btn3.setBackgroundColor(getResources().getColor(R.color.laal));
        btn4.setBackgroundColor(getResources().getColor(R.color.white));
        btn5.setBackgroundColor(getResources().getColor(R.color.purple_700));
        btn6.setBackgroundColor(getResources().getColor(R.color.white));
        btn7.setBackgroundColor(getResources().getColor(R.color.green));
        btn8.setBackgroundColor(getResources().getColor(R.color.green));
        btn9.setBackgroundColor(getResources().getColor(R.color.green));
        imageView.setImageResource(R.drawable.logo);
        winner.setText(getString(R.string.winner));
        text1.setText("");
        text2.setText("");

    }

    public void check(View view) {
        Button getBtn = (Button) view;
        name1 = player1.getText().toString();
        name2 = player2.getText().toString();
        if ((!name1.isEmpty() && !name2.isEmpty())) {
            if (getBtn.getText().toString().equals("")) {
                count++;
                if (flag == 0) {
                    getBtn.setText(name1);
                    getBtn.setBackgroundColor(getResources().getColor(R.color.laal));
                    flag = 1;
                } else {
                    getBtn.setText(name2);
                    getBtn.setBackgroundColor(getResources().getColor(R.color.teal_200));
                    flag = 0;
                }
                if (count > 4) {
                    b1 = btn1.getText().toString();
                    b2 = btn2.getText().toString();
                    b3 = btn3.getText().toString();
                    b4 = btn4.getText().toString();
                    b5 = btn5.getText().toString();
                    b6 = btn6.getText().toString();
                    b7 = btn7.getText().toString();
                    b8 = btn8.getText().toString();
                    b9 = btn9.getText().toString();
                    if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                        Toast.makeText(this, "winner is:-" + name1, Toast.LENGTH_SHORT).show();
                        restart();
                        text1.setText(name1);
                        winner.setTextSize(20);
                        imageView.setImageResource(R.drawable.winnernew);
                        winner.setText(name1);

                    } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                        Toast.makeText(this, "winner is:-" + name2, Toast.LENGTH_SHORT).show();
                        restart();
                        text2.setText(name2);
                        winner.setText(name2);
                        winner.setTextSize(20);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        imageView.setImageResource(R.drawable.winnernew);
                    } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                        Toast.makeText(this, "winner is:-" + name1, Toast.LENGTH_SHORT).show();
                        restart();
                        text1.setText(name1);
                        winner.setText(name1);
                        winner.setTextSize(20);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        imageView.setImageResource(R.drawable.winnernew);
                    } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                        Toast.makeText(this, "winner is:-" + name1, Toast.LENGTH_SHORT).show();
                        restart();
                        text1.setText(name1);
                        winner.setText(name1);
                        winner.setTextSize(20);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        imageView.setImageResource(R.drawable.winnernew);
                    } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                        Toast.makeText(this, "winner is:-" + name1, Toast.LENGTH_SHORT).show();
                        restart();
                        text1.setText(name1);
                        winner.setText(name1);
                        winner.setTextSize(20);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        imageView.setImageResource(R.drawable.winnernew);
                    } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                        Toast.makeText(this, "winner is:-" + name2, Toast.LENGTH_SHORT).show();
                        restart();
                        text2.setText(name2);
                        winner.setText(name2);
                        winner.setTextSize(20);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        imageView.setImageResource(R.drawable.winnernew);
                    } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                        Toast.makeText(this, "winner is:- " + name1, Toast.LENGTH_SHORT).show();
                        restart();
                        text1.setText(name1);
                        winner.setText(name1);
                        winner.setTextSize(20);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        imageView.setImageResource(R.drawable.winnernew);
                    } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                        Toast.makeText(this, "winner is :- " + name2, Toast.LENGTH_SHORT).show();
                        restart();
                        text2.setText(name2);
                        winner.setText(name2);
                        winner.setTextSize(20);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        imageView.setImageResource(R.drawable.winnernew);
                    } else if (count == 9) {
                        Toast.makeText(this, "Game is Drawn", Toast.LENGTH_SHORT).show();
                        restart();
                        imageView.setImageResource(R.drawable.drawn);
                        winner.setTextColor(getResources().getColor(R.color.laal));
                        winner.setTextSize(20);
                        winner.setText("You both are amazing !!");
                    }
                }
            }
        } else {
            player1.setError("Error");

            player2.setError("Error");

            Toast.makeText(this, "Please ! Enter player Name", Toast.LENGTH_SHORT).show();
        }
    }
}