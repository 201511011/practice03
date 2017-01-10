package prob06;

public class Add {
	int a;
    int b;
    
    public void setValue(String a, String b){
    	
    	this.a=Integer.parseInt(a);
    	this.b=Integer.parseInt(b);
    
    }
    public int Add(){
    	return a+b;
    }
}
