package ConnectToSQL;


import java.sql.ResultSet;

import java.sql.SQLException;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.lang.ArrayIndexOutOfBoundsException;

import java.util.regex.PatternSyntaxException;

/**
*
* @author Ly
*/
public class main{

/**
* @param args the command line arguments
*/

public  main(final String[] args) throws Exception {

// TODO code application logic here

String Host,Port,Username,Password,Database;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Nhap servername: ");

Host = br.readLine();

System.out.print("Nhap Username: ");

Username = br.readLine();

System.out.print("Nhap Password: ");

Password = br.readLine();

System.out.print("Nhap Port: ");

Port = br.readLine();

System.out.print("Nhap Database: ");

Database = br.readLine();

SQLConnection connect = new SQLConnection(Host, Port, Username, Password, Database);

//thuc thi cau lenh query

ResultSet result = connect.excuteQuery("select * from SinhVien");

while(result.next()) {

//duyet va in ra thong tin sau khi thýc thi cau lenh sql nhu o duoi thi in ra cot 1 va cot 2

System.out.println(result.getString(1) + " " +result.getInt(2));

}

result = connect.excuteQuery("select * from SinhVien");

//dem so dong sau khi da query dc

System.out.println(CountRow(result));

//dong ket noi co so du lieu

connect.Close();

}

protected static int CountRow(ResultSet result) throws SQLException
{

int count = 0;

//dem so hang trong result da query dc

while(result.next())
{

count++;
}


return count;

}

}
