package class13;

public class Split {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[1].trim());
    }
}
