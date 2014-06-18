package com.example.owngalaxy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	Button plus, minus;
	TextView anzeige;
	int zaehler;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		zaehler = 10;  
		plus = (Button) findViewById(R.id.bt_plus);
		minus = (Button) findViewById(R.id.bt_minus);
		anzeige = (TextView) findViewById(R.id.tvAnzeige);
		anzeige.setText("Du hast " + zaehler + " erhalten");
		plus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				zaehler += 1;
				anzeige.setText("Du hast " + zaehler + " erhalten");
			}
		});
		minus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				zaehler -= 1;
				anzeige.setText("Du hast " + zaehler + " erhalten");

			} 
		}); 
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
