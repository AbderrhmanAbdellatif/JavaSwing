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
public interface Book {
    // db functions 
    public void AddBook(int Id,String name,String Author,String publisher,int years,String Lang,int PRICE);
    public void DeleteBook(int id);
    public void UpdateBook(int id,String name,int years);
    public void UpdateBook(int id,String name);
    public void UpdateBook(int id,int price);
    public void SearchBook(int id);
    public void SearchBook(String name);
    public void ShowBook(int id);
    public ArrayList ShowBook();
    public void showBooks();
}
