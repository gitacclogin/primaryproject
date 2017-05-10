package Logics.Java;

public class duplicate_letters {
 	public static void main(String[] args) {
 		    String S="tomato";
 		    int distinct = 0 ;
 		    for(int i=0;i<S.length();i++)
 		    {
 		    	for(int j=0;j<S.length();j++)
 		    	{
 		    		if(S.charAt(i)==S.charAt(j))
 		    		{
 		    			distinct++;
 		    		}
 		    		}
 		    	System.out.println(S.charAt(i)+"-"+distinct);
 		    	S=S.replace(String.valueOf(S.charAt(i)).trim(),"");
 		    	distinct=0;
 		    }
 		    }
 	}      