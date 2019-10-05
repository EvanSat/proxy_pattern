/***
 * 
 * CPSC 60000
 * Programming Assignment #6 - Proxy Pattern 
 * @author Evan Sabado
 *
 */

public class TestOutsideLights {
	
	public static void main(String[]args) {
		OutsideLights outsideLights = new OutsideLights();
		
		outsideLights.daytime();
		
		outsideLights.switchOn();
		
		outsideLights.nighttime();
		
		outsideLights.switchOn();
		
		outsideLights.daytime();
		
		outsideLights.switchOn();
		
		//GetOutsideLightState currentOutsideLights = new OutsideLights();
		
		GetOutsideLightState outsideLightProxy = new OutsideLightProxy();
		
		System.out.println("Outside light state is " + outsideLightProxy.getOutsideLightState());
		
	}
	
}
