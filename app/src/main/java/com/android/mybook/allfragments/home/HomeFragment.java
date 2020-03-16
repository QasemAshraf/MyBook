package com.android.mybook.allfragments.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.android.mybook.R;
import com.android.mybook.allfragments.home.slider.SliderAdapter;
import com.android.mybook.network.api.APIClient;
import com.android.mybook.network.service.SliderInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment implements BookItemClick {

    private RecyclerView topRecyclerView, bottomRecyclerView;
    private Button btnSeeAllHomeFragment;
    private NavController navController;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        initUI(view);
        return view;
    }
    void initUI(View view){
        topRecyclerView = view.findViewById(R.id.item_home_slider_recyclerView);
        btnSeeAllHomeFragment = view.findViewById(R.id.seeAllButton);
        bottomRecyclerView = view.findViewById(R.id.item_home_books_recyclerView);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        btnSeeAllHomeFragment.setOnClickListener((v -> {navController.navigate(R.id.featured);}));
        getSlider();
    }

    void getSlider(){
        SliderInterface sliderInterface = APIClient.getClient().create(SliderInterface.class);
        sliderInterface.getSlider().enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                if (response.isSuccessful()){
                    List<String> list = response.body();

                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),
                    LinearLayoutManager.HORIZONTAL,false);
                    topRecyclerView.setLayoutManager(linearLayoutManager);
                    SliderAdapter sliderAdapter = new SliderAdapter(list);
                    topRecyclerView.setAdapter(sliderAdapter);
                }else {
                    Toast.makeText(getActivity(),"Fail", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                Toast.makeText(getActivity(), "onFailure" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemClicked(int position) {
        navController.navigate(R.id.featured);

    }
}
