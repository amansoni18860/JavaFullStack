package MutableStrings;

public class StringBuilder_And_StringBuffer {

	public static void main(String[] args) {

	// Thread Safe - Synchorized
		
    StringBuffer sb=new StringBuffer("Hello");
    sb.append("World");
    
    System.out.println(sb);
    
    // Not Thread Safe
     StringBuilder sb1=new StringBuilder("Rajesh");
     sb1.append("Singh");
     
     System.out.println(sb1);
    
	}

}
