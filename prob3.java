public class prob3{
	static public void main(String []args){
	double maxMarks = 100.0;
	int totalSubjects = 5;
	double aggregateMarks = 0.0;
	double percentageMarks = 0.0;
	double totalMaxMarks = maxMarks * totalSubjects;
	double []marks = {80,90,75,60,100};
	for (int i = 0; i < totalSubjects; i++)
	{
		aggregateMarks += marks[i];
	}
	
	percentageMarks = aggregateMarks * 100 / totalMaxMarks;
	System.out.println("Aggregate marks are" + " " + aggregateMarks);
	System.out.println("Percentage marks are" + " " + percentageMarks);
	}
}