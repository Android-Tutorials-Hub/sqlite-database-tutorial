package com.androidtutorialshub.sqlitedatabaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper db = new DatabaseHelper(this);

        // Inserting Contacts
        Log.d("Insert: ", "Inserting.");
        db.addEmployee(new Employee("Akanksha", "9988998899"));
        db.addEmployee(new Employee("Lalit", "888888888"));
        db.addEmployee(new Employee("Ayush", "9876543210"));
        db.addEmployee(new Employee("Nitul", "9977997799"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all Employee Records ..");
        List<Employee> employees = db.getAllEmployee();

        for (Employee employee : employees) {
            String log = "Employee Id: " + employee.getEmpId() +
                    " ,Employee Name: " + employee.getEmpName() +
                    " ,Employee Phone: " + employee.getEmpPhoneNo();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}
