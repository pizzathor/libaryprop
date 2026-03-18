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
public class myQueue implements queue{
    public ArrayList<String> theQueue;
    
    public myQueue(){
        theQueue = new ArrayList<String>();
    }
    
    @Override
    public int size() {
        return theQueue.size();
    }

    @Override
    public void enqueue(String element) {
        theQueue.add((String)element);
    }

    @Override
    public String dequeue() {
        if(size() > 0){
            return theQueue.remove(0);
        }
        else{
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    @Override
    public String front() {
        if(theQueue.size() > 0){
            return theQueue.get(0);
        }
        else{
            return null;
        }
    }
    
}
