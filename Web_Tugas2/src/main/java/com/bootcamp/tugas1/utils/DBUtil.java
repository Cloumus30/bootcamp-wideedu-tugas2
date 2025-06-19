package com.bootcamp.tugas1.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtil {
	
	public static Connection getConnection() throws NamingException, SQLException {
		Context initCtx = new InitialContext();
//		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) initCtx.lookup("jdbc/edu");

		Connection conn = ds.getConnection();
		System.out.println("Connected To Database");
		return conn;
	}

}
