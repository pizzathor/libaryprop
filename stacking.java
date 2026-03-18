/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hammer.datastuctproject;

/**
 *
 * @author User
 */
public interface stacking {
    public boolean isEmpty();
    public boolean isFull();
    public void push(books Newitem);
    public books pop();
    public int size();
}
