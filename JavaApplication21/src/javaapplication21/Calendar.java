/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication21;

import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author sofia
 */
public class Calendar extends javax.swing.JFrame {

    /**
     * Creates new form Calendar
     */
    public Calendar() {
        initComponents();
        Label1();
         setLocationRelativeTo(null);
         
    }
    
    public void den(int y, int m){
        LinkedList<String> d = new LinkedList<>();
        //ot startowata stranica ot tam ste naprawim default tozi mesec
        //String today = date.getDayOfWeek().toString();
        LocalDate someday = LocalDate.of(y,m,1);
        String day = someday.getDayOfWeek().toString();
        //System.out.println(day);
        String h1;
        if(m==4 || m==6 || m==9 || m==11){
            for(int i=1;i<=36;i++){
                if(i<=30){
                    h1 = Integer.toString(i);
                    d.add(h1);
                }
                else{
                    d.add("");
                }
            }
        }
        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            for(int i=1;i<=36;i++){
                if(i<=31){
                    h1 = Integer.toString(i);
                    d.add(h1);
                }
                else{
                    d.add("");
                }
            }
        }
        else{
            int r;
            if(y%4==0){
                r = 29;
            }
            else{
                r = 28;
            }
            for(int i=1;i<=36;i++){
                if(i<=r){
                    h1 = Integer.toString(i);
                    d.add(h1);
                }
                else{
                    d.add("");
                }
            }
        }
        zap(d,day);
        
