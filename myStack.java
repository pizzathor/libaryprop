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
public class myStack implements stacking{
    //ignore error 
    public ArrayList<books> theStack;
    
    @SuppressWarnings("Convert2Diamond")
    public myStack(){
        theStack = new ArrayList<books>();
    }
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    @Override
    public boolean isFull(){
        return false;
    }
    @Override
    public void push(books newItem){
        theStack.add(0, (books)newItem);
    }
    @Override
    public books pop(){
        if(!(theStack.isEmpty())){
            return theStack.remove(0);
        }
        else{
            return null;
        }
    }
    @Override
    public int size(){
        return theStack.size();
    }
}
