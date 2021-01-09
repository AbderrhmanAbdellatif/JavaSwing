/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProj;

/**
 *
 * @author R. TAHA
 */
public class NullExceptipn extends Exception {

    String Null;

    public NullExceptipn(String Null) {
        this.Null = Null;
    }

    @Override
    public String getMessage() {
        return "Plases Don't leave Empty ):";
    }
}
