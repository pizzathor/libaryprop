/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hammer.datastuctproject;

/**
 *
 * @author User
 */
public interface queue {
    public int size();
    public void enqueue(String element);
    public String dequeue();
    public boolean isEmpty();
    public String front();
}
