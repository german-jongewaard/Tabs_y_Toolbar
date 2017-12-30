package dev.com.jongewaard.tabs_y_toolbar.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import dev.com.jongewaard.tabs_y_toolbar.adapters.ViewPagerAdapter;
import dev.com.jongewaard.tabs_y_toolbar.fragments.PersonListFragment;
import dev.com.jongewaard.tabs_y_toolbar.interfaces.OnPersonCreated;
import dev.com.jongewaard.tabs_y_toolbar.models.Person;
import dev.com.jongewaard.tabs_y_toolbar.R;
/**
 * Created by german on 30-12-17.
 */
public class MainActivity extends AppCompatActivity implements OnPersonCreated {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    // Índice de posición de los fragments
    public static final int PERSON_FORM_FRAGMENT = 0;
    public static final int PERSON_LIST_FRAGMENT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        setTabLayout();
        setViewPager();
        setListenerTabLayout(viewPager);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setTabLayout() {
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Form"));
        tabLayout.addTab(tabLayout.newTab().setText("List"));
    }

    private void setViewPager() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), this, tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void setListenerTabLayout(final ViewPager viewPager) {
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }

    @Override
    public void createPerson(Person person) {
        // Obtenemos el fragment deseado, ListFragment, a través de
        // getSupportFragmentManager(), y posteriormente pasamos el índice de posición
        // de dicho fragment
        PersonListFragment fragment = (PersonListFragment) getSupportFragmentManager().getFragments().get(PERSON_LIST_FRAGMENT);
        // Llamamos al método de nuestro fragment
        fragment.addPerson(person);
        // Movemos el viewpager hacia el ListFragment para ver la persona añadida en el listView
        viewPager.setCurrentItem(PERSON_LIST_FRAGMENT);
    }
}
