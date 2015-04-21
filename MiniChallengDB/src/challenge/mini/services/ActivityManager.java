package challenge.mini.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import challenge.mini.db.DBConnection;
import challenge.mini.dto.Activity;

public class ActivityManager {
	boolean isNull;
	public void addActivity(Activity activity){
		String sql = "INSERT INTO todo_list (activity) VALUES (?);";
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, activity.getActivity());
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Activity getNote(int id){
		
		Activity activity = new Activity();
		    
			Connection conn = DBConnection.getConnection();
			
			try{
				PreparedStatement pstmt = conn.prepareStatement("Select * from todo_list where idtodo_list = ?;");
				pstmt.setInt(1, id);
				ResultSet rs= pstmt.executeQuery();
			
				if(rs.next()){
					activity.setActivity(rs.getString("activity"));
				
				}
			
				conn.close();
				pstmt.close();
				rs.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}return activity;
			
		}

	
	public int maxIndex(){
		
		Activity activity = new Activity();
		    
			Connection conn = DBConnection.getConnection();
			
			try{
				PreparedStatement pstmt = conn.prepareStatement("SELECT MAX(idtodo_list) as idtodo_list from todo_list");
				
				ResultSet rs= pstmt.executeQuery();
			
				if(rs.next()){
					return rs.getInt("idtodo_list");
				}
				
			
				conn.close();
				pstmt.close();
				rs.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 1;
			
		}

}
