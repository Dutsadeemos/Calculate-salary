package com.example.salarycalculator.controller;

import com.example.salarycalculator.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SalaryController {

    @GetMapping("/")
    public String index(Model model) {
        Employee employee = new Employee();
        employee.setBasicSalary(0.0); // กำหนดค่าเริ่มต้น
        employee.setAllowance(0.0);   // กำหนดค่าเริ่มต้น
        double overtimePay = 0.0;     // กำหนดค่าเริ่มต้น

        model.addAttribute("employee", employee);
        model.addAttribute("overtimePay", overtimePay);
        return "index";
    }


    @PostMapping("/calculate")
    public String calculateSalary(Employee employee, Model model) {
        double overtimePay = employee.getOvertime() * employee.getWorkingDays();
        double grossSalary = employee.getBasicSalary() + employee.getAllowance() + overtimePay;
        double tax = grossSalary * 0.03;
        double socialSecurity = 750; // ประกันสังคมคงที่
        double netSalary = grossSalary - tax - socialSecurity;

        employee.setTax(tax);
        employee.setSocialSecurity(socialSecurity);
        employee.setNetSalary(netSalary);

        model.addAttribute("employee", employee);
        model.addAttribute("overtimePay", overtimePay);
        return "index";
    }
}
