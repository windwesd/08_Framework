package edu.kh.project.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.dto.Member;

@Mapper
public interface MainMapper {

	
	/** 전체 회원 조회
	 * @return list
	 */
	List<Member> selectMemberList();

	/** 빠른 로그인
	 * @param memberNo
	 * @return loginMember
	 */
	Member directLogin(int memberNo);

	
	/** 비밀번호 초기화
	 * @param memberNo
	 * @return result
	 */
	int resetPw(int memberNo);

	
	/** 탈퇴 상태 변경
	 * @param memberNo
	 * @return result
	 */
	int changeBtn(int memberNo);

}
