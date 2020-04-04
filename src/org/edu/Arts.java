package org.edu;

public class Arts extends Education{
	public void bsc() {
		// TODO Auto-generated method stub
	System.out.println("course name bsc");
	}

	public void bEd() {
		// TODO Auto-generated method stub
	System.out.println("course name is BEd");
	}

	public void bcom() {
		// TODO Auto-generated method stub
	System.out.println("course name is bcom");
	}

	public void bba() {
		// TODO Auto-generated method stub
	System.out.println("course name is bba");
	}
	
@Override
public void ug() {
	System.out.println("UG  courses changed");
}
	
@Override
public void pg() {
	System.out.println("PG courses changed");
}



public static void main(String[] args) {
	Arts a = new Arts();
	a.bba();
	a.bcom();
	a.ug();
	a.pg();
}
}
