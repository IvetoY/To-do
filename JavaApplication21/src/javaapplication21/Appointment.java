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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String d;

    //WZIMA DENQ OT MESECA KOITO GLEDAME
    public void data_get() {
        Methods get = new Methods() {
        };
        String d = get.getD();
    }

    public void labelDate() {
        data_get();
        date.setText(d);
        String data1 = d;
        Appoi2.setData(data1);
        //slaga korektna data kato q vzima ot predhodni framove
    }

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
        jPanel5 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 116, 123));

        jPanel1.setBackground(new java.awt.Color(14, 154, 161));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 603));

        jPanel2.setBackground(new java.awt.Color(14, 154, 161));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Избраната дата е ");

        date.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(14, 154, 161));

        jButton14.setBackground(new java.awt.Color(14, 110, 123));
        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\sofia\\OneDrive\\Desktop\\Files - Sofia\\To-do\\JavaApplication21\\src\\javaapplication21\\trash.png")); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(14, 110, 123));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\sofia\\OneDrive\\Desktop\\Files - Sofia\\To-do\\JavaApplication21\\src\\javaapplication21\\plus.png")); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(14, 110, 123));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sofia\\OneDrive\\Desktop\\Files - Sofia\\To-do\\JavaApplication21\\src\\javaapplication21\\arrow.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addGap(17, 17, 17)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        //PREMINAWA W KLASA cALENDAR - WRASTANE NAZAD
        Calendar c = new Calendar();
        c.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    //AKO SME IZTRILI WSICHKI SABITIQ W DADEN DEN GO MAHA OT FAILA KADETO SE ZAPISWAT DNITE W KOITO IMA EVENT; O(n), kadeto n e nomera na redowete waw faila Event
    public void removeFileEvent() throws FileNotFoundException, UnsupportedEncodingException {
        if (Event1.getText().equals(" ")) {//AKO NQMA SABITIE
            File file = new File("Event_new.txt");
            ArrayList<String> data = new ArrayList<>();
            Scanner fileReader = new Scanner(file);
            //metod koito maha datat ot faila s zaeti dati ako iztriem vs subitiq

            while (fileReader.hasNextLine()) {
                String x = fileReader.nextLine();
                if (!(x.equals(d))) {//WZIMA WSICHKI OSTANALI DNI W KOITO WSE OSTE IMA EVENTI
                    data.add(x);
                }
            }
            fileReader.close();
            PrintStream fileWriter = new PrintStream(file, "UTF-8");
            for (String i : data) {
                fileWriter.println(i);//SLAGA GI NANOWO VAV FAILA
            }
            fileWriter.close();
        }

    }
    public int br;

    public Map createMap(HashMap checkBox) throws FileNotFoundException {//O(n), kadeto n e nomera na redowete waw faila Event
        br = 0;
        File file = new File("data.txt");
        Scanner fileReader = new Scanner(file);
        //suzdava map koito izpolzvame za chEck box
        while (fileReader.hasNextLine()) {
            String x = fileReader.nextLine();
            String[] x_split = x.split(";");
            if (x_split[0].equals(d)) {
                checkBox.put(x_split[1], x_split[2]);//SLAGA EVENTITE W MAP(CHAS I EBENT)
                br++;
            }
        }
        Map<String, String> checkBoxSorted = new TreeMap<String, String>(checkBox);//SORTIRA GI PO CHASOWE(CHAS=KEY)
        return checkBoxSorted;//VRASTA SORTIRANIQ MAP

    }

    public void textCheckeBox() throws FileNotFoundException {//O(n+logn) -> logn e na TreeMap, a n e broq elemnti waw faila Event
        HashMap<String, String> checkBox = new HashMap<>();
        Map<String, String> checkBoxSorted = new TreeMap<String, String>();
        checkBoxSorted = createMap(checkBox);
        ArrayList<String> sortInfo = new ArrayList<>();
        for (Map.Entry<String, String> entry : checkBoxSorted.entrySet()) {
            sortInfo.add(entry.getKey() + "-" + entry.getValue());
        }//SLAGA CHASA I EVENTA ZAEDNO KATO ELEMNTI NA ARRAYLIST
        //podrejda vs subitiq
        for (int i = br + 1; i <= 10; i++) {
            sortInfo.add(" ");
        }//AKO SA PO-MALKO OT 10 EVENTA DA POPALNI OSTANALITE CHECKBOXOWE S PRAZNO MQSTO
        //ako nqma dobaveni subitq adva tekst " "
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
        //slaga tekst na vs check boxove
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (!(Event10.getText().equals(" "))) {
            JOptionPane.showMessageDialog(null, "Графика е запълнен.", " ", JOptionPane.WARNING_MESSAGE);//slojnost O(1)

        } else {
            Appoi2 a = new Appoi2();
            a.show();
            dispose();
        }
        //pri natiskane na buton za dobavqne na subitie i nalichie na zaoulneni 10 subitiq izliza suobshtenie

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int br1 = 0;
        String a = "";
        String regex = "[ ]+";
        //GLEDA KOI CHECK BOX E SELEKTORAN I DALI IMA EVENT W NEGO
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
        //vzima teksta ot selctnatiq buton
        buttonGroup1.clearSelection();//DA NE STOI OTBELQZANO SLED KATO E ISTRITO
        if (br1 != 0) {//AKO IMA EVENT W SELECTIRANIQ CHECK BOX
            try {
                String[] splitA = a.split("-");
                a = d + ";" + splitA[0] + ";" + splitA[1];
                removeEvent(a);//PREMAHWA EVENTA OT FAILA I CHECK BOXA
                Appoi2.counter = 0;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                textCheckeBox();//PODREZDA GI NANOWO ZA DA NE OSTANE PRZEN SAOTWETNIQ CHECK BOX OT KOITO SME IZTRILI EVENT
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Не е избрано събитие, което да бъде премахнато.", " ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton14ActionPerformed
    //PREMAHWA SABITIETO OT FAILA
    public void removeEvent(String a) throws FileNotFoundException, UnsupportedEncodingException {//O(n+m), akdeto n e broq elementi waw faila, a m e broq elemnti v dataWithoutEvent 
        File file = new File("data.txt");
        Scanner fileReader = new Scanner(file);
        //nkaraq maha subitieto i ot faila s data chas subitie
        ArrayList<String> dataWithoutEvent = new ArrayList<>();
        while (fileReader.hasNextLine()) {
            String x = fileReader.nextLine();
            if (!(x.equals("Nachalo"))) {
                if (!(a.equals(x))) {//NE ZAPISWA SABITIETO KOETO ISKAME DA IZTRIEM W ARRAYLISTA
                    dataWithoutEvent.add(x);
                }
            }
        }
        fileReader.close();
        PrintStream fileWriter = new PrintStream("data.txt", "UTF-8");
        fileWriter.println("Nachalo");
        for (String i : dataWithoutEvent) {
            fileWriter.println(i);//PREZAPISWA EVENTITE WAW FAILA BEZ IZTRITIQ
        }
        fileWriter.close();
    }
    private void Event1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event1ActionPerformed

    }//GEN-LAST:event_Event1ActionPerformed

    private void Event6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Event6ActionPerformed


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
