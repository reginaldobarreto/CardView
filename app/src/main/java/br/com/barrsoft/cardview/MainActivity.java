package br.com.barrsoft.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.button2)
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);
    }


    @OnClick(R.id.button1)
    public void setActionButton1(View view){
        Toast.makeText(getApplicationContext(),R.string.botao_1,Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.button2)
    public void setActionButton2(View view){
        Toast.makeText(getApplicationContext(),R.string.botao_1,Toast.LENGTH_LONG).show();
    }


}
