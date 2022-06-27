// org -> opentutorials -> iot -> Elevator, Security, Lighting 불러오기
// import를 사용하여 데이터타입(Elevator, Security, Lighting)만 입력할 수 있게 지정
import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;	
public class OkJavaGoInHomeInput {

	public static void main(String[] args) {
		// args : 매개변수 (parameter)
		String id = args[0]; // 문자열 변수지정
		String bright = args[1];
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(10); // MY APT 1004 -> Elevator callForUp stopFloor : 10
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); // MY APT 1004 -> Security off
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on(); // MY APT 1004 / Hall Lamp -> Lighting on
		//()명령어 : method
		Lighting floorLamp = new Lighting(id+" / Floor Lamp");
		floorLamp.on(); // MY APT 1004 / Floor Lamp -> Lighting on
		
		// 무드등 밝기 조절
		DimmingLights moodLamp = new DimmingLights(id+" / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		// moodlamp는 setBright method에 double 데이터를 입력받아 밝기 조절
		moodLamp.on();
	}

}
