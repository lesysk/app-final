package com.example.appfinal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    int[] colors ={0xFFFF0000,0xFF008000,0xFFFFFF00};//rgb values of {RED,GREEN,YELLOW}
    // setting the message to display on button
    String[] message={"STOP","GO","WAIT"};
    // will count how many times button is pressed (used to maintain cycle)
    int buttonCount=0;
    // components of the app
    View label;
    Button messageButton;
    //declaring function which will be called when button is pressed
    public void ChangeTrafficSignal(View view)
    {
        //adding to button count
        buttonCount+=1;
        buttonCount=buttonCount%3;//so that button count remains under 3 i.e maintain a cycle;
        //changing the color
        label.setBackgroundColor(colors[buttonCount]);
        //changing the message
        messageButton.setText(message[buttonCount]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label=findViewById(R.id.SingalView);
        messageButton=findViewById(R.id.singalButton);
    }
}