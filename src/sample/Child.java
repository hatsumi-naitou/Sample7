package sample;

public class Child implements Human {
	
	public String name_;
	

	public Child(String name){				//Childの定義
		this.name_ = name;
		
	}
	
	public String getName(){			//getChildNameの定義
		return this.name_ + "jr.";			//ここでname_は定義していないけれど、すでにもっていることがわかる。
	}
	
	public static void showType(){
		System.out.println("Child");
	}
	
	public Integer familyNumber(){
		return null;
				
	}
	
}
