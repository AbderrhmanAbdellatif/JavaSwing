/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProj;

import java.util.ArrayList;

/**
 *
 * @author tmtm6
 */
public class User extends Personel{
   
    public User(int id, int password, String name) {
        super(id, password, name);
        this.setId(id);
        this.setName(name);
        this.setPassword(password);
    }
    

    
    @Override
    void Print() {
        System.out.println("the  id is : " + this.getId()
                + ", name : " + this.getName()
                + "password : " + this.getPassword());
    }
    
}
