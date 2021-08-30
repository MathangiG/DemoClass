package org.company;

public class CompanyInfo1 {
	public void companyDat() {
		System.out.println("COMPANY DETAILS");
		System.out.println("---------------");

	}
	public void companyName() {
		System.out.println("Company Name    : Infosys");
		
	}
	public void companyID() {
		System.out.println("Company ID      : 12345");		
		
	}
	public void companyAddress() {
		System.out.println("Company Adresss : Tambaram, Chennai");

	}
	public static void main(String[] args) {
		
		CompanyInfo1 comp = new CompanyInfo1();
		comp.companyDat();
		comp.companyID();
		comp.companyName();
		comp.companyAddress();

}
}