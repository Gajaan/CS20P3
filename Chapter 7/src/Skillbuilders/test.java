package Skillbuilders;

public class test {



private String firstName;
private String lastName;
private String address;
private int stuID;

public test() // constructor method - it doesn't have a return time and exact same name as the class and public and has parenthesis an nothing is in it
{ firstName = "";
  lastName = "";
  address = "#####";
  stuID = 00000000;
	

}

public test(String f,String l, String ad, int ID) //overload constructor 

{firstName = f;
lastName = l;
address = ad;
stuID = ID;

	
}
public String getFirstName()
 {return firstName;
 
 }
 public String getlastName()
 {return lastName;
 
 }
 public String getaddress()
 {return address;
 
 }
 public int getstuId()
 {return stuID;
}
 
 //modifier methods
 public void setFirstName(String f)
 { firstName =f;
 }
 //modifier methods
 public void setlastName(String l)
 { lastName =l;
 
 }
 //modifier methods
 public void setaddress(String a)
 { address =a;
 
 }
 //modifier methods
 public void setstuID(int s)
 { stuID =s;
 
 
}
}