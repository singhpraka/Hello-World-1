// @author Ronnie Nigash
// Our first push/pull test file
// Makes a list to add names to, then prints the list to the console with different greetings for each name
import java.util.*;
public class HelloWorld {
	
	public static void main(String[] Args){
		ArrayList<String> nameList = new ArrayList<String>();
		Random generator = new Random();
		
	        nameList.add("Alumni: Faust");
	        nameList.add("Alumni: Keet Curtis");
	        nameList.add("Alumni: Ronnie Nigash");
	        nameList.add("Ben DeVries");
	        nameList.add("Binnur");
	        nameList.add("Jack Stratton");
	        nameList.add("Joe Van Dyke");
	        nameList.add("Mr. Chee");
	        nameList.add("Tarkan Al-Kazily");
	        nameList.add("Noah Levine");
	        nameList.add("Michaela Leung");
	        nameList.add("Clare Liguori");
	        nameList.add("Clint Pells");
	        nameList.add("James Sovick");
		nameList.add("Mathias Van Patten");
		
		loopDaLoop(nameList, generator);
	}

	private static void loopDaLoop (ArrayList<String> list, Random generator){
		for(String name : list){
			List<String> greetList = Arrays.asList("hi!", "how are you?",
                                                   "did you do your homework?",
                                                   "good morning.", "what's up?",
                                                   "merhabalar!!", "welcome!",
                                                   "happy Thanksgiving!",
						   "allons-y!", "geronimo!", 
						   "greetings, fellow being.",
						   "hola", "bonjour!", "Aloha",
						   "I did it?","much hello wow", "Путин величайшим лидером мир когда-либо видел");
			int randNum = generator.nextInt(greetList.size());
			
			System.out.printf("%s says \"%s\"\n", name, greetList.get(randNum));
		}
	}
}
