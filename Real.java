import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Registration File
class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel title2;
    private JLabel name;
    private JTextField tname;
    private JLabel gname;
    private JTextField tgname;
    private JLabel mno;
    private JTextField tmno;
    private JTextField tage;
    private JTextField tdate;
    private JLabel gender;
    private JLabel age;
    private JLabel Date;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton other;
    private JLabel Remark;
    private JRadioButton paid;
    private JRadioButton anc;
    private JRadioButton ages;
    private JRadioButton borne;
    private ButtonGroup gengp;
    private ButtonGroup gengps;
    private JLabel add;
    private JTextArea tadd;
    private JLabel dept;
    private JCheckBox term;
    private JCheckBox ent;
    private JCheckBox medicine;
    private JCheckBox ong;
    private JCheckBox surgery;
    private JCheckBox dental;
    private JCheckBox accidentandemergeny;
    private JCheckBox otherdep;
    private JCheckBox ortho;

    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private Connection connec;

    // JFrame jf = new JFrame();
    // MyFrame.setSize(1650,1080);

    // constructor, to initialize the components
    // with default values.
    public MyFrame(Connection conn) {

        connec = conn;
        setTitle("Mirza Hospital");
        // setBounds(300, 200, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("REG. FORM");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(170, 20);
        c.add(title);
        title2 = new JLabel("PRESCRIPTION SLIP");
        title2.setFont(new Font("Arial", Font.PLAIN, 30));
        title2.setSize(300, 30);
        title2.setLocation(700, 20);
        c.add(title2);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(170, 90);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(270, 90);
        c.add(tname);

        gname = new JLabel("Guardian's Name");
        gname.setFont(new Font("Arial", Font.PLAIN, 20));
        gname.setSize(200, 20);
        gname.setLocation(170, 130);
        c.add(gname);

        tgname = new JTextField();
        tgname.setFont(new Font("Arial", Font.PLAIN, 15));
        tgname.setSize(190, 20);
        tgname.setLocation(370, 130);
        c.add(tgname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(170, 170);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(270, 170);
        c.add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(170, 210);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(300, 210);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(true);
        female.setSize(80, 20);
        female.setLocation(400, 210);
        c.add(female);

        other = new JRadioButton("Other");
        other.setFont(new Font("Arial", Font.PLAIN, 15));
        other.setSelected(true);
        other.setSize(85, 20);
        other.setLocation(500, 210);
        c.add(other);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        gengp.add(other);

        age = new JLabel("Age");
        age.setFont(new Font("Arial", Font.PLAIN, 20));
        age.setSize(100, 20);
        age.setLocation(170, 250);
        c.add(age);

        tage = new JTextField();
        tage.setFont(new Font("Arial", Font.PLAIN, 15));
        tage.setSize(90, 20);
        tage.setLocation(270, 250);
        c.add(tage);

        Date = new JLabel("Date");
        Date.setFont(new Font("Arial", Font.PLAIN, 20));
        Date.setSize(100, 20);
        Date.setLocation(450, 250);
        c.add(Date);

        tdate = new JTextField();
        tdate.setFont(new Font("Arial", Font.PLAIN, 15));
        tdate.setSize(90, 20);
        tdate.setLocation(500, 250);
        c.add(tdate);

        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(170, 290);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(270, 290);
        tadd.setLineWrap(true);
        c.add(tadd);

        dept = new JLabel("Dept.");
        dept.setFont(new Font("Arial", Font.PLAIN, 20));
        dept.setSize(100, 20);
        dept.setLocation(170, 380);
        c.add(dept);
        ent = new JCheckBox("ENT");
        ent.setFont(new Font("Arial", Font.PLAIN, 15));
        ent.setSize(250, 20);
        ent.setLocation(220, 410);
        c.add(ent);
        medicine = new JCheckBox("Medicine");
        medicine.setFont(new Font("Arial", Font.PLAIN, 15));
        medicine.setSize(250, 20);
        medicine.setLocation(220, 430);
        c.add(medicine);
        surgery = new JCheckBox("Surgery");
        surgery.setFont(new Font("Arial", Font.PLAIN, 15));
        surgery.setSize(250, 20);
        surgery.setLocation(220, 450);
        c.add(surgery);
        dental = new JCheckBox("Dental");
        dental.setFont(new Font("Arial", Font.PLAIN, 15));
        dental.setSize(250, 20);
        dental.setLocation(220, 470);
        c.add(dental);
        accidentandemergeny = new JCheckBox("Accidet & Emergency");
        accidentandemergeny.setFont(new Font("Arial", Font.PLAIN, 15));
        accidentandemergeny.setSize(250, 20);
        accidentandemergeny.setLocation(220, 490);
        c.add(accidentandemergeny);

        ong = new JCheckBox("O&G");
        ong.setFont(new Font("Arial", Font.PLAIN, 15));
        ong.setSize(250, 20);
        ong.setLocation(220, 510);
        c.add(ong);
        ortho = new JCheckBox("Orthopaedic");
        ortho.setFont(new Font("Arial", Font.PLAIN, 15));
        ortho.setSize(250, 20);
        ortho.setLocation(220, 530);
        c.add(ortho);
        otherdep = new JCheckBox("Other");
        otherdep.setFont(new Font("Arial", Font.PLAIN, 15));
        otherdep.setSize(250, 20);
        otherdep.setLocation(220, 550);
        c.add(otherdep);

        Remark = new JLabel("REMARK");
        Remark.setFont(new Font("Arial", Font.PLAIN, 20));
        Remark.setSize(100, 20);
        Remark.setLocation(550, 380);
        c.add(Remark);

        paid = new JRadioButton("paid");
        paid.setFont(new Font("Arial", Font.PLAIN, 15));
        paid.setSelected(true);
        paid.setSize(75, 20);
        paid.setLocation(550, 420);
        c.add(paid);

        anc = new JRadioButton("anc");
        anc.setFont(new Font("Arial", Font.PLAIN, 15));
        anc.setSelected(true);
        anc.setSize(75, 20);
        anc.setLocation(550, 450);
        c.add(anc);

        ages = new JRadioButton("ages");
        ages.setFont(new Font("Arial", Font.PLAIN, 15));
        ages.setSelected(true);
        ages.setSize(75, 20);
        ages.setLocation(550, 480);
        c.add(ages);

        borne = new JRadioButton("borne");
        borne.setFont(new Font("Arial", Font.PLAIN, 15));
        borne.setSelected(true);
        borne.setSize(75, 20);
        borne.setLocation(550, 510);
        c.add(borne);

        gengps = new ButtonGroup();
        gengps.add(paid);
        gengps.add(anc);
        gengps.add(ages);
        gengps.add(borne);

        term = new JCheckBox("Verified");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(170, 580);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(200, 610);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(370, 610);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(500, 570);
        tout.setLocation(700, 70);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 640);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(780, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sub) {
            String data1 = "";
            String data9 = "",
                    data18 = "", data2 = "", data3 = "", name = "", gname = "", mobile = "", age = "", address = "",
                    date = "";
            int x = 0;

            if (term.isSelected()) {
                name = tname.getText();
                gname = tgname.getText();
                mobile = tmno.getText();
                age = tage.getText();
                address = tadd.getText();
                date = tdate.getText();
                String data = "Name : " + name + "\n" + "Guardian's name : " + gname + "\n" + "Mobile : " + mobile + "\n";
                if (male.isSelected()) {
                    data1 = "m";
                    System.out.print("\n");
                } else if (female.isSelected()) {
                    data1 = "f";
                    System.out.print("\n");
                } else {
                    data1 = "o";
                    System.out.print("\n");
                }
                data2 = "Age: " + age + "\n";
                data3 = "Address : " + address + "\n";

                if (paid.isSelected())
                    data18 = "10";
                else if (anc.isSelected())
                    data18 = "anc";
                else if (ages.isSelected())
                    data18 = "age";
                else if (borne.isSelected())
                    data18 = "borne";

                if (ent.isSelected()) {
                    data9 = "ENT ";
                } else if (medicine.isSelected()) {
                    data9 = "Medicine ";
                } else if (surgery.isSelected()) {
                    data9 = "Surgery ";
                } else if (dental.isSelected()) {
                    data9 = "Dental ";
                } else if (accidentandemergeny.isSelected()) {
                    data9 = "Accident and Emergency";
                } else if (ong.isSelected()) {
                    data9 = "O&G";
                } else if (ortho.isSelected()) {
                    data9 = "Orthopaedic ";
                } else if (otherdep.isSelected()) {
                    data9 = "Others";
                    System.out.print("\n");
                }

                try {
                    PreparedStatement pstmt = connec
                            .prepareStatement(
                                    "insert into patients(name,gname, age, sex, phone, address, visit, remark, date, department) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

                    pstmt.setString(1, name);
                    pstmt.setString(2, gname);
                    pstmt.setString(3, age);
                    pstmt.setString(4, data1);
                    pstmt.setString(5, mobile);
                    pstmt.setString(6, address);
                    pstmt.setInt(7, 1);
                    pstmt.setString(8, data18);
                    pstmt.setString(9, date);
                    pstmt.setString(10, data9);


                    pstmt.executeUpdate();

                    ResultSet generatedKeys = pstmt.getGeneratedKeys();
                    if (generatedKeys.next()) {
                    x = generatedKeys.getInt(1);
                    }
                    
                } catch (Exception f) {
                    f.printStackTrace();
                }
                String regNo = String.format("%d", x);
                tout.setText("MIRZA HOSPITAL\n" + "Registration id: " + regNo +  "\n" +name + "\n" +gname + "\n" + data + "Sex: " + data1
                        + "\n"
                        + data2
                        + data3
                        + "Dept: " + data9 + "\n" +"Remark : "
                        + data18 + "\n" + "Date: " + date);
                tout.setEditable(false);
                res.setText("Registration Successfully..");

            }

            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Verified");
            }

        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tgname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);

            tage.setText(def);
            resadd.setText(def);
        }
    }
}

