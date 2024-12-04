package mx.petcare.mascotas.petcareAPI.repository;
import mx.petcare.mascotas.petcareAPI.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
    Page<Report> findByDescriptionContaining(String description, Pageable pageable);
}
