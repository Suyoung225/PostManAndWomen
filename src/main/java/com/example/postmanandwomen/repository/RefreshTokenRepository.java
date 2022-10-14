package com.example.postmanandwomen.repository;

import com.example.postmanandwomen.domain.Member;
import com.example.postmanandwomen.domain.RefreshToken;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
  Optional<RefreshToken> findByMember(Member member);
}
