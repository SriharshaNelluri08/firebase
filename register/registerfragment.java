package com.example.register;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class registerfragment extends Fragment {
    Button gotoinfo;
    EditText rname,rregno,rphone,rdob,remail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_registerfragment, container, false);


        gotoinfo = view.findViewById(R.id.registerbutton);
        rname = view.findViewById(R.id.registerfullname);
        rregno = view.findViewById(R.id.registerregno);
        rphone = view.findViewById(R.id.registerphonenumber);
        rdob = view.findViewById(R.id.registerdob);
        remail = view.findViewById(R.id.registeremail);


        gotoinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vname,vregno,vphone,vdob,vemail="";
                vname = rname.getText().toString();
                vregno = rregno.getText().toString();
                vphone = rphone.getText().toString();
                vdob = rdob.getText().toString();
                vemail = remail.getText().toString();




                Fragment fragment = new information();

                Bundle bundle = new Bundle();

                bundle.putString("bname",vname);
                bundle.putString("bregno",vregno);
                bundle.putString("bphone",vphone);
                bundle.putString("bdob",vdob);
                bundle.putString("bemail",vemail);

                fragment.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainpage,fragment).commit();
            }
        });
        return view;
    }

}