package stack.controller;

import java.util.Stack;

public class StackController 
{
	private Stack<String> titles;
	
	public StackController()
	{
		titles = new Stack<String>();
		
		fillStack(30000);
		executeStack();
	}
	
	public void start()
	{
		
	}

	private void executeStack()
	{
		
		for(int spot = 0; spot < titles.size(); spot++)
		{
			String toReturn = "";
			toReturn = titles.peek();
			titles.pop();
			System.out.println(toReturn);
		}
		
	}

	private void fillStack(int items) 
	{
		for(int bandana = 0; bandana < items + 1; bandana++)
		{
			int letters = (int)(Math.random() * 20);
			String title = "";
			for(int spot = 0; spot < letters; spot++)
			{
				int item = (int)(Math.random() * 27);
				
				if(item == 0)
				{
					title += "";
				}
				else if(item == 1)
				{
					title += "A";
				}
				else if(item == 2)
				{
					title += "B";
				}
				else if(item == 3)
				{
					title += "C";
				}
				else if(item == 4)
				{
					title += "D";
				}
				
				else if(item == 5)
				{
					title += "E";
				}
				else if(item == 6)
				{
					title += "F";
				}
				else if(item == 7)
				{
					title += "G";
				}
				else if(item == 8)
				{
					title += "H";
				}
				else if(item == 9)
				{
					title += "I";
				}
				else if(item == 10)
				{
					title += "J";
				}else if(item == 11)
				{
					title += "K";
				}
				else if(item == 12)
				{
					title += "L";
				}
				else if(item == 13)
				{
					title += "M";
				}
				else if(item == 14)
				{
					title += "N";
				}
				else if(item == 15)
				{
					title += "O";
				}
				else if(item == 16)
				{
					title += "P";
				}
				else if(item == 17)
				{
					title += "Q";
				}
				else if(item == 18)
				{
					title += "R";
				}
				else if(item == 19)
				{
					title += "S";
				}
				else if(item == 20)
				{
					title += "T";
				}
				else if(item == 21)
				{
					title += "U";
				}
				else if(item == 22)
				{
					title += "V";
				}
				else if(item == 23)
				{
					title += "W";
				}
				else if(item == 24)
				{
					title += "X";
				}
				else if(item == 25)
				{
					title += "Y";
				}
				else if(item == 26)
				{
					title += "Z";
				}
				
			}
			
			titles.push(title);
			
			
		}
		
		
	}
}