// Queries File
class queries extends JFrame implements ActionListener {

    // GUI components
    private JLabel lblDate;
    private JTextField txtDate;
    private JButton btnSubmit;
    private JTextArea txtResult;

    // Database connection
    private Connection conn;
    private Statement stmt;

    queries() {
        // Set up the GUI
        setTitle("OPD Statistics");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblDate = new JLabel("Enter Date (ddmmyyyy):");
        txtDate = new JTextField(10);
        btnSubmit = new JButton("Submit");
        txtResult = new JTextArea(15, 50);
        txtResult.setEditable(false);

        btnSubmit.addActionListener(this);

        add(lblDate);
        add(txtDate);
        add(btnSubmit);
        add(new JScrollPane(txtResult));

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String dateInput = txtDate.getText().trim();

            // Validate date input

            // Clear previous result
            txtResult.setText("");

            // Connect to the database
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arogya", "root",
                        "mysql");
                stmt = conn.createStatement();

                // Query 1: Total number of patients who attended the OPD service
                String query1 = "SELECT COUNT(*) as total_patients FROM Patients where date = ?";
                PreparedStatement stmt1 = conn.prepareStatement(query1);
                stmt1.setString(1, dateInput);
                ResultSet rs1 = stmt1.executeQuery();
                if (rs1.next()) {
                    int totalPatients = rs1.getInt("total_patients");
                    txtResult.append("Total number of patients who attended the OPD service: " + totalPatients + "\n");
                }

