import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Country leader problem.
 * @author Joy Ghosh
 * 
 */
public class CountryLeader {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = Integer.parseInt(in.nextLine());		//Read the number of test cases.
		
		for(int i=1;i<=t;i++){
			int N = Integer.parseInt(in.nextLine());	//Number of people in the country.
			int max_chars_seen = Integer.MIN_VALUE; 
			String leader = ""; String name = ""; String tmp = "";
			
			for(int j=0;j<N;j++){
				name = in.nextLine();
				tmp = name.replaceAll(" ", "");
				Set<Character> chars = new HashSet<Character>(); 
				
				for(int k=0;k<tmp.length();k++){
					chars.add(tmp.charAt(k));
				}
				
				if(chars.size() > max_chars_seen){
					max_chars_seen = chars.size();
					leader = name;
				}else if(chars.size() == max_chars_seen){ 
					if(leader.compareTo(name) > 0){
						leader = name;
					}
				}
			}
			System.out.println("Case #"+i+": "+leader);
		}
		
		in.close();
	}
}
