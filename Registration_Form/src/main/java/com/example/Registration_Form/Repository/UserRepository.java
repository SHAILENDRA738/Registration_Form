package com.example.Registration_Form.Repository;

import com.example.Registration_Form.Entity.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
}
