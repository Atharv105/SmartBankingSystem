package com.smartbanking.repository;

// THIS IS HOW YOUR ENTITIES TALK TO THE DATABASE

/* In Spring Data JPA, repositories are interfaces
   because Spring generates the implementation
   dynamically using proxies. This supports
   abstraction, loose coupling, easier testing,
    and database independence.
 */
import com.smartbanking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
