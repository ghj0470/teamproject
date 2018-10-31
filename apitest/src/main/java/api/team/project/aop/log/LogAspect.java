package api.team.project.aop.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAspect {
     
	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
	@Before("execution(*api.team.project.*Controller.*(..))")
    public void beforeLog(JoinPoint joinPoint) {
		logger.info("@Before=>{}",joinPoint);
	}
	@Around("execution(*api.team.project.*Controller.*(..))")
	public Object aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		logger.info("@Around start");
		logger.info("proceedingJoinPoint=>",proceedingJoinPoint);
		Object object = null;
		long startTime = System.currentTimeMillis();
		try {
			object = proceedingJoinPoint.proceed();
		}catch(Throwable e) {
			throw e;
		}
		long logTime = System.currentTimeMillis() - startTime;
		logger.info("@Around end, RunTime : {} ms",(logTime));
		return object;
		
	}
}
