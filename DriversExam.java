
public class DriversExam {
	
	private char[] correctAnswers;
	
	
	public DriversExam(char[]c)
	{
		correctAnswers = c;
	}
	
	
	
	
	
	public int totalCorrect(char[] studentAnswers)
	{
		int correct = 0;
		
		
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(correctAnswers[i] == studentAnswers[i])
				correct++;
		}
		return correct;
	}
			
	public int totalIncorrect(char[] studentAnswers)
	{
		int incorrect = 0;
				
				
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(correctAnswers[i] != studentAnswers[i])
				incorrect++;
		}
			return incorrect;
	}
		public int[] questionMissed(char[] studentAnswers)
		{
			int[] questionWrong = new int[totalIncorrect(studentAnswers)];
			int q = 1;
			for (int i = 0; i < studentAnswers.length; i++)
			{
				if(studentAnswers[i] == correctAnswers[i])
				{
					questionWrong[i] = q;
				}
				q++;
			}
				return questionWrong;
		}

}
