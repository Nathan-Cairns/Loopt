package SoftEng751.SoftEng751.testMethods;

public class LoopVar {

	public String name = "";
	public String transformedname = "";
	public int lowerbound;
	public int upperbound;
	public String boundsName = "";

	public LoopVar(String _name, int _lowerbound, int _upperbound){
		name = _name;
		lowerbound = _lowerbound;
		upperbound = _upperbound;
	}

	public String getName() {
		return this.name;
	}
}
