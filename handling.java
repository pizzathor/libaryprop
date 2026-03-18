/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hammer.datastuctproject;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class handling {
    public myStack meStack;
    public myQueue meQueue;
    public books heldBook = new books();
    public ArrayList<books> meArray;
    public handling() {
        this.meStack = new myStack();
        this.meQueue = new myQueue();
        this.meArray = new ArrayList<books>();
    }
    public books settingBooks(int myId, String myName, String myGenre){
        books back = new books();
        back.setId(myId);
        back.setName(myName);
        back.setGenre(myGenre);
        return back;
    }
    public void addingToStack(int myId, String myName, String myGenre){
        books power;
        power = settingBooks(myId, myName, myGenre);
        meStack.push(power);
    }
    public void addingToArray(int myId, String myName, String myGenre){
        books power;
        String me;
        power = settingBooks(myId, myName, myGenre);
        meArray.add(power);
        meArray.getLast().getGenre();
    }
    public void AddingToQueue(String name){
        meQueue.enqueue(name);
    }
    public String nextperson(){
        String person = gettingFromQueue();
        meQueue.dequeue();
        return person;
    }
    public String gettingFromQueue(){
        return meQueue.front();
    }
    public String getBookNameArray(int number){
        return meArray.get(number).getName();
    }
    public String getBookGenreArray(int number){
        return meArray.get(number).getGenre();
    }
    public int getBookIdArray(int number){
        return meArray.get(number).getId();
    }
    public void holdBookStack(){
        heldBook = meStack.pop();
    }
    public String heldBookName(){
        return heldBook.getName();
    }
    public int heldBookId(){
        return heldBook.getId();
    }
    public String heldBookGenre(){
        return heldBook.getGenre();
    }
    public void heldBookPutBack(){
        meStack.push(heldBook);
    }
    
}
