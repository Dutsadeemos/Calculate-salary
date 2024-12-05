package com.example.salarycalculator.model;

public class Employee {
    private String name;
    private double basicSalary; // เงินเดือนพื้นฐาน
    private double allowance;   // ค่าเบี้ยเลี้ยง
    private int workingDays;    // จำนวนวันที่ทำงาน
    private double overtime;    // ค่าโอทีรายวัน
    private double tax;         // ภาษี
    private double socialSecurity; // ประกันสังคม
    private double netSalary;   // เงินสุทธิ

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }
    public double getAllowance() { return allowance; }
    public void setAllowance(double allowance) { this.allowance = allowance; }
    public int getWorkingDays() { return workingDays; }
    public void setWorkingDays(int workingDays) { this.workingDays = workingDays; }
    public double getOvertime() { return overtime; }
    public void setOvertime(double overtime) { this.overtime = overtime; }
    public double getTax() { return tax; }
    public void setTax(double tax) { this.tax = tax; }
    public double getSocialSecurity() { return socialSecurity; }
    public void setSocialSecurity(double socialSecurity) { this.socialSecurity = socialSecurity; }
    public double getNetSalary() { return netSalary; }
    public void setNetSalary(double netSalary) { this.netSalary = netSalary; }
}
