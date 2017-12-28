package com.movcode.rafael.apploginmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.movcode.rafael.apploginmvp.Presenter.LoginPresenter;
import com.movcode.rafael.apploginmvp.mvp.MvpLogin;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main extends AppCompatActivity implements MvpLogin.View{
    @BindView(R.id.editUsuarioo) EditText editUsuario;
    @BindView(R.id.editSenha) EditText editSenha;
    @BindView(R.id.btnLogin) Button btnLogin;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);

        presenter = new LoginPresenter(this);
    }


    @OnClick(R.id.btnLogin)
    public void Login(){
        presenter.Auth(editUsuario.getText().toString(),editSenha.getText().toString());
    }

    @Override
    public void LoginError(String error) {
        Make(error);
    }

    @Override
    public void Autenticado() {
        Make("Logado");
    }


    private void Make(String msg){
        Toast.makeText(Main.this, msg, Toast.LENGTH_SHORT).show();
    }
}
