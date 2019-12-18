package e.homekitchen.customer.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

import e.homekitchen.customer.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    ImageView iv_menu, iv_open_image;
    LinearLayout drawerMenu;
    RelativeLayout mainLayout, rel_view_image;
    RelativeLayout lay_new_order, lay_pending_order, lay_order_history, lay_my_products, lay_add_products, lay_my_earning,
            lay_my_account, lay_notification, lay_help, lay_logout;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        setView();

    }

    private void setView() {

        int images[] = {R.drawable.img_slide,R.drawable.slide_cheeta,R.drawable.slide_wolf,R.drawable.slide_dog};

        viewFlipper = (ViewFlipper) findViewById(R.id.v_flipper);

        for (int image : images){
            flipperImages(image);
        }
        iv_menu = (ImageView) findViewById(R.id.iv_menu_icon);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        drawerMenu = (LinearLayout) findViewById(R.id.drawer_menu);
      //  mainLayout = (RelativeLayout) findViewById(R.id.main_layout);
        lay_new_order = (RelativeLayout) findViewById(R.id.lay_new_order);
        lay_pending_order = (RelativeLayout) findViewById(R.id.lay_pending_order);
        lay_order_history = (RelativeLayout) findViewById(R.id.lay_order_history);
        lay_my_products = (RelativeLayout) findViewById(R.id.lay_my_products);
        lay_add_products = (RelativeLayout) findViewById(R.id.lay_add_products);
        lay_my_earning = (RelativeLayout) findViewById(R.id.lay_my_earning);
        lay_my_account = (RelativeLayout) findViewById(R.id.lay_my_account);
        lay_notification = (RelativeLayout) findViewById(R.id.lay_notification);
        lay_help = (RelativeLayout) findViewById(R.id.lay_help);
        lay_logout = (RelativeLayout) findViewById(R.id.lay_logout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close
        ) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

            }

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                mainLayout.setTranslationX(slideOffset * drawerView.getWidth());
                mainLayout.setElevation(2f);
                drawerLayout.requestLayout();

            }
        };


        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        iv_menu.setOnClickListener(this);
        lay_new_order.setOnClickListener(this);
        lay_pending_order.setOnClickListener(this);
        lay_order_history.setOnClickListener(this);
        lay_my_products.setOnClickListener(this);
        lay_add_products.setOnClickListener(this);
        lay_my_earning.setOnClickListener(this);
        lay_my_account.setOnClickListener(this);
        lay_notification.setOnClickListener(this);
        lay_help.setOnClickListener(this);
        lay_logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.iv_menu_icon:
                drawerLayout.openDrawer(drawerMenu);
                break;

            case R.id.lay_new_order:
                closeDrawer();
                Intent neworderintent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(neworderintent);
                break;

//            case R.id.lay_pending_order:
//                closeDrawer();
//                Intent pendingorderintent = new Intent(HomeActivity.this, PendingOrderActivity.class);
//                startActivity(pendingorderintent);
//                break;
//
//            case R.id.lay_order_history:
//                closeDrawer();
//                Intent orderhistoryintent = new Intent(HomeActivity.this, OrderHistoryActivity.class);
//                startActivity(orderhistoryintent);
//                break;
//            case R.id.lay_my_products:
//                closeDrawer();
//                Intent myproductsintent = new Intent(HomeActivity.this, MyProductsActivity.class);
//                startActivity(myproductsintent);
//                break;
//
//            case R.id.lay_add_products:
//                closeDrawer();
//                Intent addproductsintent = new Intent(HomeActivity.this, AddProductActivity.class);
//                startActivity(addproductsintent);
//                break;
//            case R.id.lay_my_earning:
//                closeDrawer();
//                Intent myearningintent = new Intent(HomeActivity.this, MyEarningActivity.class);
//                startActivity(myearningintent);
//                break;
//            case R.id.lay_my_account:
//                closeDrawer();
//                Intent myaccountintent = new Intent(HomeActivity.this, MyAccountActivity.class);
//                startActivity(myaccountintent);
//                break;
//            case R.id.lay_notification:
//                closeDrawer();
//                Intent notificationintent = new Intent(HomeActivity.this, NotificationsActivity.class);
//                startActivity(notificationintent);
//                break;
//            case R.id.lay_help:
//                closeDrawer();
//                Intent helpintent = new Intent(HomeActivity.this, HelpActivity.class);
//                startActivity(helpintent);
//                break;
            case R.id.lay_logout:
                closeDrawer();
                Intent logoutintent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(logoutintent);
                break;


        }
    }

    public void closeDrawer() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

   public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
   }
}


