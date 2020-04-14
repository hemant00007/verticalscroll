package com.example.verticalscrolling;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ChildFragment extends Fragment {

    TextView tvparent,tvchild;

    public ChildFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_child,container,false);

        tvparent=view.findViewById(R.id.tvparent);
        tvchild=view.findViewById(R.id.tvchild);
        Bundle bundle = getArguments();
        tvparent.setText("parent"+bundle.getString("parent"));
        tvchild.setText("child"+bundle.getString("child"));
        return view;
    }
}
