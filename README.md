# team17_weak4

Plan.java : 인터페이스 클래스.함수로는 기본요금,초과사용에따른 과금,회선추가,가족할인이 있다.

PlanGold.java : Plan 클래스를 상속한 골드등급 클래스. 변수로는 전역변수로 기본요금,1분당 초과 과금,추가회선에 따른    
                추가요금,가족할인금이 있다. 각 함수에는 리턴값으로 각각 함수 명에 맞는 변수를 리턴해준다.
                
PlanSilver.java : Plan 클래스를 상속한 실버등급 클래스. PlanGold클래스와 변수 의 갯수,함수명과 기능은 똑같고 금액의 차이만 있다.

Makebill.java : 고지서 클래스. 
               
                 1.전역변수로는 String형의 plan(Gold와 Silver 중 하나의 등급을 입력받는다.) 
                int형의 line(사용자의 회선수를 입력 받는다.)
                int형의 usage(사용자의 통화 사용량을 입력 받는다.) 
                Plan클래스의 인스턴스 planinfo(Plan 인스턴스를 생성할 때 PlanGold 또는 PlanSilver 인스턴스를 생성)
                
                 2.생성자 Makebill을 만들고 plan,line,usage 변수를 초기화 한다.
                Makebill 클래스는 Parameter로 plan,line,usage를 받는다. 만약 plan이 Gold 이면 PlanGold 인스턴스를 생성하고
                paln이 Silver이면 PlanSilver 인스턴스를 생성한다.
                
                 3.getBasicbill() : 해당 인스턴스의 기본요금을 리턴받는 함수.
                  getLinebill()  : parameter로 받은 line이 4개이상이면 해당 인스턴스의 추가요금에 따른 과금과 가족할인요금을                                                 더하고, 3개 이하라면 추가요금에 따른 과금만 리턴한다.
                  getOverchargeForUsage() : parameter로 받은 usage가 1000을 초과하면 초과 사용양에 따른 요금 방식을 적용하고 리턴한다.
                                            초과하지 않았다면 0을 리턴 한다.
                  familyDiscount() : 할인 요금 방식을 적용한 값을 리턴한다.
                  totalBill() : getBasicbill(),getLinebill(),getOverchargeForUsage()로 받은 값을 더한 후 리턴 한다.

App.java : 메인함수가 있는 클래스. Scanner클래스를 import하고 인스턴스를 만들어 사용자에게 plan,line,usage를 입력 받고, 변수로 선언한다.그 후,Makebill 클래스로 부터 인스턴스를 생성한후 parameter에는 사용자에게 입력받은 변수를 적용한다. 출력문을 써서 인스턴스의 totalBill()함수를 call 한다.
                
