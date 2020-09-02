package composite;

public class CompositeTester {

	public static void main(String[] args) {
		Employee CEO = new Employee("Caglar","CEO",20000);
		
		Employee headSales = new Employee("Cagatay","Head Sales", 10000);
		
		Employee headMarketing = new Employee("John", "Head Marketing", 5000);
		
		Employee clerk1 = new Employee("Laura","Marketing", 10000);
	    Employee clerk2 = new Employee("Bob","Marketing", 10000);
		
		Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
	    Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

	    CEO.add(headSales);
	    CEO.add(headMarketing);
	    
	    headSales.add(salesExecutive1);
	    headSales.add(salesExecutive2);
	    
	    headMarketing.add(clerk1);
	    headMarketing.add(clerk2);
	    
	    System.out.println(CEO);
	    
	    for(Employee headEmployee: CEO.getSubOrdinates() ) {
	    	System.out.println(headEmployee);
	    	for(Employee emp: headEmployee.getSubOrdinates()) {
	    		System.out.println(emp);
	    	}
	    }
	}
}
