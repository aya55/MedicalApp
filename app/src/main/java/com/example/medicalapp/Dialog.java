package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class Dialog extends AppCompatDialogFragment {
    private EditText editTextweight;
    private EditText editTextLength;
    private EditText editTextage;
    private EditText editTextchronicdisease;
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_dialog, null);
        builder.setView(view);
        builder.setTitle("Login");
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent=new Intent(getActivity(),Activity_Main_home.class);
                startActivity(intent);

            }
        });
        editTextweight=view.findViewById(R.id.edit_weight);
        editTextLength=view.findViewById(R.id.edit_Length);
        editTextchronicdisease=view.findViewById(R.id.edit_chronicdisease);
        editTextage=view.findViewById(R.id.edit_age);

        return builder.create();
    }

}