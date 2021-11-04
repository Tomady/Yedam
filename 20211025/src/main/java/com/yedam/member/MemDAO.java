package com.yedam.member;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemDAO extends DAO {
	// 수정기능.
	public Map<String, Object> updateMember(MemberVO vo) {
		// retCode:OK, retVal: vo
		// retCode:NG, retVal: errMsg
		String sql = "update member ";
		sql = sql + "set user_name = ?";
		sql = sql + ", birth_date = ?";
		sql = sql + ", gender = ?";
		sql = sql + ", address = ?";
		sql = sql + ", phone = ?";
		sql = sql + "where user_id = ?";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("retCode", "NG");
		map.put("retVal", "Error!!");
		
		connect();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUserName());
			psmt.setString(2, vo.getBirth_date());
			psmt.setString(3, vo.getGender());
			psmt.setString(4, vo.getAddress());
			psmt.setString(5, vo.getPhone());
			psmt.setString(6, vo.getUserId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
			
			if(r > 0) {
				map.put("retCode", "OK");
				map.put("retVal", vo);
				return map;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			map.put("retVal", e.getMessage());
			return map;
		} finally {
			disconnect();
		}
		return map;
		
	}

	// 한건 삭제.
	public boolean deleteMember(String id) {
		String sql = "delete from member where user_id = ?";
		connect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제.");

			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return false;
	}

	// 한건 조회.
	public MemberVO getMember(String id) {
		MemberVO vo = new MemberVO();
		String sql = "select * from member where user_id = ?";
		connect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				vo.setUserId(rs.getString("user_id"));
				vo.setUserName(rs.getString("user_name"));
				vo.setBirth_date(rs.getString("birth_date"));
				vo.setAddress(rs.getString("address"));
				vo.setGender(rs.getString("gender"));
				vo.setPhone(rs.getString("phone"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

	// 한건 입력.
	public boolean insertMember(MemberVO vo) {
		String sql = "insert into member(user_id, user_name, address, phone, birth_date, gender) values(?,?,?,?,?,?)";
		connect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUserId());
			psmt.setString(2, vo.getUserName());
			psmt.setString(3, vo.getAddress());
			psmt.setString(4, vo.getPhone());
			psmt.setString(5, vo.getBirth_date());
			psmt.setString(6, vo.getGender());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public List<MemberVO> getMemberList() {
		String sql = "select * from member";
		connect();
		List<MemberVO> memberList = new ArrayList<MemberVO>();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUserId(rs.getString("user_id"));
				vo.setUserName(rs.getString("user_name"));
				vo.setBirth_date(rs.getString("birth_date"));
				vo.setAddress(rs.getString("address"));
				vo.setGender(rs.getString("gender"));
				vo.setPhone(rs.getString("phone"));
				memberList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return memberList;
	}
}
