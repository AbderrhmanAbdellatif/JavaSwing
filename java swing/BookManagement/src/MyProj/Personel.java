/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProj;

/**
 *
 * @author tmtm6
 */
public abstract class Personel {

    private int id, password;
    private String name;

    public Personel(int id, int password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public Personel() {
    }

    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void Print();

}
