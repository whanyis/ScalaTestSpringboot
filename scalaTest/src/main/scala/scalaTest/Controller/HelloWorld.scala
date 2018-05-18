package scalaTest.Controller

import java.text.SimpleDateFormat
import java.util.Date
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import scalaTest.Service.UserServiceImp
import org.springframework.web.bind.annotation.RequestMethod
import scalaTest.Service.UserServiceImp

@ComponentScan
@Controller
@ResponseBody
class HelloWord @Autowired() (private val serviceImp : UserServiceImp){
  @RequestMapping(value = Array("/hello"), method = Array(RequestMethod.GET))
  def getTime : String =  "Hello World This Time is :" + (new SimpleDateFormat("yyyy-MM-dd")).format(new Date).toString()
  @RequestMapping(Array("/list"))
  def getLIst = serviceImp.findAll
}