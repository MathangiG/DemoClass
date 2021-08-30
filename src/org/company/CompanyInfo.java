package org.company;

public class CompanyInfo {
	private void companyName(String n1,String n2 ) {
		System.out.println("Company Name 1:"+n1+"\nCompany Name 2:"+n2);
	}
	private void companyName(String n3,String n4,String n5) {
		System.out.println("Company Name 3:"+n3+"\nCompany Name 4:"+n4+"\nCompany Name 5:"+n5);
	}
	private void sample() {
		System.out.println("Hi....");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName("TCS", "CTS");
		c.companyName("Infosys", "Wipro", "Covansys");
	}

}
