package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    TextView txtResult;
    TextView txtResult2;
    Button btnJogar;

    int placarPlayer1 = 0;
    int placarPlayer2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        btnJogar = findViewById(R.id.btnJogar);
        txtResult = findViewById(R.id.txtResult);
        txtResult2 = findViewById(R.id.txtResult2);



        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                int player1 = (int) (3 * Math.random()) + 1;
                int player2 = (int) (3 * Math.random()) + 1;


                if(player1 == 1  ){
                    img1.setImageResource(R.drawable.papel);

                }else if( player1 == 2  ){
                    img1.setImageResource(R.drawable.pedra);

                }else if( player1 == 3 ){
                    img1.setImageResource(R.drawable.tesoura);

                }

                if(player2 == 1  ){
                    img2.setImageResource(R.drawable.papel);

                }else if( player2 == 2  ){
                    img2.setImageResource(R.drawable.pedra);

                }else if( player2 == 3 ){
                    img2.setImageResource(R.drawable.tesoura);

                }

                    if (player1 == 2 && player2 == 1 || player1 == 3 && player2 == 2 || player1 == 1 && player2 == 3) {
                        placarPlayer1++;
                    }
                    txtResult.setText(placarPlayer1 + "");

                    if (player2 == 2 && player1 == 1 || player2 == 3 && player1 == 2 || player2 == 1 && player1 == 3) {
                        placarPlayer2++;
                    }
                    txtResult2.setText(placarPlayer2 + "");


                    if(placarPlayer1 >= 5){
                        txtResult.setText("Ganhou");
                        txtResult2.setText("Perdeu");
                        placarPlayer1 = 0;
                        placarPlayer2 = 0;
                    }

                    if(player2 >= 5){
                        txtResult2.setText("Ganhou");
                        txtResult.setText("Perdeu");
                        placarPlayer2 = 0;
                        placarPlayer1 = 0;
                    }

            }
        });
    }
}