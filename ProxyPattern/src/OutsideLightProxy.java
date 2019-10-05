
public class OutsideLightProxy implements GetOutsideLightState {

	public State getOutsideLightState() {

		OutsideLights outsideLightsProx = new OutsideLights();
		
		return outsideLightsProx.getOutsideLightState();
	}

}
