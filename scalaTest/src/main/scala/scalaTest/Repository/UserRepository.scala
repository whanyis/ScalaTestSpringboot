package scalaTest.Repository

import org.springframework.data.jpa.repository.JpaRepository
import scalaTest.Enties.User
import java.lang.Long

trait UserRepository extends JpaRepository[User,Long]