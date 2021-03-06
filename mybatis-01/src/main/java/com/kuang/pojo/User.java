package com.kuang.pojo;

/**
 * @author shkstart
 * @create 2021-03-22 19:34
 */

//实体类
public class User {
    private int id;
    private  String name;
    private  String pwd;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public User(int id, String name, String pwd) {

        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
