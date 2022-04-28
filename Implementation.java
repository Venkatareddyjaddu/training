public class Implementation implements Interface {

    @Override
    public void name() {
        System.out.println("Venkat");
    }

    @Override
    public void college() {
        System.out.println("CIET,Guntur");
    }

    @Override
    public void location() {
        System.out.println("GUNTUR");

    }
    public static void main(String[] args) {
        new Implementation().name();
        new Implementation().college();
        new Implementation().location();
    }
    
}
