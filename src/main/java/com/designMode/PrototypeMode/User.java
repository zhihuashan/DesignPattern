package com.designMode.PrototypeMode;

import java.util.ArrayList;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:22
 * @Version 1.0
 */

public class User implements Cloneable{
    private  String name;
    private  String password;
    private ArrayList<String> phones;

    protected  User clone(){
        try{
            User user = (User) super.clone();
            //如果要连带引用类型一起复制，需要添加底下一条代码，如果不加就对于是复制了引用地址
            //默认引用类型为浅复制，这是设置了深复制
            user.phones = (ArrayList<String>) this.phones.clone();
            return user;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User(String name, String password, ArrayList<String> phones) {
        this.name = name;
        this.password = password;
        this.phones = phones;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phones=" + phones +
                '}';
    }
}
