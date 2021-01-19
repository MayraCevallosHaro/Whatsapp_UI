package com.example.whatsapp_ui.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp_ui.R;
import com.example.whatsapp_ui.adapter.Adapterchatlist;
import com.example.whatsapp_ui.model.ChatList;

import java.util.ArrayList;
import java.util.List;


public class ChatsFragment extends Fragment {
    public ChatsFragment() {

    }
    private List<ChatList> list = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getChatList();
        return view;
    }

    private void getChatList() {
        list.clear();
        list.add(new ChatList("1","Diego Capurro","Hola que haces","18/01/2021","https://d3t4nwcgmfrp9x.cloudfront.net/upload/secretos-de-personas-que-permanecen-positivas-en-las-peores-circunstancias-643x342.jpg"));
        list.add(new ChatList("2","Paola Morales","Que Hubo q tal .. ","18/01/2021","https://www.menteasombrosa.com/wp-content/uploads/2018/12/persona-feliz-frases-que-nunca-dicen.jpg"));
        list.add(new ChatList("3","Jose Cordero","Holis... XD","19/01/2021","https://www.lotoland.com/cms/5cd4118beadd2f000cbe0a92/que-hace-a-las-personas-felices-sin-que-sean-millonarios-2.png"));
        list.add(new ChatList("4","Luis Anchundia","Que onda con la U?","20/01/2021","https://tsastre.com/wp-content/uploads/2020/01/Captura-de-pantalla-2020-01-31-a-las-13.14.10.png"));
        list.add(new ChatList("5","Mother","Vamos donde a salir","20/01/2021","https://psicocode.com/wp-content/uploads/2016/07/personas-felices.jpg"));
        list.add(new ChatList("7","Ingrido","Que hay?","21/01/2021","https://www.emprendiendohistorias.com/wp-content/uploads/2019/06/que-hacen-las-personas-felices.jpg"));
        list.add(new ChatList("8","Alejandro","Si vienen hoy?","21/01/2021","https://media.metrolatam.com/2020/02/07/12ewdedf-231737cbac56236cc573e556fd8e1eae-1200x800.jpg"));
        list.add(new ChatList("9","Xiomara","Dijo q no","21/01/2021","https://escuelapararicos.net/wp-content/uploads/2014/05/EPR_140531-10-riesgos-que-las-personas-felices-toman-todos-los-dias.jpg"));
        list.add(new ChatList("10","Eduardo","sii","21/01/2021","https://static.vix.com/es/sites/default/files/styles/large/public/btg/cambiar2.jpg"));


        recyclerView.setAdapter(new Adapterchatlist(list,getContext()));
    }
}