/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElevatorApp;

/**
 *
 * @author marius
 */
public class Elevator {
    private double speed;
    private double arrive_leave_speed;
    private double self_weight;
    private double interior_weight;
    private double max_weight;
    
    Elevator(){
        //Initialize variables
        //TO DO (much math and physics)
    }
    
    public void set_speed(double q){
        this.speed = q;
    }
    public double get_speed(){
        return this.speed;
    }
    public void set_start_speed(double q){
        this.arrive_leave_speed = q;
    }
    public double get_start_speed(){
        return this.arrive_leave_speed;
    }
    public void set_self_weight(double q){
        this.self_weight = q;
    }
    public double get_self_weight(){
        return this.self_weight;
    }
    public void set_interior_weight(double q){
        this.interior_weight = q;
    }
    public double get_interior_weight(){
        return this.interior_weight;
    }
    public void set_max_weight(double q){
        this.max_weight = q;
    }
    public double get_max_weight(){
        return this.max_weight;
    }
}
