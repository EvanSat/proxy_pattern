
public class OutsideLightProxy implements GetOutsideLightState {

	public State getOutsideLightState() {

		OutsideLights outsideLights = new OutsideLights();
		
		return outsideLights.getOutsideLightState();
	}

}
