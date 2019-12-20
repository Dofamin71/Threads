package com.company;

public class User extends Thread{
    private int consumption;
    boolean flag = true;
    User(int c, String name) {
        this.consumption = c;
        this.setName(name);
    }
    @Override
    public void run() {
        while (flag) {
            try {
                if (Main.test(consumption, getName())) {
                    flag = false;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
