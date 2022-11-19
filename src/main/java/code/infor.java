/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.Serializable;

/**
 *
 * @author dell
 */
public class infor implements Serializable{
    private String name;
    private String tel;
    private String add;
    private goods good;
    public infor(){
        
    }

    public infor(String name, String tel, String add) {
        this.name = name;
        this.tel = tel;
        this.add = add;
    }

    public infor(String name, String tel, String add, goods good) {
        this.name = name;
        this.tel = tel;
        this.add = add;
        this.good = good;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public goods getGood() {
        return good;
    }

    public void setGood(goods good) {
        this.good = good;
    }

    
}
