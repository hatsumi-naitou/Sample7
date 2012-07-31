package sample;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Integer devNum = Integer.getInteger(args[1]);
		Device device = null;
		switch(Integer.getInteger(args[0])){ //入力した値をかえってきた
		
		case 1:
			device.play();
			break;
		case 2:
			device.stop();
			break;			
		case 3:
			device.fastForward();
			break;
		case 4:
			device.rewind();
		break;
		}
	}
	
	public static Device getDevice(Integer num){
		Device dev = null;
		switch(num){
		case 0:     //このときにCD
			dev = new CD();
			break;
		case 1:     //このときにカセット
			dev = new Record();
			break;
		case 2:     //このときにブルーレイ
			dev = new BlueRay();
			break;
		case 3:
			dev = new Casette();
			break;
		}
		return dev;
	}
	
}
