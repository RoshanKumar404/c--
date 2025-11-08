import java.util.Arrays;

public class Stringbuilder {
    public static void main(String[] args){
        // StringBuilder builder=new StringBuilder();
        // for(int i=0;i<26;i++){
        //     char ch= (char)('a'+i);
        //     builder.append(ch);
        // }
        // System.out.println(builder);
String name= "ROshan kumar";
String[] Splitted =name.split(" ");
for(String split:Splitted){
    System.out.println(split);
}
System.out.println(Arrays.toString(name.split(" ")));
System.out.println(name.indexOf('a'));


    }
}
