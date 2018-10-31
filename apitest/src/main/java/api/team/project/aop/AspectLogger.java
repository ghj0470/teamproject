package api.team.project.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectLogger {
  private static final Logger logger = 
		  LoggerFactory.getLogger(AspectLogger.class);
  private long systemTime;
  //proceedingJoinPoint
  //joinpoint
  @Before("execution(*api.team.project.controller.*.*(..))")
  public void beforeLog(JoinPoint joinpoint) {
	  logger.debug("joinpoint=>{}",joinpoint);
	  systemTime = System.currentTimeMillis();
  }
  @Around("execution(*api.team.project.controller.*.*(..))")
  public Object aroundLog(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
	  String sigName = proceedingJoinPoint.getSignature().getName();
	  String targetName = proceedingJoinPoint.getTarget().toString();
	  Object[] params=proceedingJoinPoint.getArgs();
	  logger.debug("{}.{}({})",new Object[] {targetName,sigName,params});
	  Object obj = proceedingJoinPoint.proceed();
	  logger.debug("result=>{}",obj);
	  return obj;
  }
  @After("execution(*api.team.project.controller.*.*(..))")
  public void afterLog(JoinPoint jointPoint) {
	  logger.debug("end=>{}",jointPoint);
	  logger.debug("execution time =>{]ms",(System.currentTimeMillis()-systemTime));
  }
}
