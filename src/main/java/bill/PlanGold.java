package bill;

public class PlanGold implements Plan{
	double basiccost=49.95;
	double overchargepermin=0.45;
	double additionallinecost=14.50;
	double familydiscount=5;
	public PlanGold(){
	}
	public double getBasicCost() {
		// TODO Auto-generated method stub
		return basiccost;
	}

	public double getOverchargeCost() {
		// TODO Auto-generated method stub
		return overchargepermin;
	}

	public double getAdditionalLineCost() {
		// TODO Auto-generated method stub
		return additionallinecost;
	}

	public double getFamilyDiscountcost() {
		// TODO Auto-generated method stub
		return familydiscount;
	}
	
}
