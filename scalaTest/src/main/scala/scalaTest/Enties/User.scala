package scalaTest.Enties

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import scala.beans.BeanProperty
import java.util.Date
import org.springframework.format.annotation.DateTimeFormat
import javax.persistence.GeneratedValue


@Table(name = "users")
@Entity
class User {
  
  @Id
  @GeneratedValue
  @BeanProperty
  var id : Long = _
  
  @BeanProperty
  @DateTimeFormat(pattern="yyyy-MM-dd")
  var birthday : Date = _
  
  @BeanProperty
  var name : String = _
 
  @BeanProperty
  var telephone : String = _
}