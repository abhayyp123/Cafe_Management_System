package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {

    List<Report> findByReportType(String reportType);

    List<Report> findByReportDate(String reportDate);

    List<Report> findByGeneratedBy(String generatedBy);
}
