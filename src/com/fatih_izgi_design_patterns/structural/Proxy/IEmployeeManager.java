package com.fatih_izgi_design_patterns.structural.Proxy;

interface IEmployeeManager{
    void assignEmployeeToProject(Employee attempter);
    void removeEmployeeFromProject(Employee attempter);
    void updateEmployeeRecord(Employee attempter);
    void showEmployeeInfo(Employee attempter);
    void assignTaskToEmployee(Employee attempter);
}