
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.awt.geom.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Hashtable;
import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;
import static javax.swing.GroupLayout.Alignment.LEADING;

import java.applet.Applet;

public class GUI_1 implements Runnable {
    public int diffLvl;
    public int delay = 1000;
    public int count = 4;
    public int timercount = 0;
    public  int ic;
    public int i=0;
    public int j=0;
    public int selected;
    public String playername;
    Color [] Randcol;
    public int k = 0;
    public int score =0;
    public  String colortopick [] = {"1","2","3","4","5","6","7","8","9","10"};
    public  JList boxes;
    JPanel[] boxArray = new JPanel[10];
    public int [] selectedarray;
    public    int selectcount = 0;
    public   String addtolist;
    public String level;
    Color [] RandColtoshuffle;
    Color [] selectedColours;
    Color [] toPick;
    String htmlBody = "<table>"+"<div id='div1'>"+"<tr>"+"<th>Name</th>"+"<th class=t1>Last level</th>"+"<th class=t1>Score</th>"+"</tr>"+"</div>"+"</table>";
    Document doc = Jsoup.parseBodyFragment(htmlBody);

    public  JPanel createSquareJPanel(Color color, int size) {
        JPanel tempPanel = new JPanel();
        tempPanel.setBackground(color);
        tempPanel.setMinimumSize(new Dimension(size, size));
        tempPanel.setMaximumSize(new Dimension(size*2,size));
        tempPanel.setPreferredSize(new Dimension(size, size));
        return tempPanel;
                                                            }
                                                            public class myCanvas extends JPanel {
                                                                @Override
                                                                public void paint(Graphics g) {
                                                                    // step one of the recipe; cast Graphics object as Graphics2D
                                                                    Graphics2D g2d = (Graphics2D) g;

                                                                    // step two-set the graphics context
                                                                    g2d.setColor(Color.red); //setting context

                                                                    //step three-render something
                                                                    g2d.fill(new Rectangle2D.Float(225.0f, 150.0f, 75.0f, 75.0f));
                                                                    //Arc2D is the abstract superclass for all objects that store a 2D arc defined by a framing rectangle, start angle,
                                                                    //angular extent (length of the arc), and a closure type (OPEN, CHORD, or PIE).
                                                                    //(new Arc2D.Double(x, y,rectwidth,rectheight,90, 135, Arc2D.OPEN))
                                                                    g2d.setColor(Color.green);
                                                                    g2d.fill(new Arc2D.Double(100, 100, 50, 100, 90, 135, Arc2D.PIE));
                                                                    g2d.fill(new Arc2D.Double(400, 100, 50, 100, 315, 135, Arc2D.PIE));
                                                                    g2d.setColor(Color.blue);
                                                                    // (x, y,rectwidth,rectheight));
                                                                    g2d.fill(new Ellipse2D.Double(150, 50, 100, 60));
                                                                    g2d.fill(new Ellipse2D.Double(275, 50, 100, 60));
                                                                    //setRoundRect(double a, double y, double w, double h, double arcWidth, double arcHeight)
                                                                    g2d.draw(new RoundRectangle2D.Double(125, 10, 300, 300, 20, 20));
                                                                    // create new QuadCurve2D.Float
                                                                    QuadCurve2D q = new QuadCurve2D.Float();
                                                                    // draw QuadCurve2D.Float with set coordinates
                                                                    q.setCurve(130, 200, 300, 300, 370, 200);
                                                                    g2d.draw(q);
    //        JPanel canvas2 = new JPanel();
    //        canvas2.add((Graphics)g2d);
    }
        }

