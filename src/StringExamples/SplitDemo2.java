package StringExamples;

public class SplitDemo2 {

    public static void main(String[] args) {

        String str = "hey baby you are so lovely";
        String[] sArr = str.split(" ");

        for(int i=0;i<sArr.length;i++)
        {
            int l = sArr[i].length();
            char ch = sArr[i].charAt(l-1);

            if(ch=='y')
              System.out.println(sArr[i]);
        }

    }
}
