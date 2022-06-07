package com.fatih.izgi.design_patterns.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        LibraryMember member = new LibraryMember(1,"Üye245");
        setMemberBooks(member);

        System.out.println("Toplam borç : "+new DeptCalculator(member).calculateTotalDept()); //Facade Object
    }

    public static void setMemberBooks(LibraryMember member){
        member.rentBook(new Book("Kuzuların Sessizliği",5,8));
        member.rentBook(new Book("Cinnet",10,10));
        member.rentBook(new Book("Psikiyatrist",14,11));
        member.rentBook(new Book("Cerrah",8,7));
    }

}
