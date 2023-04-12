package entities;

public class Task extends Lesson {

	private String description;
	private Integer QuestionCount;
	
	public Task() {
		super();
	}

	public Task(String title, String description, Integer questionCount) {
		super(title);
		this.description = description;
		QuestionCount = questionCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestionCount() {
		return QuestionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		QuestionCount = questionCount;
	}

	@Override
	public int duration() {
		return QuestionCount * 5 * 60;
	}
}
