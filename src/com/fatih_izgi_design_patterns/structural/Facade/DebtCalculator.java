package com.fatih_izgi_design_patterns.structural.Facade;

class DeptCalculator{ //Facade Class
    private LibraryMember member;
    private BookDebt bookDebt;
    private MembershipDebt membershipDebt;
    private CafeteriaDebt cafeteriaDebt;
    private ParkDebt parkDebt;

    public DeptCalculator(LibraryMember member){
        member = member;
        bookDebt = new BookDebt(member);
        membershipDebt = new MembershipDebt();
        cafeteriaDebt = new CafeteriaDebt();
        parkDebt = new ParkDebt();
    }

    public double calculateTotalDept(){
        double totalDebt = 0;

        totalDebt+=bookDebt.calculateDebt()+membershipDebt.calculateDebt()+
                cafeteriaDebt.calculateDebt()+ parkDebt.calculateDebt();

        return totalDebt;
    }
}
