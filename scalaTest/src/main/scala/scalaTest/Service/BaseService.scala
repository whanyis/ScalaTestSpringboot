package scalaTest.Service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import scala.reflect.ClassTag
import org.springframework.stereotype.Service
import java.util.List
import org.springframework.transaction.annotation.Transactional
import java.lang.Long

@Service
abstract class  BaseService[T: ClassTag] {
  @Autowired val jpaRepository : JpaRepository[T,Long] = null
  @Transactional
  def findAll[S <: T] : List[T] = jpaRepository.findAll
}