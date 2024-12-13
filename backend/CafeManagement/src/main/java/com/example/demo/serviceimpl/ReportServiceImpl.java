package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Report;
import com.example.demo.repository.ReportRepository;
import com.example.demo.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public Report addReport(Report report) {
        return reportRepository.save(report);
    }

    @Override
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    @Override
    public Report getReportById(int reportId) {
        Optional<Report> report = reportRepository.findById(reportId);
        return report.orElse(null);
    }

    @Override
    public Report updateReportById(int reportId, Report report) {
        if (reportRepository.existsById(reportId)) {
            report.setReportId(reportId);
            return reportRepository.save(report);
        }
        return null;
    }

    @Override
    public String deleteReportById(int reportId) {
        if (reportRepository.existsById(reportId)) {
            reportRepository.deleteById(reportId);
            return "Report with ID " + reportId + " deleted successfully";
        }
        return "Report with ID " + reportId + " not found";
    }

    @Override
    public List<Report> getReportsByType(String reportType) {
        return reportRepository.findByReportType(reportType);
    }

    @Override
    public List<Report> getReportsByDate(String reportDate) {
        return reportRepository.findByReportDate(reportDate);
    }

    @Override
    public List<Report> getReportsByGenerator(String generatedBy) {
        return reportRepository.findByGeneratedBy(generatedBy);
    }
}
