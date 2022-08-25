package tr.gov.adalet.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogYaratma {
	@AfterReturning(value = "execution(* tr.gov.adalet.dao.*.*(..))", returning = "sonuc")
	public void log(JoinPoint joinPoint, Object sonuc) {
		System.out.println("dao metodu çağırıldı. Sonuc:" + sonuc);
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(joinPoint.getSignature().getName());
	}
}
