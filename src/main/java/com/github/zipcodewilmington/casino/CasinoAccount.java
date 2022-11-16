package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {
    private String _name;
    private String _password;
    private int _balance;
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public int get_balance() {
        return _balance;
    }

    public void set_balance(int _balance) {
        this._balance = _balance;
    }

    public CasinoAccount(String _name, String _password, int _balance) {
        this._name = _name;
        this._password = _password;
        this._balance = _balance;
    }

    public CasinoAccount(String _name, String _password) {
        this._name = _name;
        this._password = _password;
    }
}
