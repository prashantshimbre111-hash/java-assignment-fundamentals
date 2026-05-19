package HasA1;

public class Test {
	
	public static void main(String [] args) {
		
		Vehicle v = new Vehicle();
		v.setVehiclename("Maruti Suzuki Ciaz Zxi+ Hybrid");
		v.setVehicleno("MH12 VX 2107");
		v.setFueltype("1.5 naturally asperated petrol eninge");
		
		Employee e = new Employee();
		e.setEmpid("12321");
		e.setEmpname("Prashant Shimbare");
		e.setEmpdept("Software Devlopment Engineering in Test");
		e.setEmpcity("pune");
		e.setVh(v);
		
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpdept());
		System.out.println(e.getEmpcity());
		System.out.println(e.getVh().getVehiclename());
		System.out.println(e.getVh().getVehicleno());
		System.out.println(e.getVh().getFueltype());
		
		
	}

}
