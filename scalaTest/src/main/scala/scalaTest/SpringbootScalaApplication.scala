package scalaTest
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
class SpringbootScalaApplication 

object SpringbootScalaApplication{
  def main(args : Array[String]){
    SpringApplication.run(classOf[SpringbootScalaApplication])
  }
}
