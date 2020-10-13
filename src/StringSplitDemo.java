public class StringSplitDemo {
    public static void main(String[] args) {

        String str = "hi this is a java program";

        String[] stArr = str.split(" "); // => {"hi","this", "is", "a", "java", "program"}

        for(int i=0;i<stArr.length;i++)

        {
            System.out.println(stArr[i]);
        }

    }

}
