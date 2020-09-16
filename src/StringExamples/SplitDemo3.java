package StringExamples;

public class SplitDemo3 {

    public static void main(String[] args) {
        String str = "hey baby you are so lovely";
        String[] sArr = str.split(" ");

        for(int i=0;i<sArr.length;i++)
        {
            if(sArr[i].endsWith("y"))
            System.out.println(sArr[i]);
        }

        String str1 ="this-is-a-demo";

        String[] sArr1 =  str1.split("-");

        System.out.println(sArr1[3]);
    }
}
