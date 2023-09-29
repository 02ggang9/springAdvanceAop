package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {


    // hello.aop.order 와 모든 하위 패키지
    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder(){} //pointcut signature

    // 클래스 이름 패턴이 *Service (왜냐하면 비지니스 로직이 시작할 때 트랜잭션을 달기 때문)
    @Pointcut("execution(* *..*Service.*(..)))")
    public void allService(){}

    //allOrder + allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {}

}
