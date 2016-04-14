package bill;

public class Makebill {
	String plan;
	int line;
	int usage;
	Plan planinfo;
	
	public Makebill(){
		this.plan = null;
		this.line = 0;
		this.usage = 0;
	}
	public Makebill(String plan, int line, int usage){
		this.plan = plan;
		this.line = line;
		this.usage = usage;
		
		if("Gold".equals(plan) ||"gold".equals(plan) ){
			planinfo=new PlanGold();
		} else if("Silver".equals(plan) ||"silver".equals(plan)){
			planinfo=new PlanSilver();
		} else {
			planinfo=new Nullplan();
		}
					            
	}
	
	
	/*
	 * 기본요금 리턴
	 */
	public double getBasicbill(){
		return planinfo.getBasicCost();
	}
	/*
	 * 회선별 추가요금 리턴
	 */
	public double getLinebill(){
		if(line<2){
			return 0;
		}else if(line>3){
			return planinfo.getAdditionalLineCost()*2+familyDiscount();
		}else{
			return planinfo.getAdditionalLineCost()*(line-1);
		}

	}
	/*
	 * 초과사용 요금 리턴
	 */
	public double getOverchargeForUsage(){
		if(usage>1000&&("Gold".equals(plan) ||"gold".equals(plan))){
		         return (usage-1000)*planinfo.getOverchargeCost();
		}else if(usage>500&&("Silver".equals(plan) ||"silver".equals(plan))){
				return (usage-500)*planinfo.getOverchargeCost();
		}
		else{
		         return 0;
		}
	}
	/*
	 * 가족할인 리턴
	 */
	public double familyDiscount(){
		 return (line-3)*planinfo.getFamilyDiscountcost();
	}
	/*
	 * 총 금액 리턴
	 */
	public double totalBill(){
		return getBasicbill()+getLinebill()+getOverchargeForUsage();
	}
}
