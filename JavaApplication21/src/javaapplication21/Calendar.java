/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication21;

import java.time.LocalDate;
import java.util.LinkedList;

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
            for(int i=1;i<=42;i++){
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
            for(int i=1;i<=42;i++){
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
            for(int i=1;i<=42;i++){
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
        L.setText(d.get(37));
        M.setText(d.get(38));
        N.setText(d.get(39));
        O.setText(d.get(40));
        P.setText(d.get(41));
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
        h = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        K = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        y1 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        u = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
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

        h.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        h.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        h.setText("1");

        o.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        o.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o.setText("1");

        v.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v.setText("1");

        C.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setText("1");

        J.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J.setText("1");

        a.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("1");

        b.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setText("1");

        i1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        i1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i1.setText("1");

        w.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        w.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w.setText("1");

        D.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("1");

        K.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        K.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        K.setText("1");

        p.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p.setText("1");

        j.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        j.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j.setText("1");

        c.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("1");

        x.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("1");

        E.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E.setText("1");

        L.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L.setText("1");

        d1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setText("1");

        r.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        r.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r.setText("1");

        q.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q.setText("1");

        y1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        y1.setText("1");

        F.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F.setText("1");

        k.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        k.setText("1");

        M.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        M.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M.setText("1");

        e.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e.setText("1");

        s.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s.setText("1");

        z.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        z.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z.setText("1");

        G.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G.setText("1");

        N.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText("1");

        l.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l.setText("1");

        f.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        f.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f.setText("1");

        m1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        m1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m1.setText("1");

        t.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t.setText("1");

        A.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setText("1");

        H.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("1");

        O.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O.setText("1");

        g.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        g.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g.setText("1");

        n.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        n.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n.setText("1");

        u.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        u.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u.setText("1");

        B.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("1");

        I.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I.setText("1");

        P.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P.setText("1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setText("Вт.");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addGap(14, 14, 14))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 210, Short.MAX_VALUE))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JLabel H;
    private javax.swing.JLabel I;
    private javax.swing.JLabel J;
    private javax.swing.JLabel K;
    private javax.swing.JLabel L;
    private javax.swing.JLabel M;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel data2;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel g;
    private javax.swing.JLabel h;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel j;
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
    private javax.swing.JLabel k;
    private javax.swing.JLabel l;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel n;
    private javax.swing.JLabel o;
    private javax.swing.JLabel p;
    private javax.swing.JLabel q;
    private javax.swing.JLabel r;
    private javax.swing.JLabel s;
    private javax.swing.JLabel t;
    private javax.swing.JLabel u;
    private javax.swing.JLabel v;
    private javax.swing.JLabel w;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y1;
    private javax.swing.JLabel z;
    // End of variables declaration//GEN-END:variables
}
