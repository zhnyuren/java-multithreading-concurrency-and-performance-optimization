package com.zhnyuren.practice.multithreading.vault;

public class Vault {

    private int password;

    public static final int MAX_PASSWORD = 9999;

    public Vault(final int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(final int password) {
        this.password = password;
    }

}
