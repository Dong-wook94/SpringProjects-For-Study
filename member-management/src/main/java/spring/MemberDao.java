package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 원래는 db와 연동하는 클래스 하지만 현재는 그냥 map을 이용해서 구현한다.
 *
 */
public class MemberDao {

	private static long nextId = 0;

	private Map<String, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}

	public void update(Member member) {
		map.put(member.getEmail(), member);
	}

	public Collection<Member> selectAll() {
		return map.values();
	}
}