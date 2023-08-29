package chapter07;

public class VarParameterExercise0235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HspMethod hsp = new HspMethod();
		System.out.println(hsp.showScore("Tom", 90.5, 82));
		System.out.println(hsp.showScore("aaa", 90.5, 82,22,33,44));
	}

}
class HspMethod {
	public String showScore(String name, double... scores) {
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + "有" + scores.length + "门课的成绩总分为=" + totalScore;
	}
}