import com.sun.jdi.connect.Transport;

public class ServiceStation {
    public void check(Transport... transport) {
        for (Transport t : transport) {
            t.service();
        }
    }
}




