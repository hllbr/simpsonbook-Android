package com.hllbr.simpsonbook;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Simpson> {

        //hangi activite içerisinde kullanılacak ve hangi layout içinde kullanacaksın bunların sorulduğu bir yapı
        //buradaki resource kısmı simple_list_item_1 yerine geçecek ve simpson objesini göstermemize yarayacak bir yapı sağlayacak

    //Properties

    private ArrayList<Simpson> simpsons;
    private Activity context ;

    public CustomAdapter(ArrayList<Simpson> simpsons,Activity context){
        super(context,R.layout.custom_view,simpsons);
        this.simpsons = simpsons ;
        this.context = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //position = listedeki pozisyonu veriyor her bir sırada hangi viewin ne işi yapcağını yazabildiğim bir aralık sağlıyor.
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View custom_view = layoutInflater.inflate(R.layout.custom_view,null,true);

        TextView nameView = custom_view.findViewById(R.id.customTextView);
        nameView.setText(simpsons.get(position).getName());
        //return super.getView(position, convertView, parent);
        return custom_view;
    }
}
