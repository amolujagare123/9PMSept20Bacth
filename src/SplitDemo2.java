public class SplitDemo2 {

    public static void main(String[] args) {


    String str = "Hey baby you are so lovely";

    String[] stArr = str.split(" ");

    for(int i=0;i<stArr.length;i++)
    {
        if(stArr[i].endsWith("y")) // startwith & contains - try this as home work
        System.out.println(stArr[i]);
    }


    }

}