                // Query 2: Male patients
                String query2 = "SELECT COUNT(*) as male_patients FROM Patients WHERE sex = 'm' AND date = ?";
                PreparedStatement stmt2 = conn.prepareStatement(query2);
                stmt2.setString(1, dateInput);
                ResultSet rs2 = stmt2.executeQuery();
                if (rs2.next()) {
                int malePatients = rs2.getInt("male_patients");
                txtResult.append("Male patients: " + malePatients + "\n");
                }

                // Query 3: Female patients
                String query3 = "SELECT COUNT(*) as female_patients FROM Patients WHERE sex = 'f' AND date = ?";
                PreparedStatement stmt3 = conn.prepareStatement(query3);
                stmt3.setString(1, dateInput);
                ResultSet rs3 = stmt3.executeQuery();
                if (rs3.next()) {
                    int femalePatients = rs3.getInt("female_patients");
                    txtResult.append("Female patients: " + femalePatients + "\n");
                }

                // Query 4: Other patients
                String query4 = "SELECT COUNT(*) as Other_patients FROM Patients WHERE sex = 'o' AND date = ?";
                PreparedStatement stmt4 = conn.prepareStatement(query4);
                stmt4.setString(1, dateInput);
                ResultSet rs4 = stmt4.executeQuery();
                if (rs4.next()) {
                    int otherPatients = rs4.getInt("Other_patients");
                    txtResult.append("Other patients: " + otherPatients + "\n");
                }

