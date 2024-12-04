package mx.petcare.mascotas.petcareAPI.service;
import mx.petcare.mascotas.petcareAPI.model.Report;
import mx.petcare.mascotas.petcareAPI.repository.ReportRepository;
import mx.petcare.mascotas.petcareAPI.exception.ReportNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.List;


@Service
public class ReportService {

    private final ReportRepository reportRepository;

    
    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

   
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

   
    public Report getReportById(Long id) {
        return reportRepository.findById(id)
                .orElseThrow(() -> new ReportNotFoundException("Report not found with id: " + id));
    }

    
    public Report createReport(Report report) {
        return reportRepository.save(report);
    }

    
    public void deleteReport(Long id) {
        if (!reportRepository.existsById(id)) {
            throw new ReportNotFoundException("Cannot delete. Report not found with id: " + id);
        }
        reportRepository.deleteById(id);
    }
    

    public Page<Report> getReportsWithPagination(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("date").descending());
        return reportRepository.findAll(pageable);
    }

    public Page<Report> searchReportsByDescription(String description, int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("date").descending());
        return reportRepository.findByDescriptionContaining(description, pageable);
    }

    
}