    public void run() {

        class change {
            public int count1 = 0;
            public int count2 = 0;
                    }
        change se1 = new change();
        Random rand = new Random();

        // GUI Structure //
        JFrame GUI = new JFrame("Gui");
        GUI.setSize(700, 700);
        JPanel startPanel = new JPanel();
        JLabel namelbl = new JLabel ("Enter your name:");
        JLabel labelStart = new JLabel("Choose your difficulty:");
        JTextField name = new JTextField(15);
        JSlider dificulty = new JSlider(0,10);
        final DefaultListModel  model = new DefaultListModel();
        JList  choices;
        choices = new JList( model );
        JPanel secondPanel = new JPanel();
        JPanel thirdPanel = new JPanel(new GridLayout(2,0,10,30));
        JPanel colorPanel = new JPanel();
        JPanel fourthPanel = new JPanel(new GridLayout(2,1));
        JPanel topPanel = new JPanel(new GridLayout(2,1));
        JPanel botomPanel = new JPanel(new GridLayout(2,0));
        JButton addTopick = new JButton ("PICK");
        JButton removeItem = new JButton("Remove");

        JScrollPane scrollPane = new JScrollPane();
        // GUI.pack();

        //dificulty.addChangeListener(true);
//Turn on labels at major tick marks.
        dificulty.setMajorTickSpacing(1);
        dificulty.setPaintTicks(true);
        dificulty.setPaintLabels(true);
        dificulty.setSnapToTicks(true);
        Hashtable labelTable = new Hashtable();
        labelTable.put( 0, new JLabel("Easy") );
        labelTable.put( 5, new JLabel("Medium"));
        labelTable.put( 10, new JLabel("Hard"));
        dificulty.setLabelTable( labelTable );
        JButton submit = new JButton("Play");
        JButton submitC = new JButton ("Submit");
        JLabel countdown = new JLabel("Game starts in...");
        JButton playAgain = new JButton("play again");

        submitC.addActionListener(actionEvent3 ->{
            for (int g=0;g< selectedColours.length;g++) {
                selectedColours [g] = toPick[selectedarray[g    ]];
            }
            if (Arrays.equals(selectedColours,Randcol));
            System.out.println("equals");
            score = score +100;
            doc.select("tr").last().after("<tr><td>"+playername+"</td><td>"+level+"</td><td>"+score+"</td></tr>");
            System.out.print(doc.toString());
            //System.out.println("in paint");
           myCanvas canvas = new myCanvas();
            //'[final Dimension preferredSize = canvas.getPreferredSize();
            thirdPanel.setVisible(false);
            canvas.setVisible(true);
            fourthPanel.add(canvas);
            fourthPanel.add(playAgain);

//              fourthPanel.add(canvas);
//              fourthPanel.setVisible(true);
            GUI.add(fourthPanel);
     //     GUI.add(new myCanvas());

        });

        addTopick.addActionListener(actionEvent2 -> {
            if (selectcount < diffLvl) {
                int selectedval = boxes.getSelectedIndex();
                selectedarray[selectcount] = selectedval;
                selectcount++;
                for( Object select : boxes.getSelectedValuesList()) {
                    model.addElement((String) select);
                }  };
        });

        removeItem.addActionListener(actionEvent3 ->{
            int select;
            for( Object select1 : choices.getSelectedValuesList()) {
                model.removeElement((String) select1);
                selectcount--;
            }
            });

// START LAYOUT
     //   dificulty.setBorder(BorderFactory.createTitledBorder("Choose your dificulty"));

        GroupLayout layout = new GroupLayout(startPanel);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.linkSize(SwingConstants.VERTICAL,name,dificulty);
        layout.linkSize(SwingConstants.VERTICAL,namelbl,labelStart);
        layout.linkSize(SwingConstants.HORIZONTAL,name,dificulty);
        layout.linkSize(SwingConstants.HORIZONTAL,namelbl,labelStart);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING) //#everything else to the right
                .addGroup(layout.createSequentialGroup()
                        .addComponent(namelbl)
                        .addComponent(name)
                        .addComponent(submit))
                        .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)//#row 2
                              .addComponent(labelStart)
                                        .addComponent(dificulty)

                        ));


        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(namelbl)
                        .addComponent(name)
                        .addComponent(submit))
                        .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(LEADING)
                                .addComponent(labelStart)
                                .addComponent(dificulty)

                         ))
                        );

        startPanel.setLayout(layout);
 final Dimension preferdsize = startPanel.getPreferredSize();
        startPanel.setVisible(true);
        GUI.add(startPanel);
        ///end of layout

