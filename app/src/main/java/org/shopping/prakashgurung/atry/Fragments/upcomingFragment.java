package org.shopping.prakashgurung.atry.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shopping.prakashgurung.atry.R;

import org.shopping.prakashgurung.atry.Recycler.Album;
import org.shopping.prakashgurung.atry.Recycler.MyRecyclerAdapter;

import java.util.ArrayList;



public class upcomingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.upcoming_fragment,null);


        RecyclerView rv = (RecyclerView) v.findViewById(R.id.mUpcoming);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getUpComingAlbum()));
        return v;
    }

    private ArrayList<Album> getUpComingAlbum() {
        // Collection of featured
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Flair \n Price: $7", R.drawable.g1);
        albums.add(album);

        album = new Album("Red Lehenga \n Price: $8",R.drawable.g2);
        albums.add(album);


        album = new Album("Red Lehenga \n Price: $9",R.drawable.bb2);
        albums.add(album);


        return albums;



    }


    //Set title For the fragment

    public String toString(){
        return "Bientot";
    }


}
