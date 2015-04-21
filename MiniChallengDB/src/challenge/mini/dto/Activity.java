package challenge.mini.dto;

public class Activity {
	private int id;
	private String activity;
	
	public Activity(){}

	public Activity(String activity){
		this.activity = activity;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	
}
