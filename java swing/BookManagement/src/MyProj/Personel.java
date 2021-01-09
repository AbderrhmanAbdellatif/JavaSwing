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

    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
    abstract void Print();
   
}