        a.setText(d.get(0));//moche i linked list w opaska da go naprawim
        b.setText(d.get(1));
        c.setText(d.get(2));
        d1.setText(d.get(3));
        e.setText(d.get(4));
        f.setText(d.get(5));
        g.setText(d.get(6));
        h.setText(d.get(7));
        i1.setText(d.get(8));
        j.setText(d.get(9));
        k.setText(d.get(10));
        l.setText(d.get(11));
        m1.setText(d.get(12));
        n.setText(d.get(13));
        o.setText(d.get(14));
        p.setText(d.get(15));
        q.setText(d.get(16));
        r.setText(d.get(17));
        s.setText(d.get(18));
        t.setText(d.get(19));
        u.setText(d.get(20));
        v.setText(d.get(21));
        w.setText(d.get(22));
        x.setText(d.get(23));
        y1.setText(d.get(24));
        z.setText(d.get(25));
        A.setText(d.get(26));
        B.setText(d.get(27));
        C.setText(d.get(28));
        D.setText(d.get(29));
        E.setText(d.get(30));
        F.setText(d.get(31));
        G.setText(d.get(32));
        H.setText(d.get(33));
        I.setText(d.get(34));
        J.setText(d.get(35));
        K.setText(d.get(36));
        data2.setText(m+"/"+y);
        
    }
    public void zap(LinkedList d, String day){
        if("MONDAY".equals(day)){
            //jLabel1.setText("1");
        }
        else if(day.equals("TUESDAY")){
            //jLabel5.setText("1");
            d.addFirst(" ");
        }
        else if(day.equals("WEDNESDAY")){
            //jLabel6.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
        }
        else if(day.equals("THURSDAY")){
            //jLabel7.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
        }
        else if(day.equals("FRIDAY")){
            //jLabel8.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
        }
        else if(day.equals("SATURDAY")){
            //jLabel9.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            
        }
        else if(day.equals("SUNDAY")){
            //jLabel10.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
        }
    }
    /*public void got(LinkedList d){
            jLabel1.setText(d.get(0));//moche i linked list w opaska da go naprawim
            jLabel5.setText(d.get(1));
            jLabel6.setText(d.get(2));
            jLabel7.setText(d.get(3));
            jLabel8.setText(d.get(4));
            jLabel9.setText(d.get(5));
            jLabel10.setText(d.get(6));
    }*/
    public void Label1(){
        LocalDate date = LocalDate.now();
        String[] a;
        String str = date.toString();
        a = str.split("-");
        //ot startowata stranica ot tam ste naprawim default tozi mesec
        //String today = date.getDayOfWeek().toString();
        int y = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        den(y,m);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        h = new javax.swing.JButton();
        v = new javax.swing.JButton();
        o = new javax.swing.JButton();
        a = new javax.swing.JButton();
        J = new javax.swing.JButton();
        C = new javax.swing.JButton();
        b = new javax.swing.JButton();
        i1 = new javax.swing.JButton();
        p = new javax.swing.JButton();
        w = new javax.swing.JButton();
        D = new javax.swing.JButton();
        K = new javax.swing.JButton();
        c = new javax.swing.JButton();
        j = new javax.swing.JButton();
        q = new javax.swing.JButton();
        x = new javax.swing.JButton();
        E = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        k = new javax.swing.JButton();
        r = new javax.swing.JButton();
        y1 = new javax.swing.JButton();
        F = new javax.swing.JButton();
        e = new javax.swing.JButton();
        l = new javax.swing.JButton();
        s = new javax.swing.JButton();
        z = new javax.swing.JButton();
        G = new javax.swing.JButton();
        f = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        t = new javax.swing.JButton();
        A = new javax.swing.JButton();
        H = new javax.swing.JButton();
        g = new javax.swing.JButton();
        n = new javax.swing.JButton();
        u = new javax.swing.JButton();
        B = new javax.swing.JButton();
        I = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        data2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        h.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        h.setText("1");
        h.setBorder(null);
        h.setBorderPainted(false);
        h.setContentAreaFilled(false);
        h.setPreferredSize(new java.awt.Dimension(60, 49));

        v.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        v.setText("1");
        v.setBorder(null);
        v.setBorderPainted(false);
        v.setContentAreaFilled(false);
        v.setPreferredSize(new java.awt.Dimension(60, 49));

        o.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        o.setText("1");
        o.setBorder(null);
        o.setBorderPainted(false);
        o.setContentAreaFilled(false);
        o.setPreferredSize(new java.awt.Dimension(60, 49));

        a.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        a.setText("1");
        a.setBorder(null);
        a.setBorderPainted(false);
        a.setContentAreaFilled(false);
        a.setPreferredSize(new java.awt.Dimension(60, 49));

        J.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        J.setText("1");
        J.setBorder(null);
        J.setBorderPainted(false);
        J.setContentAreaFilled(false);
        J.setPreferredSize(new java.awt.Dimension(60, 49));

        C.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        C.setText("1");
        C.setBorder(null);
        C.setBorderPainted(false);
        C.setContentAreaFilled(false);
        C.setPreferredSize(new java.awt.Dimension(60, 49));

        b.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        b.setText("1");
        b.setBorder(null);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.setPreferredSize(new java.awt.Dimension(60, 49));

        i1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        i1.setText("1");
        i1.setBorder(null);
        i1.setBorderPainted(false);
        i1.setContentAreaFilled(false);
        i1.setPreferredSize(new java.awt.Dimension(60, 49));

        p.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        p.setText("1");
        p.setBorder(null);
        p.setBorderPainted(false);
        p.setContentAreaFilled(false);
        p.setPreferredSize(new java.awt.Dimension(60, 49));

        w.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        w.setText("1");
        w.setBorder(null);
        w.setBorderPainted(false);
        w.setContentAreaFilled(false);
        w.setPreferredSize(new java.awt.Dimension(60, 49));

        D.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        D.setText("1");
        D.setBorder(null);
        D.setBorderPainted(false);
        D.setContentAreaFilled(false);
        D.setPreferredSize(new java.awt.Dimension(60, 49));

        K.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        K.setText("1");
        K.setBorder(null);
        K.setBorderPainted(false);
        K.setContentAreaFilled(false);
        K.setPreferredSize(new java.awt.Dimension(60, 49));

        c.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        c.setText("1");
        c.setBorder(null);
        c.setBorderPainted(false);
        c.setContentAreaFilled(false);
        c.setPreferredSize(new java.awt.Dimension(60, 49));

        j.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        j.setText("1");
        j.setBorder(null);
        j.setBorderPainted(false);
        j.setContentAreaFilled(false);
        j.setPreferredSize(new java.awt.Dimension(60, 49));

        q.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        q.setText("1");
        q.setBorder(null);
        q.setBorderPainted(false);
        q.setContentAreaFilled(false);
        q.setPreferredSize(new java.awt.Dimension(60, 49));

        x.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        x.setText("1");
        x.setBorder(null);
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.setPreferredSize(new java.awt.Dimension(60, 49));

        E.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        E.setText("1");
        E.setBorder(null);
        E.setBorderPainted(false);
        E.setContentAreaFilled(false);
        E.setPreferredSize(new java.awt.Dimension(60, 49));

        d1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        d1.setText("1");
        d1.setBorder(null);
        d1.setBorderPainted(false);
        d1.setContentAreaFilled(false);
        d1.setPreferredSize(new java.awt.Dimension(60, 49));

        k.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        k.setText("1");
        k.setBorder(null);
        k.setBorderPainted(false);
        k.setContentAreaFilled(false);
        k.setPreferredSize(new java.awt.Dimension(60, 49));

        r.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        r.setText("1");
        r.setBorder(null);
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        r.setPreferredSize(new java.awt.Dimension(60, 49));

        y1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        y1.setText("1");
        y1.setBorder(null);
        y1.setBorderPainted(false);
        y1.setContentAreaFilled(false);
        y1.setPreferredSize(new java.awt.Dimension(60, 49));

        F.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        F.setText("1");
        F.setBorder(null);
        F.setBorderPainted(false);
        F.setContentAreaFilled(false);
        F.setPreferredSize(new java.awt.Dimension(60, 49));

        e.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        e.setText("1");
        e.setBorder(null);
        e.setBorderPainted(false);
        e.setContentAreaFilled(false);
        e.setPreferredSize(new java.awt.Dimension(60, 49));

        l.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        l.setText("1");
        l.setBorder(null);
        l.setBorderPainted(false);
        l.setContentAreaFilled(false);
        l.setPreferredSize(new java.awt.Dimension(60, 49));

        s.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        s.setText("1");
        s.setBorder(null);
        s.setBorderPainted(false);
        s.setContentAreaFilled(false);
        s.setPreferredSize(new java.awt.Dimension(60, 49));

        z.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        z.setText("1");
        z.setBorder(null);
        z.setBorderPainted(false);
        z.setContentAreaFilled(false);
        z.setPreferredSize(new java.awt.Dimension(60, 49));

        G.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        G.setText("1");
        G.setBorder(null);
        G.setBorderPainted(false);
        G.setContentAreaFilled(false);
        G.setPreferredSize(new java.awt.Dimension(60, 49));

        f.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        f.setText("1");
        f.setBorder(null);
        f.setBorderPainted(false);
        f.setContentAreaFilled(false);
        f.setPreferredSize(new java.awt.Dimension(60, 49));

        m1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        m1.setText("1");
        m1.setBorder(null);
        m1.setBorderPainted(false);
        m1.setContentAreaFilled(false);
        m1.setPreferredSize(new java.awt.Dimension(60, 49));

        t.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        t.setText("1");
        t.setBorder(null);
        t.setBorderPainted(false);
        t.setContentAreaFilled(false);
        t.setPreferredSize(new java.awt.Dimension(60, 49));

        A.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        A.setText("1");
        A.setBorder(null);
        A.setBorderPainted(false);
        A.setContentAreaFilled(false);
        A.setPreferredSize(new java.awt.Dimension(60, 49));

        H.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        H.setText("1");
        H.setBorder(null);
        H.setBorderPainted(false);
        H.setContentAreaFilled(false);
        H.setPreferredSize(new java.awt.Dimension(60, 49));

        g.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        g.setText("1");
        g.setBorder(null);
        g.setBorderPainted(false);
        g.setContentAreaFilled(false);
        g.setPreferredSize(new java.awt.Dimension(60, 49));

        n.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        n.setText("1");
        n.setBorder(null);
        n.setBorderPainted(false);
        n.setContentAreaFilled(false);
        n.setPreferredSize(new java.awt.Dimension(60, 49));

        u.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        u.setText("1");
        u.setBorder(null);
        u.setBorderPainted(false);
        u.setContentAreaFilled(false);
        u.setPreferredSize(new java.awt.Dimension(60, 49));

        B.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        B.setText("1");
        B.setBorder(null);
        B.setBorderPainted(false);
        B.setContentAreaFilled(false);
        B.setPreferredSize(new java.awt.Dimension(60, 49));

        I.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        I.setText("1");
        I.setBorder(null);
        I.setBorderPainted(false);
        I.setContentAreaFilled(false);
        I.setPreferredSize(new java.awt.Dimension(60, 49));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setText("Вт.");
        jLabel4.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jLabel4VetoableChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel5.setText("Ср.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel6.setText("Чт.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel7.setText("Пт.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel8.setText("Пон.");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel9.setText("Нд.");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel10.setText("Сб.");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        data2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        data2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data2.setText("jLabel1");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String w1 = data2.getText();
        //int r = Integer.parseInt(w);
        String[] sp = w1.split("/");
        int r2 = Integer.parseInt(sp[0]);
        int x2 = Integer.parseInt(sp[1]);
        if(r2==1){
            r2 = 13;
            x2 = x2-1;
        }
        den(x2,r2-1);
        //prowerqwame kolko dni ima
        //s metod towa koeto prawim i w nachaloto
        
        //z vawisimost koi e denq q 7 if z parwite 7 dni ot sedmicata
        //jLabel1.setText("1");
        //System.out.println(someday.getDayOfWeek().toString());
        //jLabel1.setText(a[2]);
        //jLabel2.setText(a[])
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String w1 = data2.getText();
        String[] sp = w1.split("/");
        int r2 = Integer.parseInt(sp[0]);
        int x2 = Integer.parseInt(sp[1]);
        if(r2==12){
            r2 = 0;
            x2 = x2+1;
        }
        den(x2,r2+1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jLabel4VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4VetoableChange

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
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JButton d1;
    private javax.swing.JLabel data2;
    private javax.swing.JButton e;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i1;
    private javax.swing.JButton j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m1;
    private javax.swing.JButton n;
    private javax.swing.JButton o;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JButton t;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y1;
    private javax.swing.JButton z;
    // End of variables declaration//GEN-END:variables
}
