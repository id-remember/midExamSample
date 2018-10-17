package kr.ac.dit.persistence;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.MemberVO;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertMember(MemberVO memberVO) throws Exception {

	}
	@Override
	public List<MemberVO> selectMemberList() throws Exception {
		List<MemberVO> items = new ArrayList<MemberVO>();
		return items;
	}
}
