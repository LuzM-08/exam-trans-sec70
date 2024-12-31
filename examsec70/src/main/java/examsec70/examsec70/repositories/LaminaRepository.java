package examsec70.examsec70.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import examsec70.examsec70.models.Lamina;

@Repository
public interface LaminaRepository extends JpaRepository<Lamina, Long> {

}