package hello.aop.exam.internalcall;

import hello.aop.exam.internalcall.aop.CallLogAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest
class CallServiceV2Test {

    @Autowired
    CallServiceV2 callServiceV2;

    @Test
    void external() {
//        log.info("target={}", callServiceV0.getClass());
        callServiceV2.external();
    }

    @Test
    void internal() {
        callServiceV2.internal();
    }

}
