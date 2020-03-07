import java.sql.Driver;

 class classNotFoundException {
    public static void main(String[] args) {
        try{
            Class.forName("AnonymousClass");

        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
/* class noClassDefFoundError{
    public static void main(String[] args){
        Driver d = new Driver();
        d.showmessage();

    }
}
class Driver{
    void showmessage(){
        System.out.println("from driver class");
    }
}*/