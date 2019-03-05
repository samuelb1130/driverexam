
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
	
	
}
