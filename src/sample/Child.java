package sample;

public class Child implements Human {
	
	public String name_;
	

	public Child(String name){				//Child�̒�`
		this.name_ = name;
		
	}
	
	public String getName(){			//getChildName�̒�`
		return this.name_ + "jr.";			//������name_�͒�`���Ă��Ȃ�����ǁA���łɂ����Ă��邱�Ƃ��킩��B
	}
	
	public static void showType(){
		System.out.println("Child");
	}
	
	public Integer familyNumber(){
		return null;
				
	}
	
}
