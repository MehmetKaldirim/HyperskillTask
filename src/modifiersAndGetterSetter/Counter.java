package modifiersAndGetterSetter;

public class Counter {
    private long current = 0;

    public long getCurrent() { //get private field from class
        return current;
    }


    public long inc() { // not setter not initialize but change the value of variable
        inc(1L);
        return current;
    }


    private void inc(long val) {
        current += val;
    }
}