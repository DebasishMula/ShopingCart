package com.world.shopingcart.Views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.world.shopingcart.R;
import com.world.shopingcart.databinding.FragmentShopBinding;


public class ShopFragment extends Fragment {

    FragmentShopBinding fragmentShopBinding;



    public ShopFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentShopBinding=FragmentShopBinding.inflate(inflater,container,false);
        return fragmentShopBinding.getRoot();
    }
}