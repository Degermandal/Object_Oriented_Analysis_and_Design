package com.company.Part1;


public class Main {

    public static void main(String[] args) {

        SmartPhoneStore turkeyStore = new TurkeySmartPhoneStore();
        SmartPhone smartPhone = turkeyStore.orderSmartPhone("IflasDeluxe");
        System.out.println(smartPhone);
        System.out.println("------------------------------------------------------------");

        SmartPhoneStore turkeyStore1 = new TurkeySmartPhoneStore();
        SmartPhone smartPhone1 = turkeyStore1.orderSmartPhone("I_I_Aman_Iflas");
        System.out.println(smartPhone1);
        System.out.println("------------------------------------------------------------");

        SmartPhoneStore turkeyStore2 = new TurkeySmartPhoneStore();
        SmartPhone smartPhone2 = turkeyStore2.orderSmartPhone("MaximumEffort");
        System.out.println(smartPhone2);
        System.out.println("------------------------------------------------------------");

        SmartPhoneStore euStore = new EUSmartPhoneStore();
        SmartPhone smartPhoneEU = euStore.orderSmartPhone("IflasDeluxe");
        System.out.println(smartPhoneEU);
        System.out.println("------------------------------------------------------------");


        SmartPhoneStore globalStore = new GlobalSmartPhoneStore();
        SmartPhone smartPhoneG = globalStore.orderSmartPhone("I_I_Aman_Iflas");
        System.out.println(smartPhoneG);
        System.out.println("------------------------------------------------------------");

    }
}
