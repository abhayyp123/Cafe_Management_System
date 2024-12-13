package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Report;

public interface ReportService {

    Report addReport(Report report);

    List<Report> getAllReports();

    Report getReportById(int reportId);

    Report updateReportById(int reportId, Report report);

    String deleteReportById(int reportId);

    List<Report> getReportsByType(String reportType);

    List<Report> getReportsByDate(String reportDate);

    List<Report> getReportsByGenerator(String generatedBy);
}
