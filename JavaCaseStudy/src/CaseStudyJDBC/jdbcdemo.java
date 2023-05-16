package CaseStudyJDBC;

public class jdbcdemo {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Connection con =DriverManager.getConnection();
			
			//Create Statement/Query
			
			//Statement stamt=con.CreateStatement();
			
			String s="Select book_no,title,sub_code,author from book_det1";
			String s1="select * from book_detl wHERE SUB_CODE='BIO';";
			String s2="select * from book_detl wHERE SUB_CODE='bio';";
			String s3="select * from book_detl wHERE SUB_CODE='Bio';";
			String s4="select * from book_detl where author='ian';";
			String s5="select * from book_detl where price>300;";
			String s6="select * from book_detl where price>250;";
			String s7="select * from book_detl where price<250;";
			String s8="select * from book_detl where price>300;";
			String s9="select * from book_detl where price between 300 and 700;";
			String s10="select * from book_detl where sub_code='phy' and price>300;";
			String s11="select * from book_detl where sub_code='phy' or price>300;";
			String s12="select * from book_detl where sub_code in('bio','mat');";
			
			
			//3.Execute Statement/Query 4.Store Data in Result Set
			
			//ResultSet rs=stamt.executeQuery(s);
			
			while(rs.next()) {
				
				String bid=rs.getString("book no");
				String tit=rs.getString("title");
				String scode=rs.getString("SubCode");
				String aut=rs.getString("author");
				String aut=rs.getString("publisher");
				String aut=rs.getString("status");
				String aut=rs.getString("yop");
				String aut=rs.getString("price");
			
				
				
				System.out.println(bid+" "+tit+" "+scode+" "+aut);
				
				
			}
			
			//5 Close Connection
			
			con.close();
			
			System.out.println("Statement Executed : Query executed.....");

		}

	}

