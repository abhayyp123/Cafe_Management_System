package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Report;
import com.example.demo.service.ReportService;

@RestController
@RequestMapping("api/CafeInventory/reports/")
@CrossOrigin(origins = "http://localhost:4200/")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public ResponseEntity<Report> addReport(@RequestBody Report report) {
        return new ResponseEntity<>(reportService.addReport(report), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Report> getAllReports() {
        return reportService.getAllReports();
    }

    @GetMapping("{reportId}")
    public ResponseEntity<Report> getReportById(@PathVariable("reportId") int reportId) {
        return new ResponseEntity<>(reportService.getReportById(reportId), HttpStatus.OK);
    }

    @PutMapping("{reportId}")
    public ResponseEntity<Report> updateReportById(@PathVariable("reportId") int reportId, @RequestBody Report report) {
        return new ResponseEntity<>(reportService.updateReportById(reportId, report), HttpStatus.OK);
    }

    @DeleteMapping("{reportId}")
    public ResponseEntity<String> deleteReportById(@PathVariable("reportId") int reportId) {
        return new ResponseEntity<>(reportService.deleteReportById(reportId), HttpStatus.OK);
    }

    @GetMapping("type/{reportType}")
    public List<Report> getReportsByType(@PathVariable("reportType") String reportType) {
        return reportService.getReportsByType(reportType);
    }

    @GetMapping("date/{reportDate}")
    public List<Report> getReportsByDate(@PathVariable("reportDate") String reportDate) {
        return reportService.getReportsByDate(reportDate);
    }

    @GetMapping("generator/{generatedBy}")
    public List<Report> getReportsByGenerator(@PathVariable("generatedBy") String generatedBy) {
        return reportService.getReportsByGenerator(generatedBy);
    }
}
