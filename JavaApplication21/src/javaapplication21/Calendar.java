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
        setResizable(false);
        Label1();
        setLocationRelativeTo(null);

    }

    public void den(int y, int m) {

        LinkedList<String> d = new LinkedList<>();
        //ot startowata stranica ot tam ste naprawim default tozi mesec
        //String today = date.getDayOfWeek().toString();
        LocalDate someday = LocalDate.of(y, m, 1);//dneshna data
        String day = someday.getDayOfWeek().toString();
        //System.out.println(day);
        String h1;
        /*
        proverqvame kolko dni ima mesetsa
         */
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            for (int i = 1; i <= 37; i++) {
                if (i <= 30) {
                    h1 = Integer.toString(i);
                    d.add(h1);
                } else {
                    d.add(" ");
                }
            }
        } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            for (int i = 1; i <= 37; i++) {
                if (i <= 31) {
                    h1 = Integer.toString(i);
                    d.add(h1);
                } else {
                    d.add(" ");
                }
            }
        } else {
            //dali godinata e visokosna ili ne
            int r;
            if (y % 4 == 0) {
                r = 29;
            } else {
                r = 28;
            }
            for (int i = 1; i <= 37; i++) {
                if (i <= r) {
                    h1 = Integer.toString(i);
                    d.add(h1);
                } else {
                    d.add(" ");
                }
            }
        }
        zap(d, day);
        //vzima vsichki dni za nastoqshtiq mesetc na koito sme
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
        L.setText(d.get(11));
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
        inew.setText(d.get(34));
        J.setText(d.get(35));
        K.setText(d.get(36));
        String m1 = m + "";
        if (m >= 1 && m < 10) {
            m1 = "0" + m;
        }
        data2.setText(m1 + "/" + y);

    }

    //
    public void zap(LinkedList d, String day) {
        if ("MONDAY".equals(day)) {
            //jLabel1.setText("1");
        } else if (day.equals("TUESDAY")) {
            //jLabel5.setText("1");
            d.addFirst(" ");
        } else if (day.equals("WEDNESDAY")) {
            //jLabel6.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
        } else if (day.equals("THURSDAY")) {
            //jLabel7.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
        } else if (day.equals("FRIDAY")) {
            //jLabel8.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
        } else if (day.equals("SATURDAY")) {
            //jLabel9.setText("1");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");
            d.addFirst(" ");

        } else if (day.equals("SUNDAY")) {
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
    public void Label1() {
        LocalDate date = LocalDate.now();
        String[] a;
        String str = date.toString();
        a = str.split("-");
        //ot startowata stranica ot tam ste naprawim default tozi mesec
        //String today = date.getDayOfWeek().toString();
        int y = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        den(y, m);
        textButtonsFalse();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        h = new javax.swing.JButton();
        v = new javax.swing.JButton();
        o = new javax.swing.JButton();
        i1 = new javax.swing.JButton();
        p = new javax.swing.JButton();
        w = new javax.swing.JButton();
        j = new javax.swing.JButton();
        q = new javax.swing.JButton();
        x = new javax.swing.JButton();
        k = new javax.swing.JButton();
        r = new javax.swing.JButton();
        y1 = new javax.swing.JButton();
        L = new javax.swing.JButton();
        s = new javax.swing.JButton();
        z = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        t = new javax.swing.JButton();
        A = new javax.swing.JButton();
        g = new javax.swing.JButton();
        n = new javax.swing.JButton();
        u = new javax.swing.JButton();
        B = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        a = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        b = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        C = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        D = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        E = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        F = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        G = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        H = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        inew = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        J = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        K = new javax.swing.JButton();
        c = new javax.swing.JButton();
        e = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        f = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        data2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(842, 585));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(14, 154, 161));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 585));

        jPanel4.setBackground(new java.awt.Color(28, 200, 208));

        h.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        h.setText("1");
        h.setBorder(null);
        h.setBorderPainted(false);
        h.setContentAreaFilled(false);
        h.setPreferredSize(new java.awt.Dimension(60, 49));
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });

        v.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        v.setText("1");
        v.setBorder(null);
        v.setBorderPainted(false);
        v.setContentAreaFilled(false);
        v.setPreferredSize(new java.awt.Dimension(60, 49));
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });

        o.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        o.setText("1");
        o.setBorder(null);
        o.setBorderPainted(false);
        o.setContentAreaFilled(false);
        o.setPreferredSize(new java.awt.Dimension(60, 49));
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });

        i1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        i1.setText("1");
        i1.setBorder(null);
        i1.setBorderPainted(false);
        i1.setContentAreaFilled(false);
        i1.setPreferredSize(new java.awt.Dimension(60, 49));
        i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1ActionPerformed(evt);
            }
        });

        p.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        p.setText("1");
        p.setBorder(null);
        p.setBorderPainted(false);
        p.setContentAreaFilled(false);
        p.setPreferredSize(new java.awt.Dimension(60, 49));
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        w.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        w.setText("1");
        w.setBorder(null);
        w.setBorderPainted(false);
        w.setContentAreaFilled(false);
        w.setPreferredSize(new java.awt.Dimension(60, 49));
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });

        j.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        j.setText("1");
        j.setBorder(null);
        j.setBorderPainted(false);
        j.setContentAreaFilled(false);
        j.setPreferredSize(new java.awt.Dimension(60, 49));
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });

        q.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        q.setText("1");
        q.setBorder(null);
        q.setBorderPainted(false);
        q.setContentAreaFilled(false);
        q.setPreferredSize(new java.awt.Dimension(60, 49));
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });

        x.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        x.setText("1");
        x.setBorder(null);
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.setPreferredSize(new java.awt.Dimension(60, 49));
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        k.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        k.setText("1");
        k.setBorder(null);
        k.setBorderPainted(false);
        k.setContentAreaFilled(false);
        k.setPreferredSize(new java.awt.Dimension(60, 49));
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });

        r.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        r.setText("1");
        r.setBorder(null);
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        r.setPreferredSize(new java.awt.Dimension(60, 49));
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });

        y1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        y1.setText("1");
        y1.setBorder(null);
        y1.setBorderPainted(false);
        y1.setContentAreaFilled(false);
        y1.setPreferredSize(new java.awt.Dimension(60, 49));
        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });

        L.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        L.setText("1");
        L.setBorder(null);
        L.setBorderPainted(false);
        L.setContentAreaFilled(false);
        L.setPreferredSize(new java.awt.Dimension(60, 49));
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        s.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        s.setText("1");
        s.setBorder(null);
        s.setBorderPainted(false);
        s.setContentAreaFilled(false);
        s.setPreferredSize(new java.awt.Dimension(60, 49));
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        z.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        z.setText("1");
        z.setBorder(null);
        z.setBorderPainted(false);
        z.setContentAreaFilled(false);
        z.setPreferredSize(new java.awt.Dimension(60, 49));
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });

        m1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        m1.setText("1");
        m1.setBorder(null);
        m1.setBorderPainted(false);
        m1.setContentAreaFilled(false);
        m1.setPreferredSize(new java.awt.Dimension(60, 49));
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        t.setText("1");
        t.setBorder(null);
        t.setBorderPainted(false);
        t.setContentAreaFilled(false);
        t.setPreferredSize(new java.awt.Dimension(60, 49));
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        A.setText("1");
        A.setBorder(null);
        A.setBorderPainted(false);
        A.setContentAreaFilled(false);
        A.setPreferredSize(new java.awt.Dimension(60, 49));
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        g.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        g.setText("1");
        g.setBorder(null);
        g.setBorderPainted(false);
        g.setContentAreaFilled(false);
        g.setPreferredSize(new java.awt.Dimension(60, 49));
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        n.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        n.setText("1");
        n.setBorder(null);
        n.setBorderPainted(false);
        n.setContentAreaFilled(false);
        n.setPreferredSize(new java.awt.Dimension(60, 49));
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        u.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        u.setText("1");
        u.setBorder(null);
        u.setBorderPainted(false);
        u.setContentAreaFilled(false);
        u.setPreferredSize(new java.awt.Dimension(60, 49));
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        B.setText("1");
        B.setBorder(null);
        B.setBorderPainted(false);
        B.setContentAreaFilled(false);
        B.setPreferredSize(new java.awt.Dimension(60, 49));
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(28, 200, 208));

        a.setBackground(new java.awt.Color(14, 154, 161));
        a.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        a.setText("1");
        a.setBorder(null);
        a.setBorderPainted(false);
        a.setContentAreaFilled(false);
        a.setPreferredSize(new java.awt.Dimension(60, 49));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(28, 200, 208));
        jPanel5.setPreferredSize(new java.awt.Dimension(60, 49));

        b.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        b.setText("1");
        b.setBorder(null);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.setPreferredSize(new java.awt.Dimension(60, 49));
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.setBackground(new java.awt.Color(28, 200, 208));

        C.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        C.setText("1");
        C.setBorder(null);
        C.setBorderPainted(false);
        C.setContentAreaFilled(false);
        C.setPreferredSize(new java.awt.Dimension(60, 49));
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel14.setBackground(new java.awt.Color(28, 200, 208));

        D.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        D.setText("1");
        D.setBorder(null);
        D.setBorderPainted(false);
        D.setContentAreaFilled(false);
        D.setPreferredSize(new java.awt.Dimension(60, 49));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.setBackground(new java.awt.Color(28, 200, 208));

        E.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        E.setText("1");
        E.setBorder(null);
        E.setBorderPainted(false);
        E.setContentAreaFilled(false);
        E.setPreferredSize(new java.awt.Dimension(60, 49));
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel16.setBackground(new java.awt.Color(28, 200, 208));

        F.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        F.setText("1");
        F.setBorder(null);
        F.setBorderPainted(false);
        F.setContentAreaFilled(false);
        F.setPreferredSize(new java.awt.Dimension(60, 49));
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel17.setBackground(new java.awt.Color(28, 200, 208));

        G.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        G.setText("1");
        G.setBorder(null);
        G.setBorderPainted(false);
        G.setContentAreaFilled(false);
        G.setPreferredSize(new java.awt.Dimension(60, 49));
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel19.setBackground(new java.awt.Color(28, 200, 208));

        H.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        H.setText("1");
        H.setBorder(null);
        H.setBorderPainted(false);
        H.setContentAreaFilled(false);
        H.setPreferredSize(new java.awt.Dimension(60, 49));
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel20.setBackground(new java.awt.Color(28, 200, 208));

        inew.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        inew.setText("1");
        inew.setBorder(null);
        inew.setBorderPainted(false);
        inew.setContentAreaFilled(false);
        inew.setPreferredSize(new java.awt.Dimension(60, 49));
        inew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.setBackground(new java.awt.Color(28, 200, 208));

        J.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        J.setText("1");
        J.setBorder(null);
        J.setBorderPainted(false);
        J.setContentAreaFilled(false);
        J.setPreferredSize(new java.awt.Dimension(60, 49));
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel22.setBackground(new java.awt.Color(28, 200, 208));

        K.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        K.setText("1");
        K.setBorder(null);
        K.setBorderPainted(false);
        K.setContentAreaFilled(false);
        K.setPreferredSize(new java.awt.Dimension(60, 49));
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        c.setBackground(new java.awt.Color(14, 154, 161));
        c.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        c.setText("1");
        c.setBorder(null);
        c.setBorderPainted(false);
        c.setContentAreaFilled(false);
        c.setPreferredSize(new java.awt.Dimension(60, 49));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        e.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        e.setText("1");
        e.setBorder(null);
        e.setBorderPainted(false);
        e.setContentAreaFilled(false);
        e.setPreferredSize(new java.awt.Dimension(60, 49));
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        d1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        d1.setText("1");
        d1.setBorder(null);
        d1.setBorderPainted(false);
        d1.setContentAreaFilled(false);
        d1.setPreferredSize(new java.awt.Dimension(60, 49));
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        f.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        f.setText("1");
        f.setBorder(null);
        f.setBorderPainted(false);
        f.setContentAreaFilled(false);
        f.setPreferredSize(new java.awt.Dimension(60, 49));
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(28, 200, 208));

        jButton2.setBackground(new java.awt.Color(10, 91, 99));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        data2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        data2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data2.setText("jLabel1");

        jButton1.setBackground(new java.awt.Color(10, 91, 99));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(28, 200, 208));

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
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(21, 21, 21))
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void click() {
        Appointment a = new Appointment();
        a.show();
        dispose();
    }

    //SLAGA BUTONITE DA MOGAT DA SE NATISKAT
    public void textButtonsTrue() {
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d1.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);
        G.setEnabled(true);
        H.setEnabled(true);
        inew.setEnabled(true);
        J.setEnabled(true);
        K.setEnabled(true);
    }
    //SLAGA GI DA NE MOGAT DA SE NATISKAT

    public void textButtonsFalse() {
        if (a.getText().equals(" ")) {
            a.setEnabled(false);

            // a.setBackground(Color.decode("#0E9AA1"));
        }
        if (b.getText().equals(" ")) {
            b.setEnabled(false);
        }
        if (c.getText().equals(" ")) {
            c.setEnabled(false);
        }
        if (d1.getText().equals(" ")) {
            d1.setEnabled(false);
        }
        if (e.getText().equals(" ")) {
            e.setEnabled(false);
        }
        if (f.getText().equals(" ")) {
            f.setEnabled(false);
        }
        if (C.getText().equals(" ")) {
            C.setEnabled(false);
        }
        if (D.getText().equals(" ")) {
            D.setEnabled(false);
        }
        if (E.getText().equals(" ")) {
            E.setEnabled(false);
        }
        if (F.getText().equals(" ")) {
            F.setEnabled(false);
        }
        if (G.getText().equals(" ")) {
            G.setEnabled(false);
        }
        if (H.getText().equals(" ")) {
            H.setEnabled(false);
        }
        if (inew.getText().equals(" ")) {
            inew.setEnabled(false);
        }
        if (J.getText().equals(" ")) {
            J.setEnabled(false);
        }
        if (K.getText().equals(" ")) {
            K.setEnabled(false);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //OTIVA NA PEDEN MESETS I PROVERQVA KOI BUTONI NI TRQBVAT
        //tsvqt 15EBE8 s hex code
        textButtonsTrue();
        String w1 = data2.getText();
        //int r = Integer.parseInt(w);
        String[] sp = w1.split("/");
        int r2 = Integer.parseInt(sp[0]);
        int x2 = Integer.parseInt(sp[1]);
        if (r2 == 1) {
            r2 = 13;
            x2 = x2 - 1;
        }
        den(x2, r2 - 1);
        textButtonsFalse();
        //prowerqwame kolko dni ima
        //s metod towa koeto prawim i w nachaloto

        //z vawisimost koi e denq q 7 if z parwite 7 dni ot sedmicata
        //jLabel1.setText("1");
        //System.out.println(someday.getDayOfWeek().toString());
        //jLabel1.setText(a[2]);
        //jLabel2.setText(a[])
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //OTIVA NA SLEDVASHT MESETS
        textButtonsTrue();
        String w1 = data2.getText();
        String[] sp = w1.split("/");
        int r2 = Integer.parseInt(sp[0]);
        int x2 = Integer.parseInt(sp[1]);
        if (r2 == 12) {
            r2 = 0;
            x2 = x2 + 1;
        }
        den(x2, r2 + 1);
        textButtonsFalse();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void data_set(String a) {
        Methods set_data = new Methods();
        set_data.setD(a);
    }

    private void jLabel4VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jLabel4VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4VetoableChange
    public String zero(String data1) {
        String[] data2 = data1.split("/");
        if (Integer.parseInt(data2[0]) >= 1 && Integer.parseInt(data2[0]) <= 9) {
            data2[0] = "0" + data2[0];
        }
        data1 = data2[0] + "/" + data2[1] + "/" + data2[2];
        return data1;
    }
    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        String a2 = E.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();
    }//GEN-LAST:event_EActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        String a2 = c.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click(); //tsvqt butoni 0E9AA1 hex   

    }//GEN-LAST:event_cActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        String a2 = x.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();
    }//GEN-LAST:event_xActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        String a2 = b.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();
    }//GEN-LAST:event_bActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        String a2 = d1.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();
    }//GEN-LAST:event_d1ActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        String a2 = C.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();
    }//GEN-LAST:event_CActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        String a2 = e.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click(); // TODO add your handling code here:
    }//GEN-LAST:event_eActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        String a2 = f.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();  // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        String a2 = g.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        String a2 = h.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_hActionPerformed

    private void i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1ActionPerformed
        String a2 = i1.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_i1ActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        String a2 = j.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_jActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        String a2 = k.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_kActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        String a2 = L.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();   // TODO add your handling code here:
    }//GEN-LAST:event_LActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        String a2 = m1.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_m1ActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        String a2 = n.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();
    }//GEN-LAST:event_nActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        // TODO add your handling code here:
        String a2 = o.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();
    }//GEN-LAST:event_oActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        String a2 = p.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();
    }//GEN-LAST:event_pActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        String a2 = q.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();
    }//GEN-LAST:event_qActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        String a2 = r.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();
    }//GEN-LAST:event_rActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        String a2 = s.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_sActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        String a2 = t.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_tActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        String a2 = u.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_uActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        String a2 = v.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_vActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        String a2 = w.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_wActionPerformed

    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        String a2 = y1.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_y1ActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        String a2 = z.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_zActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        String a2 = A.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        String a2 = B.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        String a2 = D.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        String a2 = F.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        String a2 = G.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        String a2 = H.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_HActionPerformed

    private void inewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inewActionPerformed
        String a2 = inew.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_inewActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        String a2 = J.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        String a2 = K.getText();
        a2 += "/" + data2.getText();
        data_set(a2);
        click();         // TODO add your handling code here:
    }//GEN-LAST:event_KActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        //AKO BUTONA E NATISNAT VZIMA NEGOVATA DATA+MESETSA I GODINATA I GI PRASHTA V APPOINTMENT NA LEIBULA
        /*CLICK() E FUNKTSIQ ZA ZATVARQNE NA CALENDAR
        I OTVARQNE NA APPOINTMENT ZASHTOTTO
        Q IZPOLZVAME NA VSEKI BUTON
        VSICHKI BUTONI SA S EDNAKUV KOD
        */
        String a2 = a.getText();
        a2 += "/" + data2.getText();
        a2 = zero(a2);
        data_set(a2);
        click();
    }//GEN-LAST:event_aActionPerformed

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
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
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
    private javax.swing.JButton inew;
    private javax.swing.JButton j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton k;
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
