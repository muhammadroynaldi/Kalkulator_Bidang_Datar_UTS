package com.roynaldi.kalkulator_bidang_datar_;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Persegi extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_persegi, container, false);

        //ambil inputan user
        final EditText panjang = (EditText) view.findViewById(R.id.inputPanjang);
        final EditText lebar = (EditText) view.findViewById(R.id.inputLebar);
        final Button hitung = (Button) view.findViewById(R.id.hitung);
        final TextView hasil = (TextView) view.findViewById(R.id.txtHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //inisiasi variabel dan parsing ke double/
                String panjang1 = panjang.getText().toString();
                String lebar1 = lebar.getText().toString();

                //cek jika inputan 0
                if(panjang1.isEmpty()){
                    panjang.setError("Input tidak boleh kosong");
                    panjang.requestFocus();
                }
                else if(lebar1.isEmpty()){
                    lebar.setError("Input tdak boleh kosong");
                    lebar.requestFocus();
                }
                else {
                    //parsing ke double
                    Double panjang2 = Double.parseDouble(panjang1);
                    Double lebar2 = Double.parseDouble(lebar1);

                    //algortima hitung
                    Double luas = panjang2 * lebar2;
                    Double keliling = 2 * panjang2 + 2 * lebar2;
                    hasil.setText("LUAS = " + luas + "\n\n\nKELILING = " + keliling);
                }

            }
        });
        return view;
    }
}