/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication21;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iva
 */
public class Appoi2 extends javax.swing.JFrame {
    /**
     * Creates new form Appoi2
     */
    public Appoi2() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }
    private int counter;
    private static String data;
    private Map eventList;
    public static Map<String, String> events = new HashMap<>();

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        Appoi2.data = data;
    }

    public Map getEventList() {
        return eventList;
    }

    public void setEventList(Map eventList) {
        this.eventList = eventList;
    }
     
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Hour = new javax.swing.JComboBox<>();
        Minute = new javax.swing.JComboBox<>();
        Event = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Добави събитие:");

        Hour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        Minute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Minute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        Event.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Час:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Минути:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Събитие:");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Minute, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Event, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minute, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        getCurrentEvent();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Appoi2.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(Appoi2.class.getName()).log(Level.SEVERE, null, ex);
    }
        if(counter==0){
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void getCurrentEvent() throws FileNotFoundException, UnsupportedEncodingException {
        counter=0;
        String hour;
        String minute;
        hour=(String) Hour.getSelectedItem();
        minute=(String) Minute.getSelectedItem();
        String event;
        event = (String)Event.getText();
        String regex = "[ ]+";
        if(!(event.equals("") || event.matches(regex))){
            String fullEvent;
            String chas = hour+":"+minute;
            fullEvent=getData()+";"+chas+";"+event;//00/00/00;00:00;jej
            //System.out.println(fullEvent);
            Map<String, String> events = new HashMap<>();
            events = addEvent();
            if(!events.isEmpty()){
            
            for(Map.Entry<String,String>entry : events.entrySet()){
                String []split_value = (entry.getKey()).split(",");
                   if(split_value[0].equals(getData())){
                       //ima problem s dobavqneto na neshta po edno isushto vreme
                       //pri vsqko startirani ne chete starite neshta i pozvolqva da vuveda neshto dva puti
                    if(chas.equals(split_value[1])){
                       counter++;
                       JOptionPane.showMessageDialog(null, "Има съществуващо събитие по това време.","", JOptionPane.WARNING_MESSAGE);
                    }
                }
                if(counter!=0){
                    break;  
                }
            }
            }
            if(counter==0){
                addEventData(getData());
                writeInFile(fullEvent);
         } 
         }
        else{
            counter++;
            JOptionPane.showMessageDialog(null, "Събитието не е добавено.", " ", JOptionPane.WARNING_MESSAGE);
            //da slozim butoni za zatwarqne ili iskam da poprawq events(pri+ dali posledniq buton e prazen ili ne
        }
        //da naprawim prowerka ako weche ima w tokkowa chasanasto
    }
    
    public Map addEvent()throws FileNotFoundException{
         //TUK SHTE PAZIM SORIRANI SUBITIQ tova otiva v
        File file1 = new File("data.txt");
        Scanner file1_1 = new Scanner(file1);
        ArrayList<Object> oldData = new ArrayList<>();
        while(file1_1.hasNextLine()){
            String x = file1_1.nextLine();
            if(!x.equals("Nachalo")){
                String[] split = x.split(";");
                String k=split[0]+","+split[1];//RAZDELQ CHASA OT SUBITIETO I GI IZPOLVA KATO KEY I VALUE
                events.put(k,split[2]);
            }
            //ot uka idva problema
            //ako poslednata zapisana data e sushtata kato segashnata ne dava da se povtarqt, no ako e nqkoq ot po gornite pozvolqva
        }
        file1_1.close();
        return events;
    }
      public void addEventData(String a)throws FileNotFoundException, UnsupportedEncodingException{
        Set<String> data_set = new TreeSet<>(); //TUK SHTE PAZIM SORIRANI SUBITIQ
        File file1 = new File("Event_new.txt");
        Scanner file1_1 = new Scanner(file1);
        while(file1_1.hasNextLine()){
            String x = file1_1.nextLine();
            if(!x.equals("Nachalo")){
               //String[] split = x.split(" "); //RAZDELQ CHASA i  SUBITIETO ot godinata  I GI IZPOLVA KATO v seta
                //data_set.add(x);
                String[] h = x.split("/");
                String j = h[2]+"/"+h[1]+"/"+h[0];
                data_set.add(j);
            }
        }
        String[] k = a.split("/");
        String y = k[2]+"/"+k[1]+"/"+k[0];
        data_set.add(y);
        PrintStream fileWriter = new PrintStream("Event_new.txt","UTF-8");
        fileWriter.println("Nachalo");
        for(String set_elements: data_set){
            String[] l = set_elements.split("/");
            String q = l[2]+"/"+l[1]+"/"+l[0];
            fileWriter.println(q);
        }
        file1_1.close();
        fileWriter.close();
        
    }
    
    public void writeInFile(String a) throws FileNotFoundException, UnsupportedEncodingException{
        File file1 = new File("data.txt");
        Scanner file1_1 = new Scanner(file1);
        File file2 = new File("Event_new.txt");
        Scanner file1_2 = new Scanner(file2);
        LinkedList<String> oldData = new LinkedList<>();
        while(file1_1.hasNextLine()){
            String p = file1_1.nextLine();
            if(!(p.equals("Nachalo"))){
                oldData.add(p);
            }
        }
        PrintStream fileWriter = new PrintStream("data.txt","UTF-8");
        oldData.add(a);
        System.out.println(a);
        //Collections.sort(oldData);
        fileWriter.println("Nachalo");
        int br=0;
        while(file1_2.hasNextLine()){
            if(br==0){
                file1_2.nextLine();
                br++;
            }
            if(file1_2.hasNextLine()){
                String j = file1_2.nextLine();
                for(int i=0;i<oldData.size();i++){
                        String[] k = oldData.get(i).split(";");
                        if(j.equals(k[0])){
                            fileWriter.println(oldData.get(i));
                        }
                }
            }
        }
        
        ////ZAPAZVA STARATA INFORMATSIQ VUUV FAILA
        fileWriter.close();
        file1_2.close();
        file1_1.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appoi2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Event;
    private javax.swing.JComboBox<String> Hour;
    private javax.swing.JComboBox<String> Minute;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
