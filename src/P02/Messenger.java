package P02;

public class Messenger {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    public void showMessage() {
        System.out.println(message);
    }
    public String getMessage() {
        return message;
    }

    //------------------------------------------------------------------

    public void init() {
        System.out.println("Kek");;
    }
    public void destroy() {
        System.out.println("Destroying...");
    }
}
