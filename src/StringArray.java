public class StringArray {

    public static void main(String[] args) {


        String[] stArr = new String[5];

        stArr[0] = "amol";
        stArr[1] = "praful";
        stArr[2] = "karishma";
        stArr[3] = "chaitanya";
        stArr[4] = "manisha";


        for(int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);


        String[] stArr1 = {"abc1","abc2","abc3","abc4","abc5"};

        for(int i=0;i<stArr1.length;i++)
            System.out.println(stArr1[i]);

    }
}
