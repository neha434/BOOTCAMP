
//(1) Write a program to demonstrate Tightly Coupled code.
package tcoupling;

class Manager1 {

    Hitachi h;
    Samsung s;

    public Manager1(Hitachi h, Samsung s) {

        this.h = h;
        this.s = s;
    }

    public void ManageWork1() {
        h.productUsed();
        s.productUsed();
    }

}

class Hitachi {
    public void productUsed() {
        System.out.println("Hitachi product is used");
    }

}

class Samsung {
    public void productUsed() {
        System.out.println("Samsung product is used");
    }

}


public class TightCoupling{

    public static void main(String[] args) {
        Samsung s = new Samsung();
        Hitachi h= new Hitachi();
        Manager1 m = new Manager1(h, s);
        m.ManageWork1();

    }

}
