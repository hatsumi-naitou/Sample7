package sample;

public class Parent implements Human{
	
	//�P�������C���X�^���X�ŕ��c����������ƕێ�������ɂ́H
	
	public String name_;		//name_�̓C���X�^���X�ϐ�
	
	public Parent(String name){		//�C���X�^���X�ɕێ�������Ƃ���ƁHname_�Ɉ���name���Ăяo��
		this.name_ = name;
	}
	
	public String getName(){
		return this.name_;
	}
	
	public static void showType(){
		System.out.println("Parent");
	}
}

