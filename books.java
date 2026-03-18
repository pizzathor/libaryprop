/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hammer.datastuctproject;

/**
 *
 * @author User
 */
public class books {
    public int id;
    public String genre;
    public String name;
    public void setId(int thisOne){
        id = thisOne;
    }
    public void setName(String thisOne){
        name = thisOne;
    }
    public void setGenre(String thisOne){
        genre = thisOne;
    }
    public int getId(){
        return id;
    }
    public String getGenre(){
        return genre;
    }
    public String getName(){
        return name;
    }
}
