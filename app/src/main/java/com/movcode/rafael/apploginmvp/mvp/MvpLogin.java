package com.movcode.rafael.apploginmvp.mvp;

/**
 * Created by rafael on 28/12/2017.
 */

public interface MvpLogin {

    interface View{
        void LoginError(String error);
        void Autenticado();
    }


    interface Presenter{
        void Auth(String user, String password);
    }
}