                // Query 5: Number of children below the age of 5 years
                String query5 = "SELECT COUNT(*) as children_below_5 FROM Patients WHERE age < 5 AND date = ?";
                PreparedStatement stmt5 = conn.prepareStatement(query5);
                stmt5.setString(1, dateInput);
                ResultSet rs5 = stmt5.executeQuery();
                if (rs5.next()) {
                    int childrenBelow5 = rs5.getInt("children_below_5");
                    txtResult.append("Number of children below the age of 5 years: " + childrenBelow5 + "\n");
                }

                // Query 6: Number of patients in the age range of 0 to 12 months
                String query6 = "SELECT COUNT(*) as patients_0_to_12_months FROM Patients WHERE age = 0 AND date = ?";
                PreparedStatement stmt6 = conn.prepareStatement(query6);
                stmt6.setString(1, dateInput);
                ResultSet rs6 = stmt6.executeQuery();
                if (rs6.next()) {
                    int patients0To12Months = rs6.getInt("patients_0_to_12_months");
                    txtResult.append(
                            "Number of patients in the age range of 0 to 12 months: " + patients0To12Months + "\n");
                }

                // Query 7: Number of ANC (Ante Natal Case, Pregnancy related) patients
                String query7 = "SELECT COUNT(*) as anc_patients FROM Patients WHERE remark = 'anc' AND date = ?";
                PreparedStatement stmt7 = conn.prepareStatement(query7);
                stmt7.setString(1, dateInput);
                ResultSet rs7 = stmt7.executeQuery();
                if (rs7.next()) {
                    int ancPatients = rs7.getInt("anc_patients");
                    txtResult.append(
                            "Number of ANC (Ante Natal Case, Pregnancy related) patients: " + ancPatients + "\n");
                }

                // Query 8: Department-wise patient count
                String query8 = "SELECT department, COUNT(*) as department_count FROM Patients where date = ? GROUP BY department";
                PreparedStatement stmt8 = conn.prepareStatement(query8);
                stmt8.setString(1, dateInput);
                ResultSet rs8 = stmt8.executeQuery();
                txtResult.append("Department-wise patient count:\n");
                while (rs8.next()) {
                    String department = rs8.getString("department");
                    int departmentCount = rs8.getInt("department_count");
                    txtResult.append(department + ": " + departmentCount + "\n");
                }

                // Query 9: OPD registration fee collected
                String query9 = "SELECT count(remark) as total_fee FROM Patients where remark = '10' AND date = ?";
                PreparedStatement stmt9 = conn.prepareStatement(query9);
                stmt9.setString(1, dateInput);
                ResultSet rs9 = stmt9.executeQuery();
                if (rs9.next()) {
                    double totalFee = rs9.getDouble("total_fee");
                    txtResult.append("OPD registration fee collected: Rs " + (totalFee) * 10 + "\n");
                }

