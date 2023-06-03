package com.example.un_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        EditText tb=findViewById(R.id.tb6);
        TextView tv=findViewById(R.id.ans6);
        Button bt=findViewById(R.id.anbt6);
        Spinner sp11=findViewById(R.id.arsp11);
        Spinner sp12=findViewById(R.id.arsp12);

        String[] ls={"bit","bt","kb","mb","gb","tb"};
        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,ls);
        ad1.setDropDownViewResource(android.R.layout.simple_list_item_1);

        sp11.setAdapter(ad1);
        sp12.setAdapter(ad1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (tb.getText().toString().isEmpty())
                {
                    Toast.makeText(data.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();
                }
                else if (!tb.getText().toString().isEmpty())
                {
                    double a = Integer.parseInt(tb.getText().toString());
                    double b;
                    if (sp11.getSelectedItem().toString() == "bit" && sp12.getSelectedItem().toString() == "bit") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp11.getSelectedItem().toString() == "bit" && sp12.getSelectedItem().toString() == "bt") {
                        b = a * 0.125;
                        tv.setText(String.valueOf(b));
                    } else if (sp11.getSelectedItem().toString() == "bit" && sp12.getSelectedItem().toString() == "kb") {
                        b = a * 0.000122;
                        tv.setText(String.valueOf(b));
                    } else if (sp11.getSelectedItem().toString() == "bit" && sp12.getSelectedItem().toString() == "mb") {
                        b = a * 1.25e-7;
                        tv.setText(String.valueOf(b));
                    } else if (sp11.getSelectedItem().toString() == "bit" && sp12.getSelectedItem().toString() == "gb") {
                        b = a * 1.25e-10;
                        tv.setText(String.valueOf(b));
                    } else if (sp11.getSelectedItem().toString() == "bit" && sp12.getSelectedItem().toString() == "tb") {
                        b = a * 1.25e-13;
                        tv.setText(String.valueOf(b));
                    }


//                ************************************************************


                if (sp11.getSelectedItem().toString() == "bt" && sp12.getSelectedItem().toString() == "bit") {
                    b = a * 8;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "bt" && sp12.getSelectedItem().toString() == "bt") {
                    b = a * 1;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "bt" && sp12.getSelectedItem().toString() == "kb") {
                    b = a * 0.001;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "bt" && sp12.getSelectedItem().toString() == "mb") {
                    b = a * 1e-6;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "bt" && sp12.getSelectedItem().toString() == "gb") {
                    b = a * 1e-9;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "bt" && sp12.getSelectedItem().toString() == "tb") {
                    b = a * 1e-12;
                    tv.setText(String.valueOf(b));
                }

//                **************************************************************

                if (sp11.getSelectedItem().toString() == "kb" && sp12.getSelectedItem().toString() == "bit") {
                    b = a * 8192;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "kb" && sp12.getSelectedItem().toString() == "bt") {
                    b = a * 1024;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "kb" && sp12.getSelectedItem().toString() == "kb") {
                    b = a * 1;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "kb" && sp12.getSelectedItem().toString() == "mb") {
                    b = a * 0.00097;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "kb" && sp12.getSelectedItem().toString() == "gb") {
                    b = a * 0.00000095;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "kb" && sp12.getSelectedItem().toString() == "tb") {
                    b = a * 0.0000000009;
                    tv.setText(String.valueOf(b));
                }

//                **************************************************************

                if (sp11.getSelectedItem().toString() == "mb" && sp12.getSelectedItem().toString() == "bit") {
                    b = a * 8388608;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "mb" && sp12.getSelectedItem().toString() == "bt") {
                    b = a * 1048576;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "mb" && sp12.getSelectedItem().toString() == "kb") {
                    b = a * 1024;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "mb" && sp12.getSelectedItem().toString() == "mb") {
                    b = a * 1;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "mb" && sp12.getSelectedItem().toString() == "gb") {
                    b = a * 0.0009765;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "mb" && sp12.getSelectedItem().toString() == "tb") {
                    b = a * 0.0000009537;
                    tv.setText(String.valueOf(b));
                }

//                *******************************************************************

                if (sp11.getSelectedItem().toString() == "gb" && sp12.getSelectedItem().toString() == "bit") {
                    b = a * 8e+9;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "gb" && sp12.getSelectedItem().toString() == "bt") {
                    b = a * 1e+9;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "gb" && sp12.getSelectedItem().toString() == "kb") {
                    b = a * 1048576;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "gb" && sp12.getSelectedItem().toString() == "mb") {
                    b = a * 1024;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "gb" && sp12.getSelectedItem().toString() == "gb") {
                    b = a * 1;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "gb" && sp12.getSelectedItem().toString() == "tb") {
                    b = a * 0.0009765;
                    tv.setText(String.valueOf(b));
                }
//                *******************************************************************

                if (sp11.getSelectedItem().toString() == "tb" && sp12.getSelectedItem().toString() == "bit") {
                    b = a * 8e+12;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "tb" && sp12.getSelectedItem().toString() == "bt") {
                    b = a * 1e+12;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "tb" && sp12.getSelectedItem().toString() == "kb") {
                    b = a * 1e+9;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "tb" && sp12.getSelectedItem().toString() == "mb") {
                    b = a * 1e+6;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "tb" && sp12.getSelectedItem().toString() == "gb") {
                    b = a * 1024;
                    tv.setText(String.valueOf(b));
                } else if (sp11.getSelectedItem().toString() == "tb" && sp12.getSelectedItem().toString() == "tb") {
                    b = a * 1;
                    tv.setText(String.valueOf(b));
                }

            }

            }
        });
    }
}