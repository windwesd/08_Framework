package edu.kh.project.main.service;

import java.util.List;

import edu.kh.project.member.dto.Member;

public interface MainService {

	/** 전체 회원 조회
	 * @return list
	 */
	List<Member> selectMemberList();

	
	/** 빠른 로그인
	 * @param memberNo
	 * @return loginMember
	 */
	Member directLogin(int memberNo);


	/** 패스워드 초기화
	 * @param memberNo
	 * @return result
	 */
	int resetPw(int memberNo);


	/** 탈퇴 상태 변경
	 * @param memberNo
	 * @return
	 */
	int changeBtn(int memberNo);

}
