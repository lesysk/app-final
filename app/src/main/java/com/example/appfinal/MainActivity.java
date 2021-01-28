import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView resultTextView;
    private Button simulateButton;
    private static int stage;

    private static final int RED = Color.RED;
    private static final int YELLOW = Color.YELLOW;
    private static final int GREEN = Color.GREEN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        simulateButton = (Button) findViewById(R.id.simulateButton);
// initially set button color to red
        stage = 1;
        resultTextView.setText(&quot;STOP&quot;);
        resultTextView.setTextColor(RED);
        stage++;
        simulateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stage == 1)
                {
                    resultTextView.setText(&quot;STOP&quot;);
                    resultTextView.setTextColor(RED);
                    stage++;
                }
                else if(stage == 2)
                {
                    resultTextView.setText(&quot;GO&quot;);
                    resultTextView.setTextColor(GREEN);
                    stage++;

                }
                else if(stage == 3)
                {
                    resultTextView.setText(&quot;WAIT&quot;);
                    resultTextView.setTextColor(YELLOW);
                    stage = 1;
                }
            }
        });
    }