// @author Ronnie Nigash
// Our first push/pull test file
// Makes a list to add names to, then prints the list to the console with different greetings for each name
import java.util.*;

public class HelloWorld {

	public static void main(String[] Args) {
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
		nameList.add("Braden Ploger");
		nameList.add("Mathias Van Patten");
		nameList.add("Michelle Dalton");
		nameList.add("Kate Merifield");
		nameList.add("Ryan Holt");
		nameList.add("Olivia Pells");
		nameList.add("Clio Batali");
		nameList.add("Kawin Nikomborirak");

		loopDaLoop(nameList, generator);
	}

	private static void loopDaLoop(ArrayList<String> list, Random generator) {
		for (String name : list) {
			List<String> greetList = Arrays
					.asList("hi!",
							"how are you?",
							"did you do your homework?",
							"good morning.",
							"what's up?",
							"merhabalar!!",
							"welcome!",
							"happy Thanksgiving!",
							"allons-y!",
							"geronimo!",
							"greetings, fellow being.",
							"hola",
							"bonjour!",
							"Aloha",
							"Yikes!  What's that ahead of me?",
							"I did it?",
							"much hello wow",
							"���������� �������������������� �������������� ������ ����������-�������� ����������",
							"Whats good guys?", "sup?", "hello everyone!",
							"Wadup", "Buenos dias", "Hiya there!",
							"How you all doin?",
							"MOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");

			int randNum = generator.nextInt(greetList.size());

			System.out.printf("%s says \"%s\"\n", name, greetList.get(randNum));
		}
	}
}
