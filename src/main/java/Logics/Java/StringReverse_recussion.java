package Logics.Java;

public class StringReverse_recussion {


    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) 
    {
    	StringReverse_recussion obj=new StringReverse_recussion();
        String str = "Quora";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");    
    }    
}