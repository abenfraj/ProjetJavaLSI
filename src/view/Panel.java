package view;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    String[] shapeSelectedList = {" Choisir une forme","Triangle","Circle","Ellipsis","Square","Polygon","Rectangle"};
    JComboBox<String> combo = new JComboBox<String>(shapeSelectedList);
    JButton jButton = new JButton("Afficher image");


    public Panel() {
        add(jButton);
        jButton.setBounds(700,700,200,50);
        add(combo);
        combo.setSelectedIndex(0);
        combo.setBounds(10,10,200,50);
        this.setPreferredSize(new Dimension(1000,700));
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        JComboBox jComboBox = (JComboBox) this.getComponent(1);
        Graphics2D g2D = (Graphics2D) g;

        if(jComboBox.getSelectedItem().equals("Square")) {
            g2D.drawRect(300,300,100,100);
        }

        if(jComboBox.getSelectedItem().equals("Rectangle")) {
            g2D.drawRect(100,200,100,200);
        }

        if(jComboBox.getSelectedItem().equals("Triangle")) {
            int[] xPoints = {150,250,300};
            int[] yPoints = {300,150,300};
            g2D.drawPolygon(xPoints,yPoints,3);
        }

        if(jComboBox.getSelectedItem().equals("Circle")) {
            g2D.drawOval(500,500,100,100);
        }

    }

    public JComboBox<String> getCombo() {
        return combo;
    }

    public void setCombo(JComboBox<String> combo) {
        this.combo = combo;
    }

    public JButton getjButton() {
        return jButton;
    }

    public void setjButton(JButton jButton) {
        this.jButton = jButton;
    }
}

/*
    private static void createAndShowGui() {
        JFrame frame = new JFrame("Graph");

        JSplitPane splitPane;
        App app;
        JPanel bottomPanel;

        JPanel inputPanel;
        app = new App();

        ArrayList<String> list_combobox = new ArrayList<>();
        for(Vue_sommet s : app.vue_graphe.getVue_sommets()){
            list_combobox.add(s.getNom());
        }

        Set<String> li = new HashSet<>();
        li.addAll(list_combobox);
        list_combobox.clear();
        list_combobox.addAll(li);


        JButton jButton = new JButton("Reset");


        app.display_kruskal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(app.active_kruskal == false) {
                    app.update(frame.getGraphics(),null,null);
                    app.active_kruskal = true;
                }else {
                    app.repaint();
                    app.label_acpm.setText("ACPM : " + Integer.toString(app.vue_graphe.getGraphe().getAcpm()));
                    app.active_kruskal = false;
                }
            }
        });

        //trier par odre alphabetique
        Collections.sort(list_combobox);
        String test[] =  list_combobox.toArray(new String[0]);

        JComboBox comboBox_src = new JComboBox<String>(test);
        JComboBox comboBox_dest = new JComboBox<String>(test);

        comboBox_src.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String value = comboBox_src.getSelectedItem().toString();
                Vue_sommet vue_sommet = app.vue_graphe.getVue_sommets().stream().filter(s -> s.getNom().equals(value)).findFirst().get();
                app.update(frame.getGraphics(), vue_sommet, null);
            }
        });



        comboBox_dest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String value = comboBox_dest.getSelectedItem().toString();
                Vue_sommet vue_sommet = app.vue_graphe.getVue_sommets().stream().filter(s -> s.getNom().equals(value)).findFirst().get();
                app.update(frame.getGraphics(), null, vue_sommet);
                comboBox_src.setEnabled(false);
                comboBox_dest.setEnabled(false);

            }
        });

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.repaint();
                app.textArea.setText("");
                comboBox_dest.setEnabled(true);
                comboBox_src.setEnabled(true);

            }
        });

        splitPane = new JSplitPane();

        bottomPanel = new JPanel();
        inputPanel = new JPanel();

        frame.setPreferredSize(new Dimension(1500, 1005));
        frame.getContentPane().setLayout(new GridLayout());
        frame.getContentPane().add(splitPane);

        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(990);
        splitPane.setLeftComponent(app);
        splitPane.setRightComponent(bottomPanel);

        bottomPanel.add(inputPanel);
        bottomPanel.add(inputPanel, BorderLayout.NORTH);

        app.textArea.setPreferredSize(new Dimension(440, 800));
        //   app.textArea.setBorder(new LineBorder(Color.pink));
        bottomPanel.add(app.textArea, BorderLayout.SOUTH);

        inputPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 500));
        inputPanel.add(comboBox_src, BorderLayout.NORTH);
        inputPanel.add(comboBox_dest, BorderLayout.SOUTH);

        app.display_kruskal.setPreferredSize(new Dimension(100,20));
        bottomPanel.add(app.display_kruskal, BorderLayout.NORTH);
        jButton.setPreferredSize(new Dimension(100,20));

        bottomPanel.add(jButton);

        bottomPanel.add(app.label_acpm);

        comboBox_src.setPreferredSize(new Dimension(220, 50));
        comboBox_dest.setPreferredSize(new Dimension(220, 50));

        comboBox_src.setMaximumSize(new Dimension(200, 500));
        comboBox_dest.setMaximumSize(new Dimension(200, 500));


        //inputPanel.setBorder(new LineBorder(Color.red));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

 */
