package com.virtusa.nycschools.util;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by madhu on 6/9/19.
 */

public class NetworkManager {
    private Context context;
    public NetworkManager(Context context) {
        this.context = context;
    }
   // checking the internet connection 
    public boolean isInternetConnectionAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null;
    }
}
