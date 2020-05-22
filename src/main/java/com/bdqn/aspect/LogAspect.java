package com.bdqn.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author mo
 * @Description: 日志增强
 * @date 2020-05-22 17:59
 */

public class LogAspect {
    private static final Logger log = LogManager.getLogger(LogAspect.class);

    /**
     * 前置增强
     * @param joinPoint
     */
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("进入前置增强");
        //获取目标类
        String className = joinPoint.getTarget().getClass().getName();
        //获取 目标方法
        String methonName = joinPoint.getSignature().getName();
        log.info("调用：{} 中的 {} 方法", className, methonName);
        //获取参数
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            log.info("参数：{}",arg);
        }
    }

    /**
     * 后置返回增强
     * @param joinPoint
     * @param result
     */
    public void afterAdevice(JoinPoint joinPoint,Object result) {
        log.info("后置返回增强");
        log.info("目标方法返回结果 ：{}",result);
    }

    /**
     * 后置，也就是最终增强
     */
    public void finallyAdevice() {
        log.info("最终增强，也就是后置增强");
    }

    /**
     * 异常抛出增强，当异常发生的时候招我
     * @param e
     */
    public void afterThrowAdevice(Exception e) {
        log.info("异常抛出增强");
        log.error(e.getMessage(),e);
    }

    /**
     * 环绕增强，相当于前置和后置
     * @param joinPoint
     * @return
     */
    public Object aroudAdevice(ProceedingJoinPoint joinPoint) {
        log.info("开始环绕增强");
        Object result = null;
        try {
            result = joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("结束环绕增强");
        return result;
    }

}