//        startPanel.add(namelbl);
//        startPanel.add(name);
//        startPanel.add(labelStart);
//        startPanel.add(low);
//        startPanel.add(med);
//        startPanel.add(high);
//        startPanel.add(dificulty);
//        startPanel.add(submit);

        secondPanel.add(countdown);



        ActionListener taskperformer3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        }};

        boxes = new JList(colortopick);
        boxes.setVisibleRowCount(-1);
        boxes.setSelectedIndex(2);
        boxes.setFixedCellWidth(140);
        boxes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        boxes.setLayoutOrientation(JList.VERTICAL);
        boxes.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {


                if (e.getValueIsAdjusting() == false) {
                    if (e.getSource() == boxes) {
                        for(int L = 0; L < 10; L++)
                        {
                            System.out.println("L VALUE="+L);
                            if (L == boxes.getSelectedIndex())
                            {
                                boxArray[L].setVisible(true);
                                System.out.println("im here4 IS VISIBLE"+L);
                            }
                            else
                            {
                                boxArray[L].setVisible(false);
                                System.out.println("im here4 IS  nt VISIBLE"+L);
                            }
                        }
                    }
                }
                System.out.println("im here4"+boxes.getSelectedIndex());
            }});

        scrollPane.setViewportView(boxes);
        ActionListener taskperformer2 = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

if(i < ic)
                {
                    Color randomcolor = new Color(rand.nextInt());
                    Color randomcolor2 = new Color(rand.nextInt());
                    Randcol[i] = randomcolor;
                    RandColtoshuffle[i] = randomcolor2;
                    secondPanel.setBackground(Randcol[i]);
    i++;
    System.out.println("im here3");
                }

 else{

    for(int i = 0; i < Randcol.length; i++)
    {
        toPick[i] = Randcol[i];
    }                                               ///ADDING ARRAYS
    for(int i = 0; i< RandColtoshuffle.length; i++) ///
    {
       toPick[i+Randcol.length] = RandColtoshuffle[i];
    }
    for (int b=0;b<toPick.length;b++) {
        boxArray[b] = createSquareJPanel(toPick[b], 150);
    }


    for(int i = 0; i < 10; i++)
    {
        boxArray[i].setVisible(false);
        colorPanel.add(boxArray[i]);
            }

    botomPanel.add(addTopick);
    botomPanel.add(removeItem);
    botomPanel.add(colorPanel);
    botomPanel.add(submitC);
    //topPanel.add(colorPanel);
    topPanel.add(scrollPane);
    topPanel.add(choices);
    thirdPanel.add(topPanel);
    thirdPanel.add(botomPanel);
    topPanel.setVisible(true);
    botomPanel.setVisible(true);
    GUI.add(thirdPanel);
    secondPanel.setVisible(false);
    thirdPanel.setVisible(true);
    Timer tc = (Timer) evt.getSource();
    tc.stop();
    Timer t3 = new Timer(2000,taskperformer3);
    t3.start();

         }
                }
                         };

        ActionListener taskperformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                timercount++;
                se1.count1--;
                System.out.println("timercount=" + timercount);
                switch (se1.count1) {

                    case 4:
                        System.out.println("im here");
                        secondPanel.setBackground(Color.white);
                        countdown.setText("3");
                        break;
                    case 3:
                        countdown.setText("2");
                        break;
                    case 2:
                        countdown.setText("1");
                        break;
                    case 1:
                        countdown.setText("Start");
                        break;
                    case 0:

                        Timer t = (Timer) evt.getSource();
                        t.stop();
                        Timer timer2 = new Timer(500, taskperformer2);
                        timer2.start();
                        System.out.println("imhere2");
                        break;
                    }
            }
        };


                submit.addActionListener(actionEvent1 -> { // lambda expression as ACTIONLISTENER has only one method "actionPerformed"
            playername = name.getText();
            diffLvl = dificulty.getValue();
            if (diffLvl>7)
            {
             level = "Expert";
            }
            else if(diffLvl>4)
            {
                level = "Normal";
                    }
                    else    {
                     level = "Begginer";
                            }
            Randcol = new Color [diffLvl];
            RandColtoshuffle = new Color [diffLvl];
            toPick= new Color [RandColtoshuffle.length + Randcol.length];
            selectedColours = new Color [diffLvl];
            se1.count1 = 5;
            selectedarray = new int [diffLvl];
            startPanel.setVisible(false);
            GUI.add(secondPanel);
            secondPanel.setVisible(true);
             ic = diffLvl;
             GUI.setSize(700,700);
            Timer timer1 = new Timer(delay, taskperformer);
            timer1.start();
            System.out.println(playername+diffLvl);

        });
                //GUI.pack();
        GUI.pack();
                GUI.setVisible(true);
    }

    public static void main(String[] args) {
        GUI_1 se = new GUI_1();
        SwingUtilities.invokeLater(se);

    }
}