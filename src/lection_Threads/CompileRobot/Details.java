package lection_Threads.CompileRobot;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public enum Details {
    RIGHT_HAND,
    LEFT_HAND,
    RIGHT_LEG,
    LEFT_LEG,
    BODY,
    HEAD,
    CPU,
    RAM,
    HDD;

    private static final List<Details> VALUES = new ArrayList<>(Arrays.asList(Details.values()));
    private static final int SIZE = VALUES.size();
    private static final SecureRandom RANDOM = new SecureRandom();

    public static Details randomDetail()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
