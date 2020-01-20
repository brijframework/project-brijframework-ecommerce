package org.brijframework.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"spring-beans.xml","spring-servlet.xml","jasper-views.xml","spring-pdf-views.xml","spring-excel-views.xml"})
public class CollegeApplication {
   public static void main(String[] args) {
      SpringApplication.run(CollegeApplication.class, args);
      
   }
}