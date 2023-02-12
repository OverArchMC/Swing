import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class SwingControlDemo implements ActionListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JButton button1, button2, button3, button4, button5;
    private JLabel label1, label2;
    private int WIDTH=600;
    private int HEIGHT=600;


    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout(0, 0));
        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2, 3));


        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        mainFrame.add(button1, BorderLayout.PAGE_START);
        mainFrame.add(button3, BorderLayout.PAGE_END);

        label1 = new JLabel("Label 1");
        label2 = new JLabel("Label 2");

        //mainFrame.setLayout(new GridLayout(2, 3));
        panelGrid.add(button2);
        panelGrid.add(label1);
        panelGrid.add(button4);
        panelGrid.add(label2);
        panelGrid.add(button5);

        mainFrame.add(panelGrid);

//        cut = new JMenuItem("cut");
//        copy = new JMenuItem("copy");
//        paste = new JMenuItem("paste");
//        selectAll = new JMenuItem("selectAll");
//        cut.addActionListener(this);
//        copy.addActionListener(this);
//        paste.addActionListener(this);
//        selectAll.addActionListener(this);
//
//        mb = new JMenuBar();
//        file = new JMenu("File");
//        edit = new JMenu("Edit");
//        help = new JMenu("Help");
//        edit.add(cut);
//        edit.add(copy);
//        edit.add(paste);
//        edit.add(selectAll);
//        mb.add(file);
//        mb.add(edit);
//        mb.add(help);


        //mainFrame.add(mb);
        //mainFrame.setJMenuBar(mb);

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // mainFrame.add(headerLabel);
//        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        headerLabel.setText("Control in action: Button");

//        JButton okButton = new JButton("OK");
//        JButton submitButton = new JButton("Submit");
//        JButton cancelButton = new JButton("Cancel");
//
//        okButton.setActionCommand("OK");
//        submitButton.setActionCommand("Submit");
//        cancelButton.setActionCommand("Cancel");
//
//        okButton.addActionListener(new ButtonClickListener());
//        submitButton.addActionListener(new ButtonClickListener());
//        cancelButton.addActionListener(new ButtonClickListener());
//
//        controlPanel.add(okButton);
//        controlPanel.add(submitButton);
//        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == cut)
//            ta.cut();
//        if (e.getSource() == paste)
//            ta.paste();
//        if (e.getSource() == copy)
//            ta.copy();
//        if (e.getSource() == selectAll)
//            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}