                // Query 11: repeats
                String query11 = "SELECT COUNT(*) as repeats FROM Patients WHERE visit > 1 AND date = ?";
                PreparedStatement stmt11 = conn.prepareStatement(query11);
                stmt11.setString(1, dateInput);
                ResultSet rs11 = stmt11.executeQuery();
                if (rs11.next()) {
                    int repeats = rs11.getInt("repeats");
                    txtResult.append("patients visiting again : " + repeats + "\n");
                }

                // Close database connection
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error connecting to database: " + ex.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

// Export File
class Export {

    Export() {

        try {
            // Connect to MySQL database
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arogya", "root", "mysql");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query to fetch all rows from the table
            ResultSet rs = stmt.executeQuery("SELECT * FROM patients");

            // Create a CSV file and write the contents of the ResultSet to it
            FileWriter writer = new FileWriter("patient_registration.csv");
            while (rs.next()) {
                writer.append(rs.getString("Registration_no"));
                writer.append(',');
                writer.append(rs.getString("name"));
                writer.append(',');
                writer.append(rs.getString("gname"));
                writer.append(',');
                writer.append(Integer.toString(rs.getInt("age")));
                writer.append(',');
                writer.append(rs.getString("sex"));
                writer.append(',');
                writer.append(rs.getString("address"));
                writer.append(',');
                writer.append(rs.getString("date"));
                writer.append(',');
                writer.append(rs.getString("phone"));
                writer.append(',');
                writer.append(rs.getString("department"));
                writer.append(',');
                writer.append(rs.getString("remark"));
                writer.append('\n');
            }
            writer.flush();
            writer.close();

            // Close the database connection
            conn.close();

            System.out.println("Export completed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

// Show Data

class ShowData extends JFrame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/arogya";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "mysql";
    private static final int PAGE_SIZE = 30;
    private int currentPage = 0;
    private JTable table;
    private JButton prevButton;
    private JButton nextButton;
    

    public ShowData() {
        setTitle("Patient Registration Records");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        // Create the table model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Registration_no");
        model.addColumn("Name");
        model.addColumn("Guardian's Name");
        model.addColumn("Age");
        model.addColumn("Sex");
        model.addColumn("Phone");
        model.addColumn("Address");
        model.addColumn("Visit");
        model.addColumn("Remark");
        model.addColumn("Date");
        model.addColumn("Department");

        // Create the table and set its model
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Create the panel with the previous and next buttons
        JPanel buttonPanel = new JPanel();
        prevButton = new JButton("Previous");
        prevButton.setEnabled(false);
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentPage--;
                if (currentPage <= 0) {
                    currentPage = 0;
                    prevButton.setEnabled(false);
                }
                updateTable();
            }
        });
        buttonPanel.add(prevButton);

        nextButton = new JButton("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentPage++;
                if (currentPage >= getTotalPages() - 1) {
                    currentPage = getTotalPages() - 1;
                    nextButton.setEnabled(false);
                }
                prevButton.setEnabled(true);
                updateTable();
            }
        });
        buttonPanel.add(nextButton);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Update the table with the most recent entries
        updateTable();
    }

    private int getTotalPages() {
        int totalPages = 0;
        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // Query the database to count the number of entries
            String countQuery = "SELECT COUNT(*) AS count FROM patients";
            PreparedStatement countStmt = conn.prepareStatement(countQuery);
            ResultSet countRs = countStmt.executeQuery();
            countRs.next();
            int totalCount = countRs.getInt("count");

            // Calculate the total number of pages
            totalPages = (int) Math.ceil((double) totalCount / PAGE_SIZE);

            // Close the database connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalPages;
    }

    private void updateTable() {
        List<String[]> data = new ArrayList<>();

        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // Query the database for the most recent entries
            int offset = currentPage * PAGE_SIZE;
            String query = "SELECT * FROM patients ORDER BY Registration_no DESC LIMIT ? OFFSET ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, PAGE_SIZE);
            stmt.setInt(2, offset);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String[] row = new String[11];
                row[0] = rs.getString("Registration_no");
                row[1] = rs.getString("name");
                row[2] = rs.getString("gname");
                row[3] = rs.getString("age");
                row[4] = rs.getString("sex");
                row[5] = rs.getString("phone");
                row[6] = rs.getString("address");
                row[7] = rs.getString("visit");
                row[8] = rs.getString("remark");
                row[9] = rs.getString("date");
                row[10] = rs.getString("department");
                data.add(row);
            }

            // Close the database connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Update the table model with the new data
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (String[] row : data) {
            model.addRow(row);
        }

        // Enable or disable the "Previous" button based on the current page
        prevButton.setEnabled(currentPage > 0);

        // Update the title of the window with the current page number
        setTitle("Patient Registration Records - Page " + (currentPage + 1));

        // Check if there are more pages to display
        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // Query the database to count the number of entries
            String countQuery = "SELECT COUNT(*) AS count FROM patients";
            PreparedStatement countStmt = conn.prepareStatement(countQuery);
            ResultSet countRs = countStmt.executeQuery();
            countRs.next();
            int totalCount = countRs.getInt("count");

            // Calculate the total number of pages
            int totalPages = (int) Math.ceil((double) totalCount / PAGE_SIZE);

            // Enable or disable the "Next" button based on the current page
            JButton nextButton = new JButton("Next");
            nextButton.setEnabled(currentPage < totalPages - 1);
            nextButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentPage++;
                    if (currentPage >= totalPages - 1) {
                        currentPage = totalPages - 1;
                        nextButton.setEnabled(false);
                    }
                    prevButton.setEnabled(true);
                    updateTable();
                }
            });

            // Remove any existing "Next" button and add the new one
            JPanel buttonPanel = (JPanel) getContentPane().getComponent(1);
            Component[] components = buttonPanel.getComponents();
            for (Component component : components) {
                if (component instanceof JButton && ((JButton) component).getText().equals("Next")) {
                    buttonPanel.remove(component);
                }
            }
            buttonPanel.add(nextButton);

            // Close the database connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        getContentPane().validate();
    }
}
// Visit

