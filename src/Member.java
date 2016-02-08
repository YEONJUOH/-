import java.util.ArrayList;
import java.util.List;

public class Member {

	private String name;
	private String pass_word;
	private List<Integer> room_num = new ArrayList<Integer>();

	public Member(String name, String pass_word) {
		this.name = name;
		this.pass_word = pass_word;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass_word() {
		return pass_word;
	}

	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}

	public List<Integer> getRoom_num() {
		return room_num;
	}

	public void setRoom_num(int room_num) {
		this.room_num.add(room_num);
	}

}
