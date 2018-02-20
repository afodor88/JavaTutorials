package com.company;

import java.util.*;

class OverrideAnnotation {

    String n;
    String add;
    int an;
    int bal;
    int dep;

    public OverrideAnnotation(String n, String add, int an, int bal) {

        this.add = add;
        this.bal = bal;
        this.an = an;
        this.n = n;

    }

    @Override
    public String toString() {
        return "Name of the customer.:" + this.n + ",, "
                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
                + this.an + ",, " + "Balance in A/c..:" + this.bal;
    }


    public static void main(String[] args) {

        List<OverrideAnnotation> l = new LinkedList<OverrideAnnotation>();

        OverrideAnnotation b1 = new OverrideAnnotation("naseem1", "Darbhanga,bihar", 123, 1000);
        OverrideAnnotation b2 = new OverrideAnnotation("naseem2", "patna,bihar", 124, 1500);
        OverrideAnnotation b3 = new OverrideAnnotation("naseem3", "madhubani,bihar", 125, 1600);
        OverrideAnnotation b4 = new OverrideAnnotation("naseem4", "samastipur,bihar", 126, 1700);
        OverrideAnnotation b5 = new OverrideAnnotation("naseem5", "muzafferpur,bihar", 127, 1800);
//        l.add(b1);
//        l.add(b2);
//        l.add(b3);
//        l.add(b4);
//        l.add(b5);
//        Iterator<OverrideAnnotation> i = l.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }

        System.out.println(b1);
        System.out.println(b2);
    }

}


