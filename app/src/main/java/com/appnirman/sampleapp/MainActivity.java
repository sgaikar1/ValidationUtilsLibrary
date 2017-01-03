package com.appnirman.sampleapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.appnirman.vaidationutils.ValidationUtils;

public class MainActivity extends AppCompatActivity {

    private EditText tvFname,tvLname,tvEmail,tvPass,tvCPass,tvAge,tvMob,tvAddress,tvPin,tvAny;
    private Button btnSubmit;
    private Context mContext;
    private ValidationUtils validationUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.activity_main);

        tvFname= (EditText)findViewById(R.id.tv_fname);
        tvLname= (EditText)findViewById(R.id.tv_lname);
        tvEmail= (EditText)findViewById(R.id.tv_email);
        tvPass= (EditText)findViewById(R.id.tv_pass);
        tvCPass= (EditText)findViewById(R.id.tv_cpass);
        tvAge= (EditText)findViewById(R.id.tv_age);
        tvMob= (EditText)findViewById(R.id.tv_mobile);
        tvAddress= (EditText)findViewById(R.id.tv_address);
        tvPin= (EditText)findViewById(R.id.tv_pin);
        tvAny= (EditText)findViewById(R.id.tv_any);

        btnSubmit = (Button)findViewById(R.id.btn_submit);

        validationUtils = new ValidationUtils(mContext);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValidData()){
                    Toast.makeText(mContext,"Data validation Successfull",Toast.LENGTH_SHORT).show();
                }
            }
        });


        //TextWatcher

        tvFname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvFname.setError(null);
            }
        });

        tvLname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvLname.setError(null);
            }
        });

        tvPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvPass.setError(null);
            }
        });

        tvCPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvCPass.setError(null);
            }
        });

        tvAge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvAge.setError(null);
            }
        });

        tvMob.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvMob.setError(null);
            }
        });

        tvAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvAddress.setError(null);
            }
        });

        tvPin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvPin.setError(null);
            }
        });

        tvAny.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvAny.setError(null);
            }
        });

        tvEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvEmail.setError(null);
            }
        });
    }


    private boolean isValidData() {

//        if (rgGender.getCheckedRadioButtonId() == -1) {
//            Toast.makeText(mContext, "Select Gender", Toast.LENGTH_SHORT).show();
////            llGenderRg.getChildAt(0).requestFocus();
//            svMain.post(new Runnable() {
//                @Override
//                public void run() {
//                    svMain.scrollTo(0, llGenderRg.getTop());
//                }
//            });
//            return false;
//        }

        if (!validationUtils.isValidFirstName(tvFname.getText().toString())) {
            tvFname.setError("Enter valid first name");
            return false;
        }

        if (!validationUtils.isValidLastName(tvLname.getText().toString())) {
            tvLname.setError("Enter valid Last Name");
            return false;
        }

        if (!validationUtils.isValidEmail(tvEmail.getText().toString())) {
            tvEmail.setError("Enter valid email");
            return false;
        }

        if (!validationUtils.isValidPassword(tvPass.getText().toString())) {
            tvPass.setError("Enter valid password");
            return false;
        }

        if (!validationUtils.isValidConfirmPasswrod(tvCPass.getText().toString(),tvPass.getText().toString())) {
            tvCPass.setError("Password doesnt match");
            return false;
        }

        if (!validationUtils.isValidAge(tvAge.getText().toString())) {
            tvAge.setError("Enter valid age");
            return false;
        }

        if (!validationUtils.isValidMobile(tvMob.getText().toString())) {
            tvMob.setError("Enter valid mobile number");
            return false;
        }

        if (!validationUtils.isValidAddress(tvAddress.getText().toString())) {
            tvAddress.setError("Enter valid address");
            return false;
        }

        if (!validationUtils.isValidPincode(tvPin.getText().toString())) {
            tvPin.setError("Enter valid pincode");
            return false;
        }
        if (!validationUtils.isEmptyEditText(tvAny.getText().toString())) {
            tvAny.setError("Edit text is empty");
            return false;
        }

        return true;
    }
}
