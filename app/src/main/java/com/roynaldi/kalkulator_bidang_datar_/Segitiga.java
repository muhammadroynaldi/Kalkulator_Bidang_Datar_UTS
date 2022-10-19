package com.roynaldi.kalkulator_bidang_datar_;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segitiga, container, false);

        //ambil inputan user
        final EditText tinggi = (EditText) view.findViewById(R.id.inputJari);
        final EditText alas = (EditText) view.findViewById(R.id.inputAlas);
        final Button hitung = (Button) view.findViewById(R.id.hitung);
        final TextView hasil = (TextView) view.findViewById(R.id.txtHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //inisiasi variabel
                String tinggi1 = tinggi.getText().toString();
                String alas1 = alas.getText().toString();

                //cek jika inputan 0
                if(tinggi1.isEmpty()){
                    tinggi.setError("Input tdak boleh kosong");
                    tinggi.requestFocus();
                }
                else if(alas1.isEmpty()){
                    alas.setError("Input tdak boleh kosong");
                    alas.requestFocus();
                }
                else{
                    //parsing ke double
                    Double tinggi2 = Double.parseDouble(tinggi1);
                    Double alas2 = Double.parseDouble(alas1);

                    //algoritma hitung
                    Double luas = 0.5 * alas2 * tinggi2;
                    Double sisi = Math.sqrt(alas2*alas2 + tinggi2*tinggi2);
                    Double keliling = alas2 + tinggi2 + sisi;
                    hasil.setText("LUAS = " + luas + "\n\n\nKELILING = " + keliling);
                }


            }
        });

        return view;
    }
}