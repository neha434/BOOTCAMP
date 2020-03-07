//(2) Write a program to demonstrate Loosely Coupled code.
class Manager {
    Hardware product;
    public Manager(Hardware product) {

        this.product=product;
    }
    public void ManageWork() {

        this.product.productUsed();
    }
}
interface Hardware{
    void productUsed();

}
class Hitachi implements Hardware{
    public void productUsed() {
        System.out.println("Hitachi product is used");
    }

}
class Samsung implements Hardware {
    public void productUsed() {
        System.out.println("Samsung product is used");
    }

}

public class LooseCoupling {

    public static void main(String[] args) {
        Hitachi h = new Hitachi();
        Manager m1 = new Manager(h);
        m1.ManageWork();

        Samsung s = new Samsung();
        Manager m2 = new Manager(s);
        m2.ManageWork();
    }

}

