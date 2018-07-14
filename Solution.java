import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
	    {
	        String[] words = sc.nextLine().split(" ");
	        int length1 = words[0].length();
	        int length2 = words[1].length();
	        
	        if(length1>length2)
	        {
	            for(int j=0;j<length1;j++)
	            {
	                if(j<length2)
	                    System.out.print(words[0].charAt(j)+""+words[1].charAt(j));
	                else
	                    System.out.print(words[0].charAt(j));
	            }
	        }
	        else if(length2>length1)
	        {
	            for(int j=0;j<length2;j++)
	            {
	                if(j<length1)
	                    System.out.print(words[0].charAt(j)+""+words[1].charAt(j));
	                else
	                    System.out.print(words[1].charAt(j));
	            }
	            
	        }
	        else
	        {
	            for(int j=0;j<length1;j++)
	                System.out.print(words[0].charAt(j)+""+words[1].charAt(j));
	        }
	        
	        System.out.println();
	    }

	}
}
