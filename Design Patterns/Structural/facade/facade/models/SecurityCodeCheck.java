package facade.models;

public class SecurityCodeCheck {
    private int SecurityCode = 0000;
    
    public int getSecurityCode() {
        return SecurityCode;
    }

    public boolean ısCodeCorrect(int secCodeToCkechk) {
        return SecurityCode == secCodeToCkechk;
    }
}
