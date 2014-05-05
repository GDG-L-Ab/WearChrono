package com.giux.wearun;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver{
	
	public static final String ACTION_START = "com.giux.wearun.ACTION_START";
	public static final String ACTION_LAP = "com.giux.wearun.ACTION_LAP";
	public static final String ACTION_STOP = "com.giux.wearun.ACTION_STOP";

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		String action = intent.getAction();
		
		switch (action) {
		case ACTION_START:
			MainActivity.start();
			break;
			
		case ACTION_LAP:
			MainActivity.lap();
			break;
			
		case ACTION_STOP:
			MainActivity.stop();
			break;

		default:
			break;
		}
		
		
	}

}
