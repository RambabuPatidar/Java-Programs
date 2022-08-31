package com.OOPS.Interfaces.Nested;

public class A {
    // The innerLevel of interfaces can have any type of access specifier in them.
    // But the top level interfaces can only public or default one.
    public interface NestedInterface {
        boolean isOdd(int num );
    }
}

class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

