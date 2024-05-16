package com.example.mygroceriesstore.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mygroceriesstore.R;
import com.example.mygroceriesstore.adapters.PopularAdapters;
import com.example.mygroceriesstore.databinding.FragmentHomeBinding;
import com.example.mygroceriesstore.models.PopularModel;

import java.util.List;

public class HomeFragment extends Fragment {


    //popular items
    List<PopularModel> popularModelList;
    PopularAdapters popularAdapters;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_category,container,false);
        return root;
    }

}