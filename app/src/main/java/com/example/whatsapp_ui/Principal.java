package com.example.whatsapp_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.whatsapp_ui.databinding.ActivityPrincipalBinding;
import com.example.whatsapp_ui.menu.CallsFragment;
import com.example.whatsapp_ui.menu.CameraFragment;
import com.example.whatsapp_ui.menu.ChatsFragment;
import com.example.whatsapp_ui.menu.StatusFragment;

import java.util.ArrayList;
import java.util.List;

public class Principal extends AppCompatActivity {
    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_principal);
        setUpWithViewPager(binding.viewPager);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        setSupportActionBar(binding.toolbar);

        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                changefloatbuttonIcon(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void setUpWithViewPager(ViewPager viewPager){
        Principal.SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ChatsFragment(),"Chats");
        adapter.addFragment(new StatusFragment(),"Estados");
        adapter.addFragment(new CallsFragment(),"Llamadas");
        viewPager.setAdapter(adapter);
    }
    private static class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item)
    {
        int id = item.getItemId();

        switch (id){
            case R.id.menu_search : Toast.makeText(Principal.this, "Busqueda", Toast.LENGTH_SHORT).show();break;
            case R.id.menu_options : Toast.makeText(Principal.this, "Opciones", Toast.LENGTH_SHORT).show();break;
        }

        return super.onOptionsItemSelected(item);

    }

    private void changefloatbuttonIcon(final int index){
        binding.tabFloatButton.hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (index){
                    case 0: binding.tabFloatButton.setImageDrawable(getDrawable(R.drawable.ic_baseline_chat_24));
                        binding.tabFloatButton.getDrawable().setTint(1);break;

                    case 1: binding.tabFloatButton.setImageDrawable(getDrawable(R.drawable.ic_baseline_camera));
                        binding.tabFloatButton.getDrawable().setTint(1);break;
                    case 2: binding.tabFloatButton.setImageDrawable(getDrawable(R.drawable.ic_baseline_call));
                        binding.tabFloatButton.getDrawable().setTint(1);break;
                }
                binding.tabFloatButton.show();
            }
        },400);

    }
}