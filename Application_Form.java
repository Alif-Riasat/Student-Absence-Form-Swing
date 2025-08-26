package application_form;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application_Form {
    public static void main(String[] args) {      
        JFrame f=new JFrame("Absence Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,400);
        
        f.setLayout(new BorderLayout());
        
        JMenuBar menuBar=new JMenuBar();
        
        JMenu deptMenu=new JMenu("Select Department");
        JMenuItem item1=new JMenuItem("CSE");
        JMenuItem item2=new JMenuItem("ICT");
        JMenuItem item3=new JMenuItem("Environemental Science");
        
        deptMenu.add(item1);
        deptMenu.add(item2);
        deptMenu.add(item3);
        menuBar.add(deptMenu);
        f.setJMenuBar(menuBar);
        
        JPanel p=new JPanel(new GridLayout(7,2,10,10));
        
        JLabel nameLabel=new JLabel("Name: ");
        JTextField nameField=new JTextField();
        
        JLabel idLabel=new JLabel("ID: ");
        JTextField idField=new JTextField();
        
        JLabel deptLabel=new JLabel("Departments: ");
        JLabel selectedDept=new JLabel("Not Selected");
        
        JLabel batchLabel=new JLabel("Batch: ");
        JTextField batchField=new JTextField();
        
        JLabel dateLabel=new JLabel("Date(DD-MM-YYYY): ");
        JTextField dateField=new JTextField();
        
        JLabel reasonLabel=new JLabel("Absent Reason: ");
        JTextField reasonField=new JTextField();
        
        JButton submit=new JButton("Submit");
        
        p.add(nameLabel);
        p.add(nameField);
        
        p.add(idLabel);
        p.add(idField);
        
        p.add(deptLabel);
        p.add(selectedDept);
        
        p.add(batchLabel);
        p.add(batchField);
        
        p.add(dateLabel);
        p.add(dateField);
        
        p.add(reasonLabel);
        p.add(reasonField);
        
        p.add(new JLabel());
        p.add(submit);
        
        f.add(p,BorderLayout.CENTER);
        f.setVisible(true);
        ActionListener deptListener = e -> {
            String selected = ((JMenuItem) e.getSource()).getText();
            selectedDept.setText(selected);
            JOptionPane.showMessageDialog(f, "Department Selected: " + selected);
        };

        item1.addActionListener(deptListener);
        item2.addActionListener(deptListener);
        item3.addActionListener(deptListener);

        submit.addActionListener(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            String department = selectedDept.getText();
            String batch = batchField.getText();
            String date = dateField.getText();
            String reason = reasonField.getText();

            JOptionPane.showMessageDialog(f, "Submitted:\n"
                    + "Name: " + name + "\n"
                    + "ID: " + id + "\n"
                    + "Department: " + department + "\n"
                    + "Batch: " + batch + "\n"
                    + "Date: " + date + "\n"
                    + "Reason of Absence: " + reason);
        });
        
        ;
        
    }
    
}
