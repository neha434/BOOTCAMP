public class sigletonClass {
    public static void main(String[] args) {
        singleton a = singleton.getInstance();
        singleton b = singleton.getInstance();
        System.out.println(a);
        System.out.println(b);
        a.show();
    }

    }

class singleton{

public  static singleton  s;
    private singleton(){
        System.out.println("Instance created");
        }
        public static singleton getInstance(){
        if(s == null){
            s= new singleton();

        }
        return s;
        }
        void show(){
        System.out.println("\n this is singleton class method");
        }

    }