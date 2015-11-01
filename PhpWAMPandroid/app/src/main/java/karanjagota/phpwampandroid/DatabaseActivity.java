package karanjagota.phpwampandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DatabaseActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);


        Button button1 = (Button) findViewById(R.id.button2);


        Button button2 = (Button) findViewById(R.id.button3);


        Button button3 = (Button) findViewById(R.id.button4);



        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {


                Intent i = new Intent(getBaseContext(),insert.class);
                startActivity(i);
            }
        });




        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {


                Intent i = new Intent(getBaseContext(),select.class);
                startActivity(i);
            }
        });




        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {


                Intent i = new Intent(getBaseContext(),update.class);
                startActivity(i);
            }
        });


        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {


                Intent i = new Intent(getBaseContext(),delete.class);
                startActivity(i);
            }
        });



    }
}
