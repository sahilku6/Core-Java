package encapsulationPractice;

public class ExamResult {
	private String result;
	int totalMarks;
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
		if(totalMarks>300) {
			setResult("Paas");
		}else {
			setResult("Fail");
		}
	}
	public String getResult() {
		return result;
	}

	private void setResult(String result) {
		this.result=result;
	}
}
