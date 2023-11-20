    package com.jsyp.operacionesbas;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.os.VibrationEffect;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        //VARIABLES GLOBALES REPRESETANDO A SUS EQUIVALENTES EN EL FRONT END
        EditText edNum1, edNum2;
        TextView tvResultado;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            /*
            COMUNICANDO LAS VARIABLES DEL BACKEND
            CON LOS OBJETOS LOGICOS EN EL FRONT END
             */

            edNum1=findViewById(R.id.txtNumero1);
            edNum2=findViewById(R.id.txtNumero2);
            tvResultado=findViewById(R.id.lblResultado);
        }

        //METODO DE SUMA

        //(VIEW HACE REFERENCIA A LA VISTA EN EL FRONTEND)
        public void calcularSuma(View v){

            double num1=Double.parseDouble(edNum1.getText().toString());
            int num2=Integer.parseInt(edNum2.getText().toString());
            Double resultado=num1+num2;
            tvResultado.setText(resultado+" ");
        }



    }