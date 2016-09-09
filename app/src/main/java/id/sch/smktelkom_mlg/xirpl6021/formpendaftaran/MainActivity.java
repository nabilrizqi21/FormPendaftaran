package id.sch.smktelkom_mlg.xirpl6021.formpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNam, etEmail;
    Button bOK;
    RadioButton rbLaki, rbPerem;
    Spinner spinKe;
    CheckBox cbFut, cbFO, cbPram, cbVisi;

    TextView tvHasil, tvHasil2, tvHasil3, tvHasil4, tvHasil5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNam = (EditText) findViewById(R.id.editTextNm);
        etEmail = (EditText) findViewById(R.id.editTextEmail);

        cbFut = (CheckBox) findViewById(R.id.checkBoxFut);
        cbFO = (CheckBox) findViewById(R.id.checkBoxFO);
        cbPram = (CheckBox) findViewById(R.id.checkBoxPram);
        cbVisi = (CheckBox) findViewById(R.id.checkBoxVisi);

        spinKe = (Spinner) findViewById(R.id.spinnerKe);

        rbLaki = (RadioButton) findViewById(R.id.radioButtonLK);
        rbPerem = (RadioButton) findViewById(R.id.radioButtonPR);

        bOK = (Button) findViewById(R.id.buttonOK);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvHasil2 = (TextView) findViewById(R.id.textViewHasil2);
        tvHasil3 = (TextView) findViewById(R.id.textViewHasil3);
        tvHasil4 = (TextView) findViewById(R.id.textViewHasil4);
        tvHasil5 = (TextView) findViewById(R.id.textViewHasil5);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
                doProcess();
                String namama = etNam.getText().toString();
                tvHasil4.setText("Nama Anda : " + namama);
                String emailema = etEmail.getText().toString();
                tvHasil5.setText("Email Anda: " + emailema);

            }

            private void doProcess() {

            }

            private void doClick() {
                String hasil = null;
                String hasil3 = "Ekstrakulikuler Anda :\n";

                int startlen = hasil3.length();
                if (cbFut.isChecked()) hasil3 += cbFut.getText() + "\n";
                if (cbFO.isChecked()) hasil3 += cbFO.getText() + "\n";
                if (cbPram.isChecked()) hasil3 += cbPram.getText() + "\n";
                if (cbVisi.isChecked()) hasil3 += cbVisi.getText() + "\n";

                if (hasil3.length() == startlen) hasil3 += "Tidak Ada Pilihan";
                tvHasil3.setText(hasil3);

                if (rbLaki.isChecked()) {
                    hasil = rbLaki.getText().toString();
                } else if (rbPerem.isChecked()) {
                    hasil = rbPerem.getText().toString();
                }
                if (hasil == null) {
                    tvHasil.setText("Belum Memilih Kelamin");
                } else {
                    tvHasil.setText("Kelamin Anda :" + hasil);
                }
                tvHasil2.setText("Kelas : " + spinKe.getSelectedItem().toString());
            }
        });
    }

}
