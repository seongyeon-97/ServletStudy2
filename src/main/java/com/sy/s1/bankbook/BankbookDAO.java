package com.sy.s1.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sy.s1.util.DBConnector;

public class BankbookDAO {
	
	private DBConnector dbConnector;
	
	public BankbookDAO() {
		dbConnector = new DBConnector();
	}
	
	public ArrayList<BankbookDTO> getList() {
		Connection con = dbConnector.getConnect();
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<BankbookDTO> ar = new ArrayList<BankbookDTO>();
		String sql = "SELECT * FROM BANKBOOK";
		try {
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				BankbookDTO dto = new BankbookDTO();
				dto.setBookNumber(rs.getLong("booknumber"));
				dto.setBookName(rs.getString("bookname"));
				dto.setBookRate(rs.getDouble("bookrate"));
				dto.setBookSale(rs.getInt("booksale"));
				ar.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbConnector.disConnect(rs, st, con);
		}
		return ar;
	}
	
	public BankbookDTO getSelect(BankbookDTO dto) {
		Connection con = dbConnector.getConnect();
		PreparedStatement st = null;
		ResultSet rs = null;
		BankbookDTO result = null;
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUMBER=?";
		try {
			st = con.prepareStatement(sql);
			st.setLong(1, dto.getBookNumber());
			rs = st.executeQuery();
			
			if(rs.next()) {
				result = new BankbookDTO();
				result.setBookNumber(rs.getLong("bookNumber"));
				result.setBookName(rs.getString("bookName"));
				result.setBookRate(rs.getDouble("bookRate"));
				result.setBookSale(rs.getInt("bookSale"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbConnector.disConnect(rs, st, con);
		}
		
		return result;
		
	}
}
