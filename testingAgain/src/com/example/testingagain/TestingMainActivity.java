package com.example.testingagain;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestingMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public TestingMainActivity() {
		// TODO Auto-generated constructor stub
	}
}
