public class Country {
	
	   public void language() {
	        System.out.println("English");   
	    }}
	 class Australia extends Country {
	 
	   
	 
	}

class Lebanon extends Country {

	     
	    @Override
	    public void language() {
	        System.out.println("Arabic");
	    }
	}
	 class Spain extends Country {
	 
	    
	    @Override
	    public void language() {
	        System.out.println("Spanish");
	    } }


	  class Main {

			public static void main(String[] args) {
				   
				        Australia au = new Australia();
				        Lebanon   lb = new Lebanon();
				        Spain     sp = new Spain();
				 
				    
				        au.language();
				        lb.language();
				        sp.language();}


			}
