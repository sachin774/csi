package com.sachin.csi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class HomeActivity extends AppCompatActivity {

    private ActionBar toolbar;
    private HomeFragment homeFragment;
    private  EventFragment eventFragment;
    private  MemberFragment memberFragment;
    private  ContactFragment contactFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initCreate();
        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView)findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        toolbar.setTitle("Home");
        setFragment(homeFragment);
    }

    private void setFragment(HomeFragment homeFragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,homeFragment);
        fragmentTransaction.commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    toolbar.setTitle("Home");
                    setFragment(homeFragment);
                    return true;
                case R.id.navigation_event:
//                    toolbar.setTitle("Events");
                    setFragment(eventFragment);
                    return true;
                case R.id.navigation_member:

//                    toolbar.setTitle("Member");
                    setFragment(memberFragment);
                    return true;
                case R.id.navigation_contact:
//                    toolbar.setTitle("Contact");
                    setFragment(contactFragment);
                    return true;
            }
            return false;
        }

        private void setFragment(Fragment fragment) {
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment);
            fragmentTransaction.commit();

        }
    };
    public void initCreate()
    {
        homeFragment=new HomeFragment();
        eventFragment=new EventFragment();
        contactFragment=new ContactFragment();
        memberFragment=new MemberFragment();
    }
}
