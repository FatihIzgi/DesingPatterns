package com.fatih.izgi.design_patterns.Structural.Facade;

class BookDebt{

    private LibraryMember member;
    private static double penaltyRate = 0.65;

    public BookDebt(LibraryMember member) {
        this.member = member;
    }
    public double calculateDebt(){

        double debt = 0;

        for(Book book : member.getBooks()){
            if(book.hasTimeOut()){
                debt+= ((book.getActualHoldingDay()*Book.defaultRentingPrice))+((book.getActualHoldingDay()-book.getScheduledHoldingDay())*penaltyRate);
            }
            else{
                debt+=(book.getActualHoldingDay()*Book.defaultRentingPrice);
            }
        }

        return debt;
    }
}
