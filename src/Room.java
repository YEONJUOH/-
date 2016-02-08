import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.List;

public class Room {

	static int room_last = 0;
	private int room_num;
	private List<Member> Members = new ArrayList<Member>();

	public Room() {
		room_num = room_last;
		room_last++;

	}

	public List<Member> getMembers() {
		return Members;
	}

	public void setMembers(List<Member> members) {
		Members = members;

		for (int i = 0; i < members.size(); i++) {
			members.get(i).setRoom_num(room_num);

		}

	}

	public int getRoom_num() {
		
		return room_num;
	}

	
		

}
