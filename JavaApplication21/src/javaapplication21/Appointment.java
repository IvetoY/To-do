/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication21.Appoi2.events;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Iva
 */
public class Appointment extends javax.swing.JFrame {

    /**
     * Creates new form Appointment
     */
    public Appointment() {
        initComponents();
        setLocationRelativeTo(null);
        labelDate();
        setResizable(false);
        try {
            textCheckeBox();
            /*try {
            addEvent();
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String d;
    public void data_get(){
        Methods get = new Methods();
        String d = get.getD();
    }

    /*public static String newEvent;

    public static String getNewEvent() {
        return newEvent;
    }

    public static void setNewEvent(String newEvent) {
        Appointment.newEvent = newEvent;
    }
    //PROMENLIVA ZA DATA
    public static String getD() {
        return d;
    }

    public static void setD(String d) {
        Appointment.d = d;
    }*/

    public void labelDate() {
        data_get();
        date.setText(d);
        String data1 = d;
        Appoi2.setData(data1);
    }

    /*public Map addEvent()throws FileNotFoundException{
        Map<String, String> events = new HashMap<>(); //TUK SHTE PAZIM SORIRANI SUBITIQ
        File file1 = new File("data.txt");
        Scanner file1_1 = new Scanner(file1);
        ArrayList<Object> oldData = new ArrayList<>();
        while(file1_1.hasNextLine()){
            String x = file1_1.nextLine();
            if(!x.equals("Nachalo")){
                String[] split = x.split(";"); //RAZDELQ CHASA OT SUBITIETO I GI IZPOLVA KATO KEY I VALUE
                events.put(split[1],split[2]);
            }
        }
        file1_1.close();
        
        ///s!!!!!!!!!!!!!
        Map<String, String> eventsSorted = new TreeMap<String, String>(events);//tuk trqbwa da se znae che sa ot edna data map w map?
        /*for(Map.Entry<String,String> entry : eventsSorted.entrySet()){
            System.out.println("Sorted: "+entry.getKey()+entry.getValue());//SORTIRANI SUBITIQ
            
        }
        return eventsSorted;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Event1 = new javax.swing.JCheckBox();
        Event2 = new javax.swing.JCheckBox();
        Event3 = new javax.swing.JCheckBox();
        Event4 = new javax.swing.JCheckBox();
        Event5 = new javax.swing.JCheckBox();
        Event6 = new javax.swing.JCheckBox();
        Event7 = new javax.swing.JCheckBox();
        Event8 = new javax.swing.JCheckBox();
        Event9 = new javax.swing.JCheckBox();
        Event10 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 116, 123));

        jPanel1.setBackground(new java.awt.Color(14, 154, 161));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 603));

        jPanel2.setBackground(new java.awt.Color(14, 154, 161));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Избраната дата е ");

        date.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(14, 154, 161));

        Event1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event1);
        Event1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event1.setBorderPainted(true);
        Event1.setContentAreaFilled(false);
        Event1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event1ActionPerformed(evt);
            }
        });

        Event2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event2);
        Event2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event2.setBorderPainted(true);
        Event2.setContentAreaFilled(false);

        Event3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event3);
        Event3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event3.setBorderPainted(true);
        Event3.setContentAreaFilled(false);

        Event4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event4);
        Event4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event4.setBorderPainted(true);
        Event4.setContentAreaFilled(false);

        Event5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event5);
        Event5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event5.setBorderPainted(true);
        Event5.setContentAreaFilled(false);

        Event6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event6);
        Event6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event6.setBorderPainted(true);
        Event6.setContentAreaFilled(false);
        Event6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event6ActionPerformed(evt);
            }
        });

        Event7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event7);
        Event7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event7.setBorderPainted(true);
        Event7.setContentAreaFilled(false);

        Event8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event8);
        Event8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event8.setBorderPainted(true);
        Event8.setContentAreaFilled(false);

        Event9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event9);
        Event9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event9.setBorderPainted(true);
        Event9.setContentAreaFilled(false);

        Event10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Event10);
        Event10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Event10.setBorderPainted(true);
        Event10.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Event1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event3, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event4, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event5, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event6, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event7, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event8, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event9, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event10, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Event1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(14, 154, 161));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton12.setBackground(new java.awt.Color(21, 235, 232));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setText("+");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(21, 235, 232));
        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\JavaApplication4\\To-do\\JavaApplication21\\src\\javaapplication21\\trash.png")); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(21, 235, 232));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("<-- ");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            removeFileEvent();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar c = new Calendar();
        c.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void removeFileEvent() throws FileNotFoundException, UnsupportedEncodingException{
        if(Event1.getText().equals(" ")){
             File file = new File("Event_new.txt");
             ArrayList<String> data = new ArrayList<>();
        Scanner fileReader = new Scanner(file);

        while(fileReader.hasNextLine()){
            String x=fileReader.nextLine();
            if(!(x.equals(d))){
                data.add(x);
            }
        }
        fileReader.close();
         PrintStream fileWriter = new PrintStream(file,"UTF-8");
         for(String i: data){
             fileWriter.println(i);
         }
         fileWriter.close();
        }

    }
    public int br;
    public Map createMap(HashMap checkBox) throws FileNotFoundException {
        br=0;
        File file = new File("data.txt");
        Scanner fileReader = new Scanner(file);

        while (fileReader.hasNextLine()) {

            String x = fileReader.nextLine();
            String[] x_split = x.split(";");
            if (x_split[0].equals(d)) {
                checkBox.put(x_split[1], x_split[2]);
                br++;
            }
        }
        Map<String, String> checkBoxSorted = new TreeMap<String, String>(checkBox);
        return checkBoxSorted;
        
    }

    public void textCheckeBox() throws FileNotFoundException {
        HashMap<String, String> checkBox = new HashMap<>();
        Map<String, String> checkBoxSorted = new TreeMap<String, String>();
        checkBoxSorted = createMap(checkBox);
        ArrayList<String> sortInfo = new ArrayList<>();
        for (Map.Entry<String, String> entry : checkBoxSorted.entrySet()) {
            sortInfo.add(entry.getKey() + "-" + entry.getValue());
        }
        
        for (int i = br + 1; i <= 10; i++) {
            sortInfo.add(" ");
        }
        Event1.setText(sortInfo.get(0));
        Event2.setText(sortInfo.get(1));
        Event3.setText(sortInfo.get(2));
        Event4.setText(sortInfo.get(3));
        Event5.setText(sortInfo.get(4));
        Event6.setText(sortInfo.get(5));
        Event7.setText(sortInfo.get(6));
        Event8.setText(sortInfo.get(7));
        Event9.setText(sortInfo.get(8));
        Event10.setText(sortInfo.get(9));

    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (!(Event10.getText().equals(" "))) {
            JOptionPane.showMessageDialog(null, "Графика е запълнен.", " ", JOptionPane.WARNING_MESSAGE);

        } else {
            Appoi2 a = new Appoi2();
            a.show();
            dispose();
        }

    }//GEN-LAST:event_jButton12ActionPerformed
//setSelection(false) za check box
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int br1=0;
        String a="";
        String regex = "[ ]+";
        if (Event1.isSelected() && !(Event1.getText().matches(regex))) {
            a = Event1.getText();
            br1++;
        }
        if (Event2.isSelected() && !(Event2.getText().matches(regex))) {
            a = Event2.getText();
            br1++;
        }
            if (Event3.isSelected() && !(Event3.getText().matches(regex))) {
            a = Event3.getText();
            br1++;
        }
            if (Event4.isSelected() && !(Event4.getText().matches(regex))) {
            a = Event4.getText();
            br1++;
        }
            if (Event5.isSelected() && !(Event5.getText().matches(regex))) {
            a = Event5.getText();
            br1++;
        }
            if (Event6.isSelected() && !(Event6.getText().matches(regex))) {
            a = Event6.getText();
            br1++;
        }
            if (Event7.isSelected() && !(Event7.getText().matches(regex))) {
            a = Event7.getText();
            br1++;
        }
            if (Event8.isSelected() && !(Event8.getText().matches(regex))) {
            a = Event8.getText();
            br1++;
        }
            if (Event9.isSelected() && !(Event9.getText().matches(regex))) {
            a = Event9.getText();
            br1++;
        }
            if (Event10.isSelected() && !(Event10.getText().matches(regex))) {
            a = Event10.getText();
            br1++;
        }
            buttonGroup1.clearSelection();
           if(br1!=0){
            try {
                 String []splitA=a.split("-");
                a=d+";"+splitA[0]+";"+splitA[1];
               removeEvent(a);
                //System.out.println("tova e a "+a);
                Appoi2.counter=0;
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                textCheckeBox();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
           else {
               JOptionPane.showMessageDialog(null, "Не е избрано събитие, което да бъде премахнато.", " ", JOptionPane.WARNING_MESSAGE);
           }
           
    }//GEN-LAST:event_jButton14ActionPerformed
    public void removeEvent(String a) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("data.txt");
        Scanner fileReader = new Scanner(file);
        
        ArrayList<String> dataWithoutEvent = new ArrayList<>();
        while(fileReader.hasNextLine()){
            String x = fileReader.nextLine();
            //System.out.println(x+" tova sa redovete ot faila");
            if(!(x.equals("Nachalo"))){
                
                if(!(a.equals(x))){
                    dataWithoutEvent.add(x);
                }
            }
            
        }
         fileReader.close();
        PrintStream fileWriter = new PrintStream("data.txt", "UTF-8");
        fileWriter.println("Nachalo");
        for(String i: dataWithoutEvent){
            fileWriter.println(i);
        }
       fileWriter.close();
    }
    private void Event1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event1ActionPerformed

    }//GEN-LAST:event_Event1ActionPerformed

    private void Event6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Event1;
    private javax.swing.JCheckBox Event10;
    private javax.swing.JCheckBox Event2;
    private javax.swing.JCheckBox Event3;
    private javax.swing.JCheckBox Event4;
    private javax.swing.JCheckBox Event5;
    private javax.swing.JCheckBox Event6;
    private javax.swing.JCheckBox Event7;
    private javax.swing.JCheckBox Event8;
    private javax.swing.JCheckBox Event9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
