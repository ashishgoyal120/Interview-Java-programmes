package generalProgrammes;

public class test {

	public static void main(String[] args) {
    	String name = "madam";
    	String temp = "";
    	
    	for(int i = name.length()-1;i>=0;i--) {
    		temp=temp + name.charAt(i);
    	}
    	if(name.equals(temp)) {
    		System.out.println("Palindrome");
    	} else {
    		System.out.println("not");
    	}
    }
}