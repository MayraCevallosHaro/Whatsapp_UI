package com.example.whatsapp_ui.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp_ui.R;
import com.example.whatsapp_ui.adapter.Adaptercalllist;
import com.example.whatsapp_ui.model.CallList;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class CallsFragment extends Fragment {



    public CallsFragment() {
        // Required empty public constructor
    }

    /**

     */
    // TODO: Rename and change types and number of parameters


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewcall);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<CallList> lists = new ArrayList<>();
        lists.add(new CallList("1","Jose","17/01/2021 22:30","https://lamenteesmaravillosa.com/wp-content/uploads/2018/09/hombre-creido-pensando-que-sabe.jpg","voice","in","accepted"));
        lists.add(new CallList("5","Daniel Perez","10/01/2021 18:40","https://laboratoriosniam.com/wp-content/uploads/2018/07/michael-dam-258165-unsplash_WEB2.jpg","voice","in","declined"));
        lists.add(new CallList("3","Sofia ","15/01/2021 12:20","https://img.bekiapsicologia.com/articulos/portada/78000/78631.jpg","video","out","accepted"));
        lists.add(new CallList("5","Miguel","01/01/2021 18:40","https://cdn.bioguia.com/embed/4b9dbf07167aa3d45a999ed7b090e61557239246/cosas-personas-felices-hacen-diferente.jpg?imagick=1&size=1250","voice","in","declined"));
        lists.add(new CallList("3","Nicolas","01/01/2021 13:20","https://cdn.bioguia.com/embed/ba7b42bfa2b99722f6080f8f6e70be4a391556221419/shutterstock_570119506.jpg?imagick=1&size=750","video","out","accepted"));


        recyclerView.setAdapter(new Adaptercalllist(lists,getContext()));
        return view;
    }
}