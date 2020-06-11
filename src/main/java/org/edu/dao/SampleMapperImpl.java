package org.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.edu.vo.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class SampleMapperImpl implements IF_SampleMapper {

	//...root-context.xml의 org.mybatis.spring.SqlSessionTemplate을 주입받아 사용함.
	@Inject
	private SqlSession sqlSession;
		
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserId(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUname(String uid, String upw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchUname(String type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	//학생실습용 추가
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sqlSession.insert("org.edu.dao.IF_SampleMapper.insertMember", vo);
	}
	//학생실습용 추가
	@Override
	public void deleteMember(String userid) throws Exception {
		sqlSession.delete("org.edu.dao.IF_SampleMapper.deleteMember", userid);		
	}

	@Override
	public List<MemberVO> listMember() throws Exception {
		return sqlSession.selectList("org.edu.dao.IF_SampleMapper.listMember");
	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		sqlSession.update("org.edu.dao.IF_SampleMapper.updateMember", vo);
		
	}

}
