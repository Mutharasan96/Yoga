package com.example.yoga;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MenuListFragment extends Fragment {
    View view;
    ListView listView;
    String[] menulist;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_menu_list, container, false);
        listView = view.findViewById(R.id.frag_main_list);
        menulist=getResources().getStringArray(R.array.menu_list);
        MainmenuArrayadapter adapter = new MainmenuArrayadapter(getActivity(),menulist);
        listView.setAdapter(adapter);
        return view;
    }
}
