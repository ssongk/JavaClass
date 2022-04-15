package ch03;
// p.113 예제 3-11
public class ReturnArray {
    static int[] makeArray(){
        int temp[] = new int[4];
        for(int i=0; i<temp.length; i++)
            temp[i]=i;
        return temp; // makeArray()가 종료해도 생성된 배열은 소멸되지 않음
    }
    public static void main(String[] args) {
        int intArray[];
        intArray = makeArray();
        for(int i=0; i<intArray.length; i++)
            System.out.print(intArray[i]+" ");
    }
}
