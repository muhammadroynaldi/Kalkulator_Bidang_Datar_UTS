package com.roynaldi.kalkulator_bidang_datar_;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Lingkaran extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lingkaran, container, false);

        //ambil inputan user
        final EditText jari = (EditText) view.findViewById(R.id.inputJari);
        final Button hitung = (Button) view.findViewById(R.id.hitung);
        final TextView hasil = (TextView) view.findViewById(R.id.txtHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //inisiasi variabel dan parsing ke double/
                String jari1 = jari.getText().toString();

                //cek jika inputan 0
                if(jari1.isEmpty()){
                    jari.setError("Input tdak boleh kosong");
                    jari.requestFocus();
                }
                else {
                    //parsing ke double
                    Double jari2 = Double.parseDouble(jari1);

                    //algortima hitung
                    Double luas = Math.PI*jari2*jari2;
                    Double keliling = 2 * Math.PI*jari2;
                    hasil.setText("LUAS = " + luas + "\n\n\nKELILING = " + keliling);
                }

            }
        });

        return view;
    }
}