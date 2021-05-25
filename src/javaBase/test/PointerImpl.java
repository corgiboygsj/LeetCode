package javaBase.test;

import java.io.DataInput;

public class PointerImpl implements Pointer {
    private DataInput input;
    private long offset;
    private long length;

    public void setInput(DataInput input) {
        this.input = input;
    }

    @Override
    public DataInput input() {
        return null;
    }

    @Override
    public long offset() {
        return 0;
    }

    @Override
    public long length() {
        return 0;
    }
}
