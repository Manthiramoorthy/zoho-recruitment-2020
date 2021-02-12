import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("Enter the word");
			String word = scanner.next();
			if(word.length() % 2 == 1)
			{
				for(int i = 0; i < word.length(); i++)
				{
					int flag = (word.length() / 2);
					for(int j = 0; j < word.length(); j++)
					{
						if(j < word.length() - 1 - i)
						{
							System.out.print(" ");
						}else
						{
							System.out.print(word.charAt(flag));
							flag++;
							if(flag >= word.length())
							{
								flag = 0;
							}
						}
					}
					System.out.println("");
				}
			}else
			{
				System.out.println("Please, Enter valid word \nNote : should be a word with odd letter count");
			}
			System.out.println("Do you want to continue?(Y/N)");
		}while(scanner.next().charAt(0) == 'Y');
	}
}