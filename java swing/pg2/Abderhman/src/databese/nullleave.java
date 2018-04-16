/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databese;

/**
 *
 * @author R. TAHA
 */
public class nullleave extends  Exception{
    String Null;

    public nullleave(String bos) {
        this.Null=bos;
    }
    @Override
     public String getMessage() {
        return "Bos String Hatası: "+ Null;
    }
}
