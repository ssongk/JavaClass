package ch05.exercise;

interface StackInterface{
    int length();
    String pop();
    boolean push(String ob);
}

public class StringStack implements StackInterface{
    private String[] element;
    private int index;
    public StringStack(int capacity) {
        element = new String[capacity];
        index = 0;
    } 
    @Override
    public int length() {
        return index;
    }
    @Override
    public String pop() {
        if(index==0)
            return null;
        index--;
        return element[index];
    }
    @Override
    public boolean push(String ob) {
    if(index==element.length)
        return false;
    element[index++]=ob;
    return true;
    }
}
