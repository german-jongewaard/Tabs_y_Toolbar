package dev.com.jongewaard.tabs_y_toolbar.fragments;

/**
 * Created by german on 30-12-17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import dev.com.jongewaard.tabs_y_toolbar.adapters.PersonAdapter;
import dev.com.jongewaard.tabs_y_toolbar.models.Person;
import dev.com.jongewaard.tabs_y_toolbar.R;

import java.util.ArrayList;
import java.util.List;

public class PersonListFragment extends Fragment {

    private List<Person> persons;
    private ListView listView;
    private PersonAdapter adapter;

    public PersonListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        persons = new ArrayList<Person>();
        listView = (ListView) view.findViewById(R.id.listViewPerson);
        adapter = new PersonAdapter(getContext(), R.layout.list_view_item_person, persons);
        listView.setAdapter(adapter);

        return view;
    }

    public void addPerson(Person person) {
        this.persons.add(person);
        adapter.notifyDataSetChanged();
    }

}
