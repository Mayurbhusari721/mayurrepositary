package stringOperation;
public class Str 
{
	public static void main(String[] args) 
	{
		String M="Mayur Bhusari";
		String M1="MAYUR BHUSARI";
		System.out.println(M.length());
		// To measure length
		System.out.println(M.charAt(0));
		// which letter is present on that number
		System.out.println(M.charAt(12));
		System.out.println(M.substring(2));
		// To retrive remaining string content 
		System.out.println(M.substring(2,10));
		//To hide left and right data
		System.out.println(M.equals(M1));
		// to compare w.r.t content 
		System.out.println(M.equalsIgnoreCase(M1));
		//To compare w.r.t content (case is not mandatory)
		System.out.println(M.concat(" "+M1));
		//to join two string
		System.out.println(M.concat(" punekar"));
		// add the new content into existing string
		System.out.println(M.indexOf('y'));
		// to retrive index value of specific char(first appearance)
		System.out.println(M.replace('a','t'));
		// to replace existing char 
		System.out.println(M.trim());
		// to remove the space 
		System.out.println(M.startsWith("Aad"));
		System.out.println(M.endsWith("ss"));
		
	}

}