class visit extends JFrame implements ActionListener {
    private JLabel regNoLabel;
    private JTextField regNoField;
    private JLabel dateLabel;
    private JTextField dateField;
    private JButton visitButton;
    private JTable table;
    private JScrollPane scrollPane;
    private Connection conn;
    private JButton updateButton;
    private JFrame visit;

    public visit() {
        super("Patient Visit GUI");

        // Initialize the visit variable
        visit = this;

        // Create GUI components
        regNoLabel = new JLabel("Registration No:");
        regNoField = new JTextField(20);
        dateLabel = new JLabel("Date (ddmmyyyy):");
        dateField = new JTextField(20);
        visitButton = new JButton("Visit");
        updateButton = new JButton("Update Visit");
        table = new JTable();
        scrollPane = new JScrollPane(table);

        // Set layout
        setLayout(new BorderLayout());

        // Add components to the panel
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(regNoLabel);
        inputPanel.add(regNoField);
        inputPanel.add(dateLabel);
        inputPanel.add(dateField);
        inputPanel.add(visitButton);
        inputPanel.add(updateButton);
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Add action listeners
        visitButton.addActionListener(this);
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected row index
                int rowIndex = table.getSelectedRow();
                
                if (rowIndex != -1) { // If a row is selected
                    try {
                        // Retrieve the patient's registration number and visit count from the selected row
                        String regNo = table.getValueAt(rowIndex, 0).toString();
                       // int visitCount = Integer.parseInt(table.getValueAt(rowIndex, 2).toString());
                        
                        // Increment the visit count by 1
                      //  visitCount++;
                        
                        // Create the SQL statement to update the visit count for the patient
                        String sql = "UPDATE patients SET Visit=visit + 1 WHERE Registration_no='" + regNo + "'";
                        
                        // Execute the SQL statement
                        Statement stmt = conn.createStatement();
                        int rowsAffected = stmt.executeUpdate(sql);
                        
                        // If the update was successful, display a message and refresh the table
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(visit, "Visit count updated for patient with registration number " + regNo);
                            Window window = SwingUtilities.getWindowAncestor(visit);
                            window.dispose();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else { // If no row is selected
                    JOptionPane.showMessageDialog(visit, "Please select a row to update the visit count.");
                }
            }
        });

     
        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // set to full screen
     //   setSize(600, 400);
        setVisible(true);

