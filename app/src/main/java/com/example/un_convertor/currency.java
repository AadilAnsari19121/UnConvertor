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

public class currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        EditText tb=findViewById(R.id.tb2);
        TextView tv=findViewById(R.id.ans2);
        Button bt=findViewById(R.id.anbt2);
        Spinner sp3=findViewById(R.id.arsp3);
        Spinner sp4=findViewById(R.id.arsp4);

        String[] ls={"usd","euro","yen","dinar","rs","taka","riyal"};
        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,ls);
        ad1.setDropDownViewResource(android.R.layout.simple_list_item_1);

        sp3.setAdapter(ad1);
        sp4.setAdapter(ad1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tb.getText().toString().isEmpty())
                {
                    Toast.makeText(currency.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();
                }
                else if (!tb.getText().toString().isEmpty()) {
                    double a = Integer.parseInt(tb.getText().toString());
                    double b;

                    if (sp3.getSelectedItem().toString() == "usd" && sp4.getSelectedItem().toString() == "usd") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "usd" && sp4.getSelectedItem().toString() == "euro") {
                        b = a * 1.03;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "usd" && sp4.getSelectedItem().toString() == "yen") {
                        b = a * 148.78;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "usd" && sp4.getSelectedItem().toString() == "dinar") {
                        b = a * 0.31;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "usd" && sp4.getSelectedItem().toString() == "rs") {
                        b = a * 82.42;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "usd" && sp4.getSelectedItem().toString() == "taka") {
                        b = a * 102.15;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "uds" && sp4.getSelectedItem().toString() == "riyal") {
                        b = a * 3.76;
                        tv.setText(String.valueOf(b));
                    }

//                *********************************************************************************

                    else if (sp3.getSelectedItem().toString() == "euro" && sp4.getSelectedItem().toString() == "usd") {
                        b = a * 0.97;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "euro" && sp4.getSelectedItem().toString() == "euro") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "euro" && sp4.getSelectedItem().toString() == "yen") {
                        b = a * 144.64;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "euro" && sp4.getSelectedItem().toString() == "dinar") {
                        b = a * 0.30;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "euro" && sp4.getSelectedItem().toString() == "rs") {
                        b = a * 80.14;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "euro" && sp4.getSelectedItem().toString() == "taka") {
                        b = a * 99.30;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "euro" && sp4.getSelectedItem().toString() == "riyal") {
                        b = a * 3.65;
                        tv.setText(String.valueOf(b));
                    }

//                ******************************************************************


                    else if (sp3.getSelectedItem().toString() == "yen" && sp4.getSelectedItem().toString() == "usd") {
                        b = a * 0.0067;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "yen" && sp4.getSelectedItem().toString() == "euro") {
                        b = a * 0.0069;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "yen" && sp4.getSelectedItem().toString() == "yen") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "yen" && sp4.getSelectedItem().toString() == "dinar") {
                        b = a * 0.0021;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "yen" && sp4.getSelectedItem().toString() == "rs") {
                        b = a * 0.55;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "yen" && sp4.getSelectedItem().toString() == "taka") {
                        b = a * 0.69;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "yen" && sp4.getSelectedItem().toString() == "riyal") {
                        b = a * 0.025;
                        tv.setText(String.valueOf(b));
                    }


//                *******************************************************************************


                    else if (sp3.getSelectedItem().toString() == "dinar" && sp4.getSelectedItem().toString() == "usd") {
                        b = a * 3.22;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "dinar" && sp4.getSelectedItem().toString() == "euro") {
                        b = a * 3.31;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "dinar" && sp4.getSelectedItem().toString() == "yen") {
                        b = a * 479.10;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "dinar" && sp4.getSelectedItem().toString() == "dinar") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "dinar" && sp4.getSelectedItem().toString() == "rs") {
                        b = a * 265.39;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "dinar" && sp4.getSelectedItem().toString() == "taka") {
                        b = a * 328.92;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "dinar" && sp4.getSelectedItem().toString() == "riyal") {
                        b = a * 12.10;
                        tv.setText(String.valueOf(b));
                    }


//                *******************************************************************************


                    else if (sp3.getSelectedItem().toString() == "rs" && sp4.getSelectedItem().toString() == "usd") {
                        b = a * 0.012;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "rs" && sp4.getSelectedItem().toString() == "euro") {
                        b = a * 0.012;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "rs" && sp4.getSelectedItem().toString() == "yen") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "rs" && sp4.getSelectedItem().toString() == "dinar") {
                        b = a * 0.0038;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "rs" && sp4.getSelectedItem().toString() == "rs") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "rs" && sp4.getSelectedItem().toString() == "taka") {
                        b = a * 1.24;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "rs" && sp4.getSelectedItem().toString() == "riyal") {
                        b = a * 0.046;
                        tv.setText(String.valueOf(b));
                    }

//                **************************************************************************


                    else if (sp3.getSelectedItem().toString() == "taka" && sp4.getSelectedItem().toString() == "usd") {
                        b = a * 0.0098;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "taka" && sp4.getSelectedItem().toString() == "euro") {
                        b = a * 0.010;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "taka" && sp4.getSelectedItem().toString() == "yen") {
                        b = a * 1.46;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "taka" && sp4.getSelectedItem().toString() == "dinar") {
                        b = a * 0.0030;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "taka" && sp4.getSelectedItem().toString() == "rs") {
                        b = a * 0.81;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "taka" && sp4.getSelectedItem().toString() == "taka") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "taka" && sp4.getSelectedItem().toString() == "riyal") {
                        b = a * 0.037;
                        tv.setText(String.valueOf(b));
                    }


//                ************************************************************************


                    else if (sp3.getSelectedItem().toString() == "riyal" && sp4.getSelectedItem().toString() == "usd") {
                        b = a * 0.27;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "riyal" && sp4.getSelectedItem().toString() == "euro") {
                        b = a * 0.27;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "riyal" && sp4.getSelectedItem().toString() == "yen") {
                        b = a * 39.60;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "riyal" && sp4.getSelectedItem().toString() == "dinar") {
                        b = a * 0.083;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "riyal" && sp4.getSelectedItem().toString() == "rs") {
                        b = a * 21.94;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "riyal" && sp4.getSelectedItem().toString() == "taka") {
                        b = a * 27.19;
                        tv.setText(String.valueOf(b));
                    } else if (sp3.getSelectedItem().toString() == "riyal" && sp4.getSelectedItem().toString() == "riyal") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else {
                        Toast.makeText(currency.this, "Something Was Wrong", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });
    }
}