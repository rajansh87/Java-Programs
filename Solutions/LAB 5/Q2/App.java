class App extends LaundryTest  {
	
	
	public static void main(String args[]) {
		
		LaundryTest l1=new LaundryTest();

		try{
			
			l1.unfit("shirt");
		}
		
		catch(Pant e){
			
			e.printStackTrace();
		
		}

		catch(Shirt e){
			
			e.printStackTrace();
		}

		catch(Tshirt e){
		
			e.printStackTrace();
		}

		catch(Cloth e){
		
			e.printStackTrace();
		}
		
		finally{
		
			System.out.println("Last line of main");
		}
			
		

	}

	
	

}