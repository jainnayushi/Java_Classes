import java.io.RandomAccessFile;

import java.io.IOException;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.ArrayList;

class UpdateFile extends JFrame implements ActionListener {

    private RandomAccessFile raf;
    private JTextField idField, firstNameField, lastNameField, balanceField;
    private JButton nextButton, saveButton;
    private ArrayList records;
    private int currentRecordIndex;
    private static final int RECORD_LENGTH = 45; // Assuming each record is 45 bytes long (for ID, Name, Balance)
    private class Record {
        int id;
        String firstName;
        String lastName;
        double balance;
        public Record(int id, String firstName, String lastName, double balance) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;

            this.balance = balance;

        }
    }

    public UpdateFile() {
        try {
            raf = new RandomAccessFile("credit.dat", "rw");
        } catch (IOException e) {
            e.printStackTrace();
        }
        setTitle("Update the random access file");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        add(new JLabel("Account Number"));
        idField = new JTextField(10);
        add(idField);

        add(new JLabel("First Name"));
        firstNameField = new JTextField(10);
        add(firstNameField);

        add(new JLabel("Last Name"));
        lastNameField = new JTextField(10);
        add(lastNameField);

        add(new JLabel("Balance"));
        balanceField = new JTextField(10);
        add(balanceField);

        nextButton = new JButton("Next Record");
        nextButton.addActionListener(this);
        add(nextButton);

        saveButton = new JButton("Save Record");
        saveButton.addActionListener(this);
        add(saveButton);

        records = new ArrayList<>();
        loadRecords();
        currentRecordIndex = 0;

        if (!records.isEmpty()) {
            displayRecord((Record) records.get(currentRecordIndex));
        }

        setVisible(true);
    }

    private void loadRecords() {

        try {

            records.clear();

            long fileLength = raf.length();

            long totalRecords = fileLength / RECORD_LENGTH;

            for (int i = 0; i < totalRecords; i++) {
                raf.seek(i * RECORD_LENGTH);

                int id = raf.readInt();

                String firstName = readFixedString(20);
                String lastName = readFixedString(20);

                double balance = raf.readDouble();

                records.add(new Record(id, firstName,lastName, balance));

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    private void displayRecord(Record record) {

        idField.setText(Integer.toString(record.id));

        firstNameField.setText(record.firstName);
        lastNameField.setText(record.lastName);

        balanceField.setText(Double.toString(record.balance));

    }

    private void nextRecord() {

        if (currentRecordIndex + 1 < records.size()) {

            currentRecordIndex++;

            displayRecord((Record) records.get(currentRecordIndex));

        } else {

            // End of records, clear the fields

            idField.setText("");

            firstNameField.setText("");
            lastNameField.setText("");

            balanceField.setText("");

            currentRecordIndex = -1;

        }

    }

    // private void saveRecord() {
    //
    // try {
    //
    // int id = Integer.parseInt(idField.getText());
    //
    // String firstName = nameField.getText();
    //
    // double balance = Double.parseDouble(balanceField.getText());
    //
    //
    // Record record = new Record(id, firstName, balance);
    //
    // if (currentRecordIndex >= 0 && currentRecordIndex < records.size()) {
    //
    // records.set(currentRecordIndex, record);
    //
    // } else {
    //
    // records.add(record);
    //
    // }
    //
    //
    // // Save the record to the file
    // raf.seek(currentRecordIndex * RECORD_LENGTH);
    //
    // raf.writeInt(id);
    //
    // writeFixedString(firstName, 20);
    //
    // raf.writeDouble(balance);
    //
    //
    // // Clear the fields after saving
    //
    // idField.setText("");
    //
    // nameField.setText("");
    //
    // balanceField.setText("");
    //
    // currentRecordIndex = -1;
    //
    // } catch (IOException | NumberFormatException e) {
    //
    // e.printStackTrace();
    //
    // }
    //
    // }

    private void saveRecord() {
        try {
            int id = Integer.parseInt(idField.getText());
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            double balance = Double.parseDouble(balanceField.getText());

            Record record = new Record(id, firstName,lastName, balance);
            if (currentRecordIndex >= 0 && currentRecordIndex < records.size()) {
                records.set(currentRecordIndex, record);
                // Save the record to the file
                raf.seek(currentRecordIndex * RECORD_LENGTH);
            } else {
                records.add(record);
                // Save the record at the end of the file
                raf.seek(raf.length());
            }

            raf.writeInt(id);
            writeFixedString(firstName, 20);
            writeFixedString(lastName, 20);
            raf.writeDouble(balance);

            // Clear the fields after saving
            idField.setText("");
            firstNameField.setText("");
            lastNameField.setText("");
            balanceField.setText("");
            currentRecordIndex = -1;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private String readFixedString(int length) throws IOException {

        char[] chars = new char[length];

        for (int i = 0; i < length; i++) {

            chars[i] = raf.readChar();

        }

        return new String(chars).replace('\0', ' ');

    }

    private void writeFixedString(String s, int length) throws IOException {

        StringBuilder sb = new StringBuilder(s);

        sb.setLength(length);

        raf.writeChars(sb.toString());

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nextButton) {

            nextRecord();

        } else if (e.getSource() == saveButton) {

            saveRecord();

        }

    }

    public static void main(String[] args) {

        new UpdateFile();

    }

}
