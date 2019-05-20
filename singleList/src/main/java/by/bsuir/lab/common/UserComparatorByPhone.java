package by.bsuir.lab.common;

import java.util.Comparator;

public class UserComparatorByPhone implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getPhone().compareTo(o2.getPhone());
    }
}
