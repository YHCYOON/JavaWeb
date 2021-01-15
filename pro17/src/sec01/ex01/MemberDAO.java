package sec01.ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class MemberDAO {

	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public MemberDAO() {
		
	}
}
