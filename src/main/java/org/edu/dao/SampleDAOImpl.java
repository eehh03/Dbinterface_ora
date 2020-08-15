package org.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.edu.vo.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAOImpl implements IF_SampleDAO {

	@Inject
	private SqlSession sqlSession;
	//오바라이드-다형성
	@Override
	public void insertMember(MemberVO vo) {
		//*학생작업
	}

	@Override
	public List<MemberVO> selectMember() {
		return null;//*학생작업
	}

	@Override
	public void updateMember(MemberVO vo) {
		//*학생작업
	}

	@Override
	public void deleteMember(String userid) {
		//*학생작업	
	}

}
