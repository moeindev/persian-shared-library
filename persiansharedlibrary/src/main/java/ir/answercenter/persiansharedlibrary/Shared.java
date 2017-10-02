package ir.answercenter.persiansharedlibrary;

import android.content.Context;
import android.util.Log;

/**
 * Created by moein on 9/20/17.
 */

public class Shared {

    Context context;
    String LOG_TAG = "persian shared library";
    String SH_LIB = "shared";

    public Shared(Context c){
        this.context = c;
    }

    public void putString(String Tag ,String Value){
        context.getSharedPreferences(SH_LIB,Context.MODE_APPEND).edit().putString(Tag,Value).apply();
        Log.e(LOG_TAG,"String inserted : "+Value);
    }

    public String getString(String Tag,String DefaultValue){
        String j =context.getSharedPreferences(SH_LIB,Context.MODE_APPEND).getString(Tag,DefaultValue);
        Log.e(LOG_TAG,"String Loaded :"+j);
        return j;
    }

    public void putBoolean(String Tag , boolean Value){
        context.getSharedPreferences(SH_LIB,Context.MODE_PRIVATE).edit().putBoolean(Tag,Value).apply();
        Log.e(LOG_TAG,"Boolean inserted :"+Tag+" = "+String.valueOf(Value));
    }

    public boolean getBoolean(String Tag,boolean DefaultValue){
        boolean d = context.getSharedPreferences(SH_LIB,Context.MODE_PRIVATE).getBoolean(Tag,DefaultValue);
        return  d;
    }
}
