/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElevatorApp;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import ElevatorApp.Elevator;

/**
 *
 * @author marius
 */
public class Settings {
    //Lista de lifturi
    static private List elevators = Collections.synchronizedList(new LinkedList());
    //Indexul ultimului element din lista de lifturi
    static private Integer elev_number = 0;
    Settings(){
        elevators.add(new Elevator());
    }
    public Integer get_elev_number(){
        return elev_number;
    }
    public void add_elevator(){
        elev_number++;
        elevators.add(new Elevator());
    }
    public void remove_elevator(Integer i){
        elevators.remove(i);
    }
}
