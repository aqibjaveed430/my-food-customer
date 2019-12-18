package e.homekitchen.customer.Stats;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {
SharedPreferences prefs;
SharedPreferences.Editor editor;
final String userDetail = "user_detail";
final String logedIn = "Logedin";

public MySharedPreferences(Context context){
prefs =context.getSharedPreferences("",context.MODE_PRIVATE);
editor =prefs.edit();

}
public void setLogedIn(String status){
 editor.putString(logedIn, status);
editor.commit();
}

}
