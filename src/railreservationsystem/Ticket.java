/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package railreservationsystem;

import java.io.*;
/**
 *
 * @author USER
 */
public class Ticket implements Serializable {
        
    private String code;
    private String origin;
    private String destination;
    private String departure;
    private String arrival;
    private String duration;
    private String date;
    private double pPlatinum;
    private double pGold;

    public Ticket(){}
    
    public Ticket(String code, String date, String origin, String destination, String departure, String arrival, String duration, double pPlatinum, double pGold) {
        this.code = code;
        this.date = date;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
        this.pPlatinum = pPlatinum;
        this.pGold = pGold;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getpPlatinum() {
        return pPlatinum;
    }

    public void setpPlatinum(double pPlatinum) {
        this.pPlatinum = pPlatinum;
    }

    public double getpGold() {
        return pGold;
    }

    public void setpGold(double pGold) {
        this.pGold = pGold;
    } 
}
