package db;
import java.sql.*;
import java.util.ArrayList;

import models.*;
import play.db.DB;

@SuppressWarnings("deprecation")
public class MySQLCon
{
	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;
	
	public void test()
	{
		//test to connect to the database
		//Requires Connection, PreparedStatement, ResultSet
		//figuring this out was sheer madness
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("SELECT * from USER");
			//st.setString(1, "andrew"); //integer 1 refers to the 1st question mark
			rs = st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			st.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("MySQL connection test success");
	}
	
	public ArrayList<DBUser> getUsers()
	{
		ArrayList<DBUser> list = new ArrayList<DBUser>();
		try{
			conn = DB.getConnection();
			st = conn.prepareStatement("SELECT * from USER");
			//st.setString(1, "andrew"); //integer 1 refers to the 1st question mark
			rs = st.executeQuery();
			while(rs.next())
			{
				DBUser user = new DBUser();
				//System.out.println(rs.getInt(1) + " " + rs.getString(2));
				user.setUserId(((Integer)rs.getInt(1)).toString());
				user.setName(rs.getString(2));
				list.add(user);
			}
			st.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	
	//returns the integer id of the given user
	//returns 0 if the user name does not exist in the database
	public int getUserId(String userName) throws SQLException
	{
		int result = 0;
		conn = DB.getConnection();
		st = conn.prepareStatement("SELECT * from USER where name = ?");
		st.setString(1, userName);
		ResultSet rs = st.executeQuery();
		while (rs.next())
		{
			result = rs.getInt(1);
		}
		st.close();
		conn.close();
		return result;
	}
	
	public String getUserName(String userId) {
		String result = null;
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("SELECT * from USER where iduser = ?");
			st.setString(1, userId);
			ResultSet rs = st.executeQuery();
			while (rs.next())
			{
				result = rs.getString(2);
			}
			st.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	//adds a user with the given userName to the database
	//returns that user's id
	//returns 0 and does nothing if that user already exists
	public int addUser(String userName)
	{
		int result = 0;
		try
		{
			result = getUserId(userName); // result == 0 if userName is available
			if(result == 0)
			{
				conn = DB.getConnection();
				st = conn.prepareStatement("INSERT into USER (name) values (?)");
				st.setString (1, userName);
				st.execute(); //use execute instead of executeQuery (???!!) Because it is an insert, I guess
				st.close();
				conn.close();
				result = getUserId(userName);
				System.out.println("user " + userName + " added");
			}
			else
			{
				System.out.println("user " + userName + " already exists");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	
	public void deleteUser(String userId)
	{
		//first, delete all the samples belonging to this user
		//(this automatically deletes the segments within each sample)
		ArrayList<DBSample> samples = getSamples(userId);
		for(DBSample s : samples)
		{
			String sampleId = s.getSampleId();
			deleteSample(sampleId);
		}
		//then delete the user
		try
		{
			int userIdInteger = Integer.parseInt(userId);

			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE from USER where iduser = ?");
			st.setInt(1, userIdInteger);
			st.execute();
			st.close();
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	//return sample of the given id
	public DBSample getSample(String sampleId)
	{
		DBSample sample = null;
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("select * from sample where sampleId = ?");
			st.setString(1, sampleId);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				sample = new DBSample();
				sample.setSampleId(((Integer)rs.getInt(1)).toString());
				sample.setUserId(((Integer)rs.getInt(2)).toString());
				sample.setName(rs.getString(3));
				sample.setDateCreated(rs.getDate(4));
				sample.setR(rs.getString(5));
				sample.setG(rs.getString(6));
				sample.setB(rs.getString(7));
				sample.setSegmentCount(rs.getString(11));
				sample.setWidth(rs.getString(12));
				sample.setHeight(rs.getString(13));
				sample.setNumBytes(rs.getString(14));
				sample.setComment(rs.getString(15));
				sample.setBloodStatus(rs.getString(16));
			}
			st.close();
			conn.close();		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return sample;
	}
	
	//return list of all the samples of the given user
	public ArrayList<DBSample> getSamples(String userId)
	{
		ArrayList<DBSample> samples = new ArrayList<DBSample>();
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("SELECT * from sample where userId = ?");
			st.setString(1, userId);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				DBSample sample = new DBSample();
				sample.setSampleId(((Integer)rs.getInt(1)).toString());
				sample.setUserId(((Integer)rs.getInt(2)).toString());
				sample.setName(rs.getString(3));
				sample.setDateCreated(rs.getDate(4));
				sample.setR(rs.getString(5));
				sample.setG(rs.getString(6));
				sample.setB(rs.getString(7));
				sample.setSegmentCount(rs.getString(11));
				sample.setWidth(rs.getString(12));
				sample.setHeight(rs.getString(13));
				sample.setNumBytes(rs.getString(14));
				sample.setComment(rs.getString(15));
				sample.setBloodStatus(rs.getString(16));
				samples.add(sample);
			}
			st.close();
			conn.close();		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return samples;
	}
	
	//return id of the sample as a String
	public String addSample(String userId, DBSample sample)
	{
		ArrayList<DBSample> allSamples = getSamples(userId);
		//do nothing and return 0 if this image already exists
		for(DBSample s : allSamples)
		{
			if(s.getName() != null)
			{
				if(s.getName().equals(sample.getName()))
				{
					return "0";
				}
			}
		}
		try
		{
			//insert a new sample into the database
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT into sample (userId, name, x, y, z, segmentCount, width, height, bytes, comment, bloodStatus)"
					+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, userId);
			st.setString(2, sample.getName());
			st.setString(3, sample.getR());
			st.setString(4, sample.getG());
			st.setString(5, sample.getB());
			st.setString(6, sample.getSegmentCount());
			st.setString(7, sample.getWidth());
			st.setString(8, sample.getHeight());
			st.setString(9, sample.getNumBytes());
			st.setString(10, sample.getComment());
			st.setString(11, sample.getBloodStatus());
			st.execute();
			st.close();
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		allSamples = getSamples(userId);
		for(DBSample s : allSamples)
		{
			if(s.getName() != null)
			{
				if(s.getName().equals(sample.getName()))
				{
					return s.getSampleId();
				}
			}
		}
		return "-1"; //CASE: error
	}
	
	public void addSegment(DBSegment segment)
	{
		//DBSample sample = getSample(segment.getSampleId());
		//segment.setBloodStatus(sample.getBloodStatus());
		try
		{
			//insert a new sample into the database
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT into segment "
					+ "(sampleId, label, area, width, height, perimeter, meanR, meanG, meanB, convexity, circularity, stdDevR, relativeX, relativeY, relativeArea, segmentCount, bloodStatus)"
					+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, segment.getSampleId());
			st.setString(2, segment.getLabel());
			st.setString(3, segment.getArea());
			st.setString(4, segment.getWidth());
			st.setString(5, segment.getHeight());
			st.setString(6, segment.getPerimeter());
			st.setString(7, segment.getMeanR());
			st.setString(8, segment.getMeanG());
			st.setString(9, segment.getMeanB());
			st.setString(10, segment.getConvexity());
			st.setString(11, segment.getCircularity());
			st.setString(12, segment.getStdDevR());
			st.setString(13, segment.getRelativeX());
			st.setString(14, segment.getRelativeY());
			st.setString(15, segment.getRelativeArea());
			st.setString(16, segment.getSegmentCount());
			st.setString(17, segment.getBloodStatus());
			//System.out.println("segment blood status = " + segment.getBloodStatus());
			st.execute();
			st.close();
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void deleteSample(String sampleId)
	{
		deleteSegments(sampleId);
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE from sample where sampleId = ?");
			Integer sampleIdInteger = Integer.parseInt(sampleId);
			st.setInt(1, sampleIdInteger);
			st.execute();
			st.close();
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	//delete all the segments belonging to the sample with this sampleId
	//secondary method to be called by deleteSample
	public void deleteSegments(String sampleId)
	{
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE from segment where sampleId = ?");
			Integer sampleIdInteger = Integer.parseInt(sampleId);
			st.setInt(1, sampleIdInteger);
			st.execute();
			st.close();
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public ArrayList<DBSegment> getSegments(String sampleId)
	{
		ArrayList<DBSegment> segments = new ArrayList<DBSegment>();
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("SELECT * from segment where sampleId = ?");
			st.setString(1, sampleId);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				DBSegment segment = new DBSegment();
				segment.setSegmentId(((Integer)rs.getInt(1)).toString());
				segment.setSampleId(sampleId);
				segment.setLabel(((Integer)rs.getInt(3)).toString());
				segment.setArea(((Integer)rs.getInt(4)).toString());
				segment.setWidth(((Integer)rs.getInt(5)).toString());
				segment.setHeight(((Integer)rs.getInt(6)).toString());
				segment.setPerimeter(((Integer)rs.getInt(7)).toString());
				segment.setMeanR(((Integer)rs.getInt(8)).toString());
				segment.setMeanG(((Integer)rs.getInt(9)).toString());
				segment.setMeanB(((Integer)rs.getInt(10)).toString());
				segment.setConvexity(((Double)rs.getDouble(11)).toString());
				segment.setCircularity(((Double)rs.getDouble(12)).toString());
				segment.setStdDevR(((Double)rs.getDouble(13)).toString());
				segment.setRelativeX(((Double)rs.getDouble(14)).toString());
				segment.setRelativeY(((Double)rs.getDouble(15)).toString());
				segment.setRelativeArea(((Double)rs.getDouble(16)).toString());
				segment.setSegmentCount(((Integer)rs.getInt(17)).toString());
				segment.setBloodStatus(rs.getString(18));
				segments.add(segment);
			}
			st.close();
			conn.close();		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return segments;
	}
	
	public String updateBloodStatus(String sampleId, String bloodStatus)
	{
		updateBloodStatusSegments(sampleId, bloodStatus);
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("UPDATE sample SET bloodStatus = ? where sampleId = ?");
			st.setString(1, bloodStatus);
			st.setString(2, sampleId);
			st.execute();
			st.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return bloodStatus;
	}
	
	public String updateBloodStatusSegments(String sampleId, String bloodStatus)
	{
		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement("UPDATE segment SET bloodStatus = ? where sampleId = ?");
			st.setString(1, bloodStatus);
			st.setString(2, sampleId);
			st.execute();
			st.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return bloodStatus;
	}
	
}
