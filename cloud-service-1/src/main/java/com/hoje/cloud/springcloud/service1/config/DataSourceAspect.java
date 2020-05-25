package com.hoje.cloud.springcloud.service1.config;

import com.hoje.cloud.springcloud.service1.inferface.DataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DataSourceAspect {

        @Pointcut("@annotaion(com.hoje.cloud.springcloud.service1.inferface.DataSource)")
        public void dataSourcePointCut(){

        }

        @Around("dataSourcePointCut()")
        public Object around(ProceedingJoinPoint point) throws Throwable{
            MethodSignature signature = (MethodSignature) point.getSignature();
            Method method = signature.getMethod();
            DataSource annotation = method.getAnnotation(DataSource.class);
            if(annotation==null){
                DynamicDataSource.setDataSource("master");
            }else{
                DynamicDataSource.setDataSource(annotation.name());
            }

            try {
                return point.proceed();
            }finally {
                DynamicDataSource.cleanDataSource();
            }
        }
}
