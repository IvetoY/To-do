/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Iva
 */
public class EventList {
  private static Map<String, String> events = new HashMap<>(); 

    public  EventList() throws FileNotFoundException {
        if(events.isEmpty()){
        File file1 = new File("data.txt");
        Scanner file1_1 = new Scanner(file1);
        while(file1_1.hasNextLine()){
            String x = file1_1.nextLine();
            if(!x.equals("Nachalo")){
                String[] split = x.split(";");
                String k=split[2]+","+split[0];//RAZDELQ CHASA OT SUBITIETO I GI IZPOLVA KATO KEY I VALUE
                events.put(split[1],k);
            }
        }
        file1_1.close();
        }
    }
    
    public void AddEvent (String eventDate, String fullEvent) {
        events.put(eventDate, fullEvent);
}
    public Map<String, String> GetEvents(){
        return events;
    }
}

