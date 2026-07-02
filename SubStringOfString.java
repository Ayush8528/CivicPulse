package String;

public class SubStringOfString {
    public static void main(String[] args) {
        String p="Jaishankar";
        System.out.println(p.substring(3));
        System.out.println(p.substring(7));
        System.out.println(p.substring(1,5));
        String s="gopi";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+ " ");
            }
            System.out.println();
        }    }
}
