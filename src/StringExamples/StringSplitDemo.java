package StringExamples;

public class StringSplitDemo {

    public static void main(String[] args) {

        String str ="this is a java program";

        String[] sArr =  str.split(" ");

        for(int i=0;i<sArr.length;i++ )
        {
            System.out.println(sArr[i]);
        }


    }
}
