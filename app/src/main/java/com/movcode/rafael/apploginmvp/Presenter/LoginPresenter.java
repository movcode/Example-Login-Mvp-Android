package com.movcode.rafael.apploginmvp.Presenter;

import com.movcode.rafael.apploginmvp.Model.LoginModel;
import com.movcode.rafael.apploginmvp.mvp.MvpLogin;

/**
 * Created by rafael on 28/12/2017.
 */

public class LoginPresenter implements MvpLogin.Presenter {

    private MvpLogin.View view;
    private LoginModel login;


    public LoginPresenter(MvpLogin.View view) {
        this.view = view;

        this.login = new LoginModel();
        this.login.setLogin("admin");
        this.login.setSenha("321");
    }

    @Override
    public void Auth(String user, String password) {
        if (this.login.getLogin().equals(user) && this.login.getSenha().equals(password)){
            view.Autenticado();
        }else{
            view.LoginError("Preencha todos os campos!");
        }
    }
}