        // Connect to database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/arogya", "root", "mysql");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        String regNo = regNoField.getText();
        String dateStr = dateField.getText();
        boolean isSearchByRegNo = !regNo.isEmpty();
        boolean isSearchByDate = !dateStr.isEmpty();

        try {
            // Create SQL statement to retrieve rows with matching registration number and/or date
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM patients";
            if (isSearchByRegNo && !isSearchByDate) {
                sql += " WHERE Registration_no='" + regNo + "'";
            } else if (!isSearchByRegNo && isSearchByDate) {
                int date = Integer.parseInt(dateStr);
                sql += " WHERE Date=" + date;
            } else if (isSearchByRegNo && isSearchByDate) {
                int date = Integer.parseInt(dateStr);
                sql += " WHERE Registration_no='" + regNo + "' AND Date=" + date;
            }
            ResultSet rs = stmt.executeQuery(sql);

            // Create table model with the results
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            String[] columnNames = new String[numCols];
            for (int i = 1; i <= numCols; i++) {
                columnNames[i - 1] = rsmd.getColumnName(i);
            }
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                Object[] row = new Object[numCols];
                for (int i = 1; i <= numCols; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(row);
            }
    
            // Display the results in the table
            table.setModel(tableModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
    

public class Real extends JFrame implements ActionListener {
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JTextField dateTextField;
    private JButton loginButton;
    private JPanel mainPanel;
    private JTextField visitTextField;
    private JButton showDataButton;
    public Connection conn2;

    Real(Connection cn) {
        // Set up the login page
        conn2 = cn;
        JPanel loginPanel = new JPanel(new GridLayout(4, 2));
        JLabel usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
    
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);
    
        // Set up the main panel
        mainPanel = new JPanel();
        JButton registrationButton = new JButton("Registration");
        registrationButton.addActionListener(this);
        JButton queriesButton = new JButton("Queries");
        queriesButton.addActionListener(this);
        JButton exportButton = new JButton("Export");
        exportButton.addActionListener(this);
        JButton visitButton = new JButton("Visit");
        visitButton.addActionListener(this);
        showDataButton = new JButton("Show Data");
        showDataButton.addActionListener(this);
    
        mainPanel.add(registrationButton);
        mainPanel.add(queriesButton);
        mainPanel.add(exportButton);
        mainPanel.add(showDataButton);
        mainPanel.add(visitButton);
    
        // Add the login panel to the frame
        getContentPane().add(loginPanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
       // setExtendedState(JFrame.MAXIMIZED_BOTH); // set to full screen
        setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            String username = usernameTextField.getText();
            String password = new String(passwordField.getPassword());
            if (!username.equals("admin") || !password.equals("admin123")) {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                // Login successful, show main panel
                getContentPane().removeAll();
                getContentPane().add(mainPanel);
                revalidate();
            }

        } else if (e.getActionCommand().equals("Registration")) {
            MyFrame f = new MyFrame(conn2);
            f.setSize(1650, 1080);
        } else if (e.getActionCommand().equals("Queries")) {
            // Handle queries
            new queries();
        } else if (e.getActionCommand().equals("Export")) {
            // Handle export
            new Export();
        } else if (e.getActionCommand().equals("Visit")) {
            // Handle Visit
            new visit();
           

        } else if (e.getSource() == showDataButton) {
            ShowData gui = new ShowData();
            gui.setVisible(true);
        }

    }

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";

    static final String USER = "root";
    static final String PASS = "mysql";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arogya", "root", "mysql");
            new Real(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}