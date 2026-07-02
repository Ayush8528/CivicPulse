package String;

public class Stringbasics {
    //palinmdrome no.
    static boolean ispalidrome(String str){
        String orignal=str;
        String reverse= reversestring(orignal);
    for(int i=0;i<orignal.length();i++){
        char ch1=orignal.charAt(i);
        char ch2=reverse.charAt(i);
            if(ch1!=ch2){
                return false;

            }        }
    return true;

    }


 static int getvowelsCount(String str) {
     int count = 0;
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch == 'a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u'||ch == 'A' || ch== 'E' || ch=='I' || ch=='O' || ch=='U') {
             count++;
         }
     }
     return count;
 }
 //reverse
 static String reversestring(String str){
     String reverse="";
     int n=str.length();
     for(int i=n-1;i>=0;i--){
         char ch=str.charAt(i);
         reverse=reverse +ch;
     }
     return reverse;
 }
    public static void main(String[] args){
     String str="noo n";
     System.out.println(ispalidrome(str));
 }

    //public static void printString(String str) {
      //  int n = str.length();
        //for (int i = 0; i < n; i++) {
          //  char ch = str.charAt(i);
            //System.out.println(ch);
       // }
    //}

    //public static void main(String[] args) {  // ✅ Fixed
      //  String str = "love";
        //printString(str);
    //}
//}
    //name=name.replace('A','v');
        //System.out.println(name);
     //    String input="MY,name,is,love,babber";
       //  String[] words=input.split(",");
//for(String str: words){
  //  System.out.println(str);

//}        //String name="Ayush is chandra";
        //System.out.println(name.startsWith("Ayush"));
        //System.out.println(name.endsWith("chandra"));
        //char[] crr=name.toCharArray();
        //for(char ch:crr){
          //  System.out.println("Value of char: " +ch);
        //}

        //int num= 5333;
        //String str= String.valueOf(num);
        //System.out.println(num+1);
       // System.out.println(str +1);

        //String str="My name is Love Babber";
        //System.out.println(str.contains("Love"));
       // System.out.println(str .substring(3, 7));

        //empty->length=0
        //blank->empty or sirf speces h string
       // String str=" ";
       // System.out.println(str.length());
        //System.out.println(str.isEmpty());
        //System.out.println(str.isBlank());
         //String name="     helloG   ";
        //System.out.println(name.length());
       // name=name.trim();
       // System.out.println(name.length());
        //System.out.println(name.toUpperCase());
      //  System.out.println(name.toLowerCase());

          //Scanner sc= new Scanner(System.in);
        //System.out.println("provide the string content: ");
          //String str=sc.nextLine();
        //System.out.println("value of next line: " + str);
        //System.out.println("provide the string content: ");
        //String str1=sc.next();
        //System.out.println("value of next  " + str1);


        //this is not case sensitive it only matched the value
       // String str="helloG";
        //String str1="hElloG";
        //if (str.equalsIgnoreCase(str1)){
          //  System.out.println("equal");
        //}else{
         //   System.out.println("notequal");

        //}
        // this is a case sensitive match each case
         //
        // String str="helloG";
        //String str1="helloG";
        //if (str.equals(str1)){
          //  System.out.println("equal");
        //}else{
          //  System.out.println("notequal");
//
   //      }
//

        //str and str1 refrese to the same value in string pool
        //thats why it is showing equal

        //String str="helloG";
        //String str1="helloG";
        //if (str==str1){
          //  System.out.println("equal");
        //}else{
          //  System.out.println("notequal");
//
   //      }


        //String firstName="Love";
        //String lastName=new String("babber");
        //System.out.println(firstName +" " + lastName);
        //System.out.println(firstName.length());
        //System.out.println(firstName.charAt(1));
    }
