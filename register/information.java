package com.example.register;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class information extends Fragment {
    Button home;

    TextView fname,fregno,fphone,fdob,femail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view =  inflater.inflate(R.layout.fragment_information, container, false);

        fname = view.findViewById(R.id.iname);
        fregno = view.findViewById(R.id.iregno);
        fphone = view.findViewById(R.id.iphoneno);
        fdob = view.findViewById(R.id.idob);
        femail = view.findViewById(R.id.iemail);

        Bundle bundle = this.getArguments();

        fname.setText(bundle.getString("bname"));
        fregno.setText(bundle.getString("bregno"));
        fphone.setText(bundle.getString("bphone"));
        fdob.setText(bundle.getString("bdob"));
        femail.setText(bundle.getString("bemail"));



        home = view.findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),MainActivity.class);
                startActivity(intent);


            }
        });
        return view;
    }

}