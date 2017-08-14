package P03;

public class Phone {

    private int number;
    public void setNumber(int number) {
        this.number = number;
    }

    public void call() {
        System.out.println("Calling ... +48 " + number);
    }

}
