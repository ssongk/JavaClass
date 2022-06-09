package ch05.exercise.StackInterface2;

public class StackStack implements Stack{
    private String[] element;
    private int tos;
    public StackStack(int capacity) {
        element = new String[capacity];
        tos = -1;
    } 
    @Override
    public int length() {
        return tos+1;
    }
    @Override
    public int capacity() {
        return element.length;
    }
    @Override
    public String pop(){
        if(tos==-1)
            return null;
        String s = element[tos];
        tos--;
        return s;
    }
    @Override
    public boolean push(String str) {
        if(tos==element.length-1)
            return false;
        else{
            tos++;
            element[tos]=str;
            return true;
        }
    }
}
