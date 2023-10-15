package com.eugenedevv.calenderscheduler;

import com.eugenedevv.calenderscheduler.config.ContentCalendarProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {


/*
        String jdbcURL = "jdbc:mysql://localhost:3306/contentscheduler";
        try(Connection conn = DriverManager.getConnection(jdbcURL, "root", "test env password")){

            if(!conn.isValid(0)){
                System.out.println("Unable to connect to database");
                System.exit(0);
            }
            PreparedStatement preparedStatement = conn.prepareStatement("select * from run");
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                String title = rs.getNString("title");
                int miles = rs.getInt("miles");
                System.out.println(title+": "+miles);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        RestTemplate restTemplate = (RestTemplate)  context.getBean("restTemplate");
        System.out.println(restTemplate);
*/

        SpringApplication.run(Application.class, args);
    }

}
