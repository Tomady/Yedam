package com.yedam.member;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemDAO extends DAO {
	// datatable 리스트.
	public List<DataTable> getDataTables() {
		connect();
		String sql = "select * from data_table";
		List<DataTable> list = new ArrayList<DataTable>();
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				DataTable dt = new DataTable();
				dt.setExtn(rs.getString("extn"));
				dt.setName(rs.getString("name"));
				dt.setOffice(rs.getString("office"));
				dt.setPosition(rs.getString("position"));
				dt.setSalary(rs.getString("salary"));
				dt.setStartDate(rs.getString("start_date"));
				list.add(dt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return list;
	}
	
	// datatable 업로드.
	public void insertDataTable(DataTable dt) {
		connect();
		String sql = "insert into data_table values(?,?,?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dt.getName());
			psmt.setString(2, dt.getPosition());
			psmt.setString(3, dt.getOffice());
			psmt.setString(4, dt.getExtn());
			psmt.setString(5, dt.getStartDate());
			psmt.setString(6, dt.getSalary());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + " insert.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// 상품 조회(상품아이디)
	public ItemVO searchItem(String id) {
		connect();
		String sql = "select * from item where prod_id=?";
		ItemVO vo = null;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ItemVO();
				vo.setLike_it(rs.getDouble("like_it"));
				vo.setOrigin_price(rs.getInt("origin_price"));
				vo.setProd_desc(rs.getString("prod_desc"));
				vo.setProd_id(rs.getInt("prod_id"));
				vo.setProd_image(rs.getString("prod_image"));
				vo.setProd_item(rs.getString("prod_item"));
				vo.setSale_price(rs.getInt("sale_price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}
	// 상품 업로드
	public ItemVO uploadProduct(ItemVO vo) {
		connect();
		String sql = "insert into item(prod_id, prod_item, prod_desc, like_it, origin_price, sale_price, prod_image)"
				+ "values(?,?,?,?,?,?,?)";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select max(prod_id) + 1 from item");
			int nextId = -1;
			
			if(rs.next()) {
				nextId = rs.getInt(1);	// 첫번째 칼럼.
				vo.setProd_id(nextId);	// 매개값의 참조변수의 값을 변경.
			}
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, nextId);
			psmt.setString(2, vo.getProd_item());
			psmt.setString(3, vo.getProd_desc());
			psmt.setDouble(4, vo.getLike_it());
			psmt.setInt(5, vo.getOrigin_price());
			psmt.setInt(6, vo.getSale_price());
			psmt.setString(7, vo.getProd_image());
			int r = psmt.executeUpdate(); // 실제 쿼리 실행.

			if (r > 0) {
				System.out.println(r + "건 입력");	// 처리 후 메세지 출력.
			} else {
				System.out.println("!!!입력 실패.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return vo;
	}

	// Shop in style list 가져오기
	public List<ItemVO> getItemList() {
		List<ItemVO> list = new ArrayList<>();
		ItemVO vo;
		String sql = "select * from item";
		connect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				vo = new ItemVO();
				vo.setLike_it(rs.getDouble("like_it"));
				vo.setOrigin_price(rs.getInt("origin_price"));
				vo.setProd_desc(rs.getString("prod_desc"));
				vo.setProd_id(rs.getInt("prod_id"));
				vo.setProd_image(rs.getString("prod_image"));
				vo.setProd_item(rs.getString("prod_item"));
				vo.setSale_price(rs.getInt("sale_price"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	// 스케줄 삭제 메소드(title)
	public boolean deleteSchedule(String title) {
		connect();
		String sql = "delete schedule where title = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);

			int r = psmt.executeUpdate();

			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	// 스케줄 등록 메소드(title, start, end);
	public boolean addSchedule(String title, String start, String end) {
		connect();
		String sql = "insert into schedule values(?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, start);
			psmt.setString(3, end);

			int r = psmt.executeUpdate();

			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	// fullCalendar용 샘플 데이터
	// List<Map<String, String>>
	public List<Map<String, String>> getSchedules() {
		List<Map<String, String>> schedules = new ArrayList<Map<String, String>>();
		connect();
		String sql = "select * from schedule";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("title", rs.getString("title"));
				map.put("start", rs.getString("start_date"));
				map.put("end", rs.getString("end_date"));
				schedules.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return schedules;
	}

	// 부서별 인원
	public Map<String, Integer> getMemberByDept() {
		connect();
		String sql = "select 'Administration', 1 from dual\n" + "union all\n" + "select 'Accounting', 2 from dual\n"
				+ "union all\n" + "select 'IT', 3 from dual\n" + "union all\n" + "select 'Executive', 3 from dual\n"
				+ "union all\n" + "select 'Shipping', 5 from dual\n" + "union all\n" + "select 'Sales', 3 from dual\n"
				+ "union all\n" + "select 'Marketing', 2 from dual";
		Map<String, Integer> map = new HashMap<String, Integer>();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return map;
	}

	// 페이지별 토탈 건수 가져오기.
	public int getTotalCount() {
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select count(1) from member");
			if (rs.next()) {
				int r = rs.getInt(1);
				System.out.println("조회건수: " + r);
				return r;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 0;
	}

	// 페이지별 데이터 조회.
	public List<MemberVO> getMemberByPage(String page) {
		connect();
		List<MemberVO> list = new ArrayList<>();
		String sql = "select b.* from\n" //
				+ "(select rownum as num, a.* from\n" //
				+ "(select * from member order by 1)a)b\n" //
				+ "where b.num >= ?\n" //
				+ "and b.num <= ?";
		System.out.println(sql);
		int start = (Integer.parseInt(page) - 1) * 10 + 1;
		System.out.println(start);
		int end = Integer.parseInt(page) * 10;
		System.out.println(end);

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, start);
			psmt.setInt(2, end);

			rs = psmt.executeQuery();

			while (rs.next()) {
				MemberVO mem = new MemberVO();
				mem.setUserId(rs.getString("user_id"));
				mem.setUserName(rs.getString("user_name"));
				mem.setBirth_date(rs.getString("birth_date"));
				mem.setAddress(rs.getString("address"));
				mem.setGender(rs.getString("gender"));
				mem.setPhone(rs.getString("phone"));
				list.add(mem);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	// 조회기능.
	public List<MemberVO> searchMemberList(MemberVO vo) {
		List<MemberVO> list = new ArrayList<>();
		String sql = "select * from member m\r\n" //
				+ "where user_id = nvl(?, user_id)\r\n" //
				+ "and nvl(user_name, '1') like '%'||?||'%'\r\n" //
				+ "and nvl(address, '1') like '%'||?||'%'\r\n" //
				+ "and nvl(phone, '1') like '%'||?||'%'";

		if (vo.getGender() != null && !vo.getGender().equals("all") && vo.getGender() != "") {
			sql = sql + "and gender = ?";
		}

		connect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUserId());
			psmt.setString(2, vo.getUserName());
			psmt.setString(3, vo.getAddress());
			psmt.setString(4, vo.getPhone());

			if (vo.getGender() != null && !vo.getGender().equals("all") && vo.getGender() != "") {
				psmt.setString(5, vo.getGender());
			}
			rs = psmt.executeQuery();

			while (rs.next()) {
				MemberVO mem = new MemberVO();
				mem.setUserId(rs.getString("user_id"));
				mem.setUserName(rs.getString("user_name"));
				mem.setBirth_date(rs.getString("birth_date"));
				mem.setAddress(rs.getString("address"));
				mem.setGender(rs.getString("gender"));
				mem.setPhone(rs.getString("phone"));
				list.add(mem);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

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
		sql = sql + " where user_id = ?";

		System.out.println(sql);
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

			if (r > 0) {
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
		} finally {
			disconnect();
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
		} finally {
			disconnect();
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
