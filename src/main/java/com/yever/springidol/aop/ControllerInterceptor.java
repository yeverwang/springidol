package com.yever.springidol.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



/**
 * Created by yeverwang on 2017/5/29.
 */
@Component
@Aspect
public class ControllerInterceptor {
    private static final Logger logger= LoggerFactory.getLogger(ControllerInterceptor.class);
    @Pointcut("execution(* com.yever.springidol.contoller..*(..)) and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerPointcut() {
    }

    @Around("controllerPointcut()")
    public Object Interceptor(ProceedingJoinPoint pjp){
        long beginTime = System.currentTimeMillis();
        MethodSignature signature =(MethodSignature)pjp.getSignature();
        String methodName = signature.getMethod().getName();
        Object res = null;
        try {
            res = pjp.proceed();
        } catch (Throwable throwable) {
                logger.info("exception",throwable);
        }
        long endTime = System.currentTimeMillis();
        long cost = endTime-beginTime;
        logger.info("{} request end ,spend time {}ms",methodName,cost);
        return res;

    }

}