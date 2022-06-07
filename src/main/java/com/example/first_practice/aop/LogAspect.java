package com.example.first_practice.aop;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Slf4j
@Aspect
public class LogAspect {

    //이 애노테이션을 붙인 메소드에서는 ProceedingJoinPoint 파라미터를 받을 수 있다.
    //애노테이션의 value를 "@annotation(LogExecutionTime)"로 지정함으로서
    //joinPoint는 @LogExecutionTime를 붙인 타겟 메소드를 의미하게 된다.
    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("request1");

        // @LogExecutionTime 애노테이션이 붙어있는 타겟 메소드를 실행
        Object proceed = joinPoint.proceed();

        stopWatch.stop();

        log.info(stopWatch.prettyPrint());

        return proceed; // 결과 리턴
    }
}
