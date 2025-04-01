package Java8.DateAndTimeApi;

import java.time.ZoneId;

public class CurrentZoneId {
    public static void main(String[] args) {
        ZoneId currentZone = ZoneId.systemDefault();
    }
}
