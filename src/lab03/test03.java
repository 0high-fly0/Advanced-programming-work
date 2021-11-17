package lab03;

import java.util.*;

public class test03 {
    public static void main(String[] args) {
        String[] keywordString = {"abstract", "finally", "public",
                "boolean", "float", "return", "break", "for", "short", "byte",
                "goto", "static", "case", "if", "super", "catch", "implements",
                "switch", "char", "import", "synchronized", "class",
                "instanceof", "this", "const", "int", "throw", "continue",
                "interface", "throws", "default", "long", "transient", "do",
                "native", "try", "double", "new", "void", "else", "package",
                "volatile", "extends", "private", "while", "final",
                "protected", "true", "null"};
        Set<String> keywordSet =
                new HashSet<String>(Arrays.asList(keywordString));
        int count=0;
        Scanner input=new Scanner(System.in);
        String line="";
        while (input.hasNextLine()){
            String xline=input.nextLine();
            if (xline.equals("****")) break;//while
            if (xline.indexOf("//")!=-1) xline=xline.substring(0,xline.indexOf("//"));//delete annotation
            xline=xline.replaceAll("\"[^\"]*\"","");
            line=line+" "+xline;
        }
        line=line.replaceAll("/\\*\\s*.*\\s*\\*/", " ");
        String[] tokens = line.split("[\\s\\p{P}]");
        for (String token: tokens) {
            if (keywordSet.contains(token))
                count++;
        }

        System.out.println("keywords:"+ count);
//        System.out.println(line);
//        for (String e:keywordString) {
//            String str=line;
//            while(str.indexOf(e) != -1) {
//                str = str.substring(str.indexOf(e) + 1,str.length());
//                count++;
//            }
//
//        }
//        System.out.println("keywords:"+count);
    }
}